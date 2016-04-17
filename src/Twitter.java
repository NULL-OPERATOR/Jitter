
import java.util.*;

public class Twitter {

    private User user;
    private HashMap<String, User> users = new HashMap();

    public void selectOption(String command) {
        switch(command) {
            case "tweet":
                newTweet();
                break;
            case "my tweets":
                printUserTweets();
                break;
            case "all tweets":
                printAllTweets();
                break;
            case "users":
                listUsers();
                break;
            case "sign out":
                signOut();
                break;
            case "exit":
                System.exit(0);
        }

    }

    private void newTweet() {
    }

    public static void main(String args[]) {

        Twitter twitter = new Twitter();

        //add nikesh
        User nikesh = new User("Nikesh");
        nikesh.newTweet("sunfish sunfish sunfish");
        twitter.addUser(nikesh);


        while(scanner.hasNextLine()) {
            System.out.println("Logged in as: " + twitter.user.getUser());
            System.out.println("enter a command:\n" +
                    "\t tweet      (post a tweet)\n" +
                    "\t my tweets  (see your personal timeline)\n" +
                    "\t all tweets (see all tweets)\n" +
                    "\t users      (see a list of users)\n" +
                    "\t sign out\n" +
                    "\t exit\n");
            twitter.selectOption(scanner.next());
        }


    }


}