package behavioral.mediator;

public class ChatUser extends User {

    public ChatUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message = " + message);
        chatMediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Received Message = " + message);
    }
}
