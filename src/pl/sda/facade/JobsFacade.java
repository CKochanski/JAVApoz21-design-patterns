package pl.sda.facade;

import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class JobsFacade {

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final JobsRepository jobsRepository = new JobsRepository();

    public long schedule(long period) {
        ScheduledFuture<?> scheduledTask = scheduler.scheduleAtFixedRate(someTask(), 1L, period, TimeUnit.SECONDS);
        return jobsRepository.add(scheduledTask);
    }

    public void unschedule(long id) {
        ScheduledFuture<?> future = jobsRepository.remove(id);
        future.cancel(true);
    }

    public Set<Job> getScheduledJobs() {
        return jobsRepository.getAll();
    }

    private Runnable someTask() {
        return () -> System.out.println("Task");
    }
}
