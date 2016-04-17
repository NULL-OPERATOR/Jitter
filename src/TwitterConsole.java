import java.util.Scanner;

import static java.lang.System.out;

public class TwitterConsole {

    private Twitter twitter = new Twitter();

    String menu = "enter a command:\n" +
            "\t tweet      (post a tweet)\n" +
            "\t my-tweets  (see your personal timeline)\n" +
            "\t all-tweets (see all tweets)\n" +
            "\t users      (see a list of users)\n" +
            "\t log-out\n" +
            "\t exit\n";

    private void printMenu() {
        out.println("\nTwitter 2.0");
        out.println("Logged in as: " + currentUser());
        out.println(menu);
    }

    private void hardcodeNikesh() {
        User nikesh = new User("Nikesh");
        nikesh.newTweet("sunfish sunfish sunfish");
        twitter.addUser(nikesh);
    }

    private void startupUser(String username) {
        twitter.setCurrentUser(username);
    }

    private String currentUser() {
        return twitter.getCurrentUser();
    }


    private void selectOption(String command) {
        switch(command) {
            case "tweet":
                twitter.newTweet();
                break;
            case "my-tweets":
                twitter.printUserTweets();
                break;
            case "all-tweets":
                twitter.printAllTweets();
                break;
            case "users":
                twitter.listUsers();
                break;
            case "log-out":
                twitter.logOut();
                break;
            case "exit":
                System.exit(0);
        }
    }

    public static void main(String args[]) {

        TwitterConsole console = new TwitterConsole();

        console.hardcodeNikesh();

        out.print("welcome to console java twitter\n");
        Scanner scanner = new Scanner(System.in);

        out.println("Input user name:\n");
        console.startupUser(scanner.next());

        while(scanner.hasNextLine()) {
            console.printMenu();
            console.selectOption(scanner.next());
        }


    }
}
