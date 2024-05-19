package behavioral.visitor;

public interface RoomElement {
    public void accept(RoomVisitor roomVisitor);
}
