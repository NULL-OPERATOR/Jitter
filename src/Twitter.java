
import java.util.*;

public class Twitter {

    private User user;
    private HashMap<String, User> users = new HashMap();

    public void selectOption(String command) {
        switch(command) {
            case "tweet":
                newTweet();
                break;
            case "my-tweets":
                System.out.println("my tweets:\n");
                printUserTweets(user);
                break;
            case "all-tweets":
                printAllTweets();
                break;
            case "users":
                listUsers();
                break;
            case "sign-out":
                signOut();
                break;
            case "exit":
                System.exit(0);
        }

    }

    private void newTweet() {
        Scanner tweetScanner = new Scanner(System.in);
        System.out.println("Write message:\n");
        user.newTweet(tweetScanner.next());
    }

    private void printUserTweets(User user) {
        List tweets = user.getTweets();
        String name = user.getUser();
        for(Object tweet: tweets) {
            System.out.println("\t" + name + ": " + tweet);
        }
    }

    private HashMap getUsers() {
        return users;
    }

    private void addUser(User user) {
        this.users.put(user.getUser(), user);
    }

    private void setCurrentUser(String newUser) {
        this.user = new User(newUser);
    }

    private void printAllTweets() {
        // for loop using user subscribers
        // add all tweets to a list & sort by date/time
        // print all tweets with user name attached
    }
    private void listUsers() {
        // list users
        // list commands for users
    }
    private void userOptions() {
        // view users timeline
        // subscribe to user
        // go back to main menu
    }

    private void signOut() {
        // put user into users,
        // clear user
        // re-route to login
    }

    private void hardcodeNikesh() {
        User nikesh = new User("Nikesh");
        nikesh.newTweet("sunfish sunfish sunfish");
        twitter.addUser(nikesh);
    }


    public static void main(String args[]) {

        Twitter twitter = new Twitter();

        twitter.hardcodeNikesh();

        // setup scanner
        System.out.print("welcome to console java twitter\n");
        Scanner scanner = new Scanner(System.in);

        // add a sign in feature
        System.out.println("Input user name:\n");
        twitter.setCurrentUser(scanner.next());


        while(scanner.hasNextLine()) {
            System.out.println("\nTwitter 2.0");
            System.out.println("Logged in as: " + twitter.user.getUser());
            System.out.println("enter a command:\n" +
                    "\t tweet      (post a tweet)\n" +
                    "\t my-tweets  (see your personal timeline)\n" +
                    "\t all-tweets (see all tweets)\n" +
                    "\t users      (see a list of users)\n" +
                    "\t sign-out\n" +
                    "\t exit\n");
            twitter.selectOption(scanner.next());
        }


    }


}