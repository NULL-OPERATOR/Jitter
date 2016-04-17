import java.util.*;

public class Jitter {

    private User user;


    void newUser(String newUser) {
        this.user = new User(newUser);
    }

    String getCurrentUser() { return user.getName(); }

    void printAllTweets() {
        // for each user subscription
        // add all tweets to a list & sort by date/time
        // print all tweets with user name attached
    }
    void listUsers() {
        // list users
        // list commands for users
    }
    private void userOptions() {
        // view users timeline
        // subscribe to user
        // go back to main menu
    }

    void logOut() {
        // put user into users,
        // clear user
        // re-route to login
    }


    void newTweet(String tweet) {
        user.newTweet(tweet);
    }

    List listTweets() {
        List tweets = user.getTweets();
        String name = user.getUsername();
        for(Object tweet: tweets) {
            System.out.println("\t" + name + ": " + tweet);
        }
    }


}