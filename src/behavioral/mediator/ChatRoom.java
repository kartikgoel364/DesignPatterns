package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> userList;

    public ChatRoom() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(User user, String message) {
      for(User otherUser : this.userList) {
          // Message should not be received by the user sending it
       if (otherUser != user) {
         otherUser.send(message);
       }
      }
    }

    @Override
    public void addUser(User user) {
      this.userList.add(user);
    }
}
