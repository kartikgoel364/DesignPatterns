package behavioral.visitor;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic for Single room");
        singleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic for Double room");
        doubleRoom.roomPrice = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Pricing computation logic for Deluxe room");
        deluxeRoom.roomPrice = 3000;
    }
}
