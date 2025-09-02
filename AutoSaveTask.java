public class AutoSaveTask extends Thread {
    private StudentManagementSystemImpl sms;

    public AutoSaveTask(StudentManagementSystemImpl sms) {
        this.sms = sms;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(60000); // 1 minute
                sms.saveToFile();
                System.out.println("[AutoSave] Student records saved automatically.");
            } catch (InterruptedException e) {
                System.out.println("AutoSave thread interrupted.");
                break;
            }
        }
    }
}
