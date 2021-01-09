package pl.sda.facade;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

public class JobsRepository {

    private final Set<Job> jobs = new HashSet<>();

    public long add(ScheduledFuture<?> task) {
        long newId = getLastId() + 1;
        jobs.add(new Job(newId, task));
        return newId;
    }

    public ScheduledFuture<?> remove(long taskId) {
        Job existingJob = jobs.stream().filter(job -> job.getId() == taskId).findFirst().orElseThrow();
        jobs.remove(existingJob);
        return existingJob.getTask();
    }

    private long getLastId() {
        return jobs.stream().mapToLong(Job::getId).max().orElse(1L);
    }

    public Set<Job> getAll() {
        return jobs;
    }
}
