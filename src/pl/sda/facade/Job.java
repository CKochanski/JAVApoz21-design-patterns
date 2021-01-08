package pl.sda.facade;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

public class Job {

    private final long id;
    private final ScheduledFuture<?> task;

    public Job(long id, ScheduledFuture<?> task) {
        this.id = id;
        this.task = task;
    }

    public long getId() {
        return id;
    }

    public ScheduledFuture<?> getTask() {
        return task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(task, job.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, task);
    }
}
