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

    private User setupUser(String userName) {
        return new User(userName, new Timeline(), new Subscriptions());
    }












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

//
//    void newTweet(String tweet) {
//        user.newTweet(tweet);
//    }
//
//    List listTweets() {
//        List tweets = user.getTweets();
//        String name = user.getUsername();
//        for(Object tweet: tweets) {
//            System.out.println("\t" + name + ": " + tweet);
//        }
//    }


}