import java.util.Scanner;

public class TwitterConsole {

    Twitter twitter = new Twitter();

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


    public void selectOption(String command) {
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

        System.out.print("welcome to console java twitter\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input user name:\n");
        console.startupUser(scanner.next());

        while(true) {
            if (!(true)) break;
            System.out.println("\nTwitter 2.0");
            System.out.println("Logged in as: " + console.currentUser());
            System.out.println("enter a command:\n" +
                    "\t tweet      (post a tweet)\n" +
                    "\t my-tweets  (see your personal timeline)\n" +
                    "\t all-tweets (your tweets + followed users)\n" +
                    "\t users      (see a list of users)\n" +
                    "\t log-out\n" +
                    "\t exit\n");
            console.selectOption(scanner.next());
        }


    }
}
