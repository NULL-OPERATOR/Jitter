
import java.util.*;

public class Twitter {

    private User user;
    private HashMap users = new HashMap();


    void newTweet() {
        Scanner tweetScanner = new Scanner(System.in);
        System.out.println("Write message:\n");
        user.newTweet(tweetScanner.next());
    }

    void printUserTweets() {
        System.out.println("my tweets:\n");
        List tweets = user.getTweets();
        String name = user.getUsername();
        for(Object tweet: tweets) {
            System.out.println("\t" + name + ": " + tweet);
        }
    }

    public HashMap getUsers() {
        return users;
    }

    void addUser(User user) {
        this.users.put(user.getUsername(), user);
    }

    void setCurrentUser(String newUser) {
        this.user = new User(newUser);
    }

    String getCurrentUser() { return user.getUsername(); }

    void printAllTweets() {
        // for loop using user subscribers
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

}