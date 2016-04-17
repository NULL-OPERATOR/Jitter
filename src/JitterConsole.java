import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class JitterConsole {

    private Jitter jitter;

    private String mainMenu = "enter a command:\n" +
            "\t [1] post a tweet\n" +
            "\t [2] see your personal timeline\n" +
            "\t [3] see all tweets\n" +
            "\t [4] see a list of users\n" +
            "\t [5] log-out\n" +
            "\t [0] exit\n";

    private String userMenu = "User options:\n" +
            "\t [1] View user\n" +
            "\t [2] Subscribe user\n" +
            "\t [0] back\n";

    public JitterConsole(Jitter jitter) {
        this.jitter = jitter;
        setupNikesh(); //
    }

    private void printMenu() {
        out.println(mainMenu);
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

    private void usersMenu() {
        Scanner scanner = new Scanner(System.in);
        out.println("Current users:");
        out.println(jitter.getUsernames());
//        out.println("")
//        while()
    }

    private void setupNikesh() {
        User nikesh = new User("Nikesh", new Timeline(), new Subscriptions());
        nikesh.post("sunfish sunfish sunfish");
        jitter.addUser("Nikesh", nikesh);
    }
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
            case "1":
                newPost();
                break;
            case "2":
                printPosts();
                break;
//            case "3":
//                jitter.printAllTweets();
//                break;
            case "4":
                usersMenu();
                break;
//            case "5":
//                jitter.logOut();
//                break;
            case "0":
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
