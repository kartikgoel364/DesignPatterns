package behavioral.visitor;

public class DoubleRoom implements RoomElement {
    int roomPrice = 0;

    @Override
    public void accept(RoomVisitor roomVisitor) {
        roomVisitor.visit(this);
    }
}
