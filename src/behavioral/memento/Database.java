package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<String> records;

    public Database() {
      records = new ArrayList<>();
    }

    public void addRecord(String record) {
      records.add(record);
    }

    public void removeRecord(String record) {
        records.remove(record);
    }

    public Snapshot save() {
        return new Snapshot(records);
    }

    public void restore(Snapshot lastSnapshot) {
      records = lastSnapshot.getState();
    }

    public List<String> getRecords() {
        return records;
    }
}
