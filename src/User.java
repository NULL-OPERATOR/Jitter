import java.util.*;

public class User {

    private String name;
    private Timeline timeline;
    private Subscriptions subscriptions;

    public User(String name, Timeline timeline, Subscriptions subscriptions) {
        this.name = name;
        this.timeline = timeline;
        this.subscriptions = subscriptions;
    }

    public String getName() {
        return name;
    }

    public void post(String post) {
        timeline.add(post, name);
    }

    public List getPosts() {
        return timeline.getPosts();
    }

    public void subscribe(String user) {
        subscriptions.add(user);
    }

    public List getSubscriptions() {
        return subscriptions.getSubscriptions();
    }
}