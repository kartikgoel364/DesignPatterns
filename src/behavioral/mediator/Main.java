package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Tom");
        User user4 = new ChatUser(chatRoom, "Jerry");
        User user5 = new ChatUser(chatRoom, "Diana");
        User user6 = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);
        chatRoom.addUser(user5);
        chatRoom.addUser(user6);

        user4.send("Message by Jerry!!");
    }
}
