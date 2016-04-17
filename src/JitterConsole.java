import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class JitterConsole {

    private Jitter jitter;

    private String menu = "enter a command:\n" +
            "\t tweet      (post a tweet)\n" +
            "\t my-tweets  (see your personal timeline)\n" +
            "\t all-tweets (see all tweets)\n" +
            "\t users      (see a list of users)\n" +
            "\t log-out\n" +
            "\t exit\n";

    public JitterConsole(Jitter jitter) {
        this.jitter = jitter;
    }

    private void printMenu() {
        out.println("\nJitter 2.0");
        out.println("Logged in as: " + currentUser());
        out.println(menu);
    }

    private String currentUser() {
        return jitter.getUser();
    }

    private void setUser(String username) {
        jitter.newUser(username);
    }

    private void newPost() {
        out.print("Input post message:\n");
        Scanner scanner = new Scanner(System.in);
        jitter.newPost(scanner.next());
    }

    private void printPosts() {
        List<Post> posts = jitter.getPosts();
        for(Post post: posts) {
            out.print(post.getPost() + "\n");
        }
    }

//    private void hardcodeNikesh() {
//        User nikesh = new User("Nikesh");
//        nikesh.newTweet("sunfish sunfish sunfish");
//        jitter.addUser(nikesh);
//    }
//

//

//
//    private void newTweet() {
//        Scanner tweetScanner = new Scanner(System.in);
//        String tweet = tweetScanner.next();
//        jitter.newTweet(tweet);
//    }

//    private void printTweets() {
////        jitter.
//    }


    private void selectOption(String command) {
        switch(command) {
            case "tweet":
                newPost();
                break;
            case "my-tweets":
                printPosts();
                break;
//            case "all-tweets":
//                jitter.printAllTweets();
//                break;
//            case "users":
//                usersMenu();
//                break;
//            case "log-out":
//                jitter.logOut();
//                break;
            case "exit":
                System.exit(0);
        }
    }

//    private void usersMenu() {
//        List users = (List) jitter.getUsers();
//
//    }

    public static void main(String args[]) {

        Users users = new Users();
        Jitter jitter = new Jitter(users);
        JitterConsole console = new JitterConsole(jitter);
//        console.hardcodeNikesh();

        out.print("welcome to Java console Jitter\n");
        Scanner scanner = new Scanner(System.in);
        out.println("Input user name:\n");
        console.setUser(scanner.next());

        while(scanner.hasNextLine()) {
            console.printMenu();
            console.selectOption(scanner.next());
        }


    }
}
