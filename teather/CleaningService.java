package teather;

public class CleaningService extends Employee{

    public CleaningService() {
        super("Steve", 2);
    }

    @Override
    public void startTheJob() {
        super.startTheJob();
        System.out.println("Ready to clean a room...");
    }
}
