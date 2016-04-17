import java.util.*;

public class User {

    private String name;
    private List tweets = new ArrayList();
    private ArrayList subscriptions = new ArrayList();

    User(String name) {
        this.name = name;
    }

    String getUser() {
        return name;
    }

    void newTweet(String tweet) {
        boolean add = tweets.add(tweet);
    }

    List getTweets() {
        return tweets;
    }

    void subscribeToUser(String user) {
        if (!subscriptions.contains(user)) {
            subscriptions.add(user);
        }
    }

    List getSubscriptions() {
        return subscriptions;
    }

}