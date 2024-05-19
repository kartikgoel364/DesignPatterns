package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        BackupService backupService = new BackupService();

        // Add record and take backup
        database.addRecord("Record 1");
        backupService.takeBackup(database);
        System.out.println("After adding Record 1: " + database.getRecords());

        // Add record and take backup
        database.addRecord("Record 2");
        backupService.takeBackup(database);
        System.out.println("After adding Record 2: " + database.getRecords());

        database.addRecord("Record 3");
        // Not doing the backup as we'll be start restoring it's previous states
        System.out.println("After adding Record 3: " + database.getRecords());

        // Restore to previous state
        backupService.restore(database);
        System.out.println("After first restore: " + database.getRecords());

        // Restore to previous state
        backupService.restore(database);
        System.out.println("After second restore: " + database.getRecords());

        // Restore to previous state
        backupService.restore(database);
        System.out.println("After third restore: " + database.getRecords());
    }
}
