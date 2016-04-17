import java.util.*;

public class Jitter {

    private User user;
    private Users users;

    public Jitter(Users users) { this.users = users; }

    public String getUsernames() { return users.getUsernames(); }

    public void newUser(String userName) {
        User user = setupUser(userName);
        users.add(userName, user);
        this.user = user;
    }

    public void addUser(String userName, User user) {
        users.add(userName, user);
    }

    public void newPost(String message) {
        user.post(message);
    }

    public List getPosts() {
        return user.getPosts();
    }

    public List getOtherUserPosts(String user) {
        User otherUser = users.getUser(user);
        return otherUser.getPosts();
    }

    public void userSubscribe(String user) {
        user.subscribe(user);
    }

    private User setupUser(String userName) {
        return new User(userName, new Timeline(), new Subscriptions());
    }


}