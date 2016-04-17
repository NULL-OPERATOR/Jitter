import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class JitterConsole {

    private Jitter jitter = new Jitter();

    String menu = "enter a command:\n" +
            "\t tweet      (post a tweet)\n" +
            "\t my-tweets  (see your personal timeline)\n" +
            "\t all-tweets (see all tweets)\n" +
            "\t users      (see a list of users)\n" +
            "\t log-out\n" +
            "\t exit\n";

    private void printMenu() {
        out.println("\nJitter 2.0");
        out.println("Logged in as: " + currentUser());
        out.println(menu);
    }

    private void hardcodeNikesh() {
        User nikesh = new User("Nikesh");
        nikesh.newTweet("sunfish sunfish sunfish");
        jitter.addUser(nikesh);
    }

    private void startupUser(String username) {
        jitter.setCurrentUser(username);
    }

    private String currentUser() {
        return jitter.getCurrentUser();
    }

    private void newTweet() {
        Scanner tweetScanner = new Scanner(System.in);
        String tweet = tweetScanner.next();
        jitter.newTweet(tweet);
    }

    private void printTweets() {
        jitter.
    }


    private void selectOption(String command) {
        switch(command) {
            case "tweet":
                newTweet();
                break;
            case "my-tweets":
                printTweets();
                break;
            case "all-tweets":
                jitter.printAllTweets();
                break;
            case "users":
                usersMenu();
                break;
            case "log-out":
                jitter.logOut();
                break;
            case "exit":
                System.exit(0);
        }
    }

    private void usersMenu() {
        List users = (List) jitter.getUsers();

    }

    public static void main(String args[]) {

        JitterConsole console = new JitterConsole();
        console.hardcodeNikesh();

        out.print("welcome to Java console Jitter\n");
        Scanner scanner = new Scanner(System.in);

        out.println("Input user name:\n");
        console.startupUser(scanner.next());

        while(scanner.hasNextLine()) {
            console.printMenu();
            console.selectOption(scanner.next());
        }


    }
}
