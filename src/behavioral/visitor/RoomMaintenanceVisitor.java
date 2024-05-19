package behavioral.visitor;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Room Maintenance for Single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Room Maintenance for Double room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Room Maintenance for Deluxe room");
    }
}
