package pl.sda.facade;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JobsFacade jobsFacade = new JobsFacade();

        long scheduledJobId = jobsFacade.schedule(1L);

        System.out.println(jobsFacade.getScheduledJobs());
        Thread.sleep(3000L);

        jobsFacade.unschedule(scheduledJobId);
    }
}
