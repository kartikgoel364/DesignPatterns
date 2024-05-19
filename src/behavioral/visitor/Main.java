package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        DeluxeRoom deluxeRoom = new DeluxeRoom();

        // RoomPricingVisitor
        RoomPricingVisitor roomPricingVisitor = new RoomPricingVisitor();

        singleRoom.accept(roomPricingVisitor);
        System.out.println(singleRoom.roomPrice);

        doubleRoom.accept(roomPricingVisitor);
        System.out.println(doubleRoom.roomPrice);

        deluxeRoom.accept(roomPricingVisitor);
        System.out.println(deluxeRoom.roomPrice);

        // RoomMaintenanceVisitor
        RoomMaintenanceVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();

        singleRoom.accept(roomMaintenanceVisitor);
        doubleRoom.accept(roomMaintenanceVisitor);
        deluxeRoom.accept(roomMaintenanceVisitor);
    }
}
