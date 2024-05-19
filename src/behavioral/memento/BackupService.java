package behavioral.memento;

import java.util.Stack;

public class BackupService {
    // contains all the states of a DB
    Stack<Snapshot> backupStack;

    public BackupService() {
      this.backupStack = new Stack<>();
    }

    public void takeBackup(Database database) {
      Snapshot snapshot = database.save();
      backupStack.push(snapshot);
    }

    public void restore(Database database) {
      if (!backupStack.empty()) {
          Snapshot lastSnapshot = backupStack.pop();
          // need to pass the lastSnapshot to restore the database i.e undo operation
          database.restore(lastSnapshot);
      } else {
          System.out.println("No backups available to restore");
      }
    }
}
