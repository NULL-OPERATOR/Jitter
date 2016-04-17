import java.util.*;

public class User {

    private String name;
    private List tweets = new ArrayList();
    private List<String> subscriptions = new ArrayList();

    public static void main(String args[]) {

    }

    User(String name) {
        this.name = name;
    }

    String getUser() {
        return name;
    }

    void newTweet(String tweet) {
        tweets.add(tweet);
    }

    List getTweets() {
        return tweets;
    }

    void subscribeToUser(String user) {
        subscriptions.add(user);
    }

    List getSubscriptions() {
        return subscriptions;
    }

}