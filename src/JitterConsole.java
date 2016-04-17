import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.out;

public class JitterConsole {

    private Jitter jitter;
    private Scanner scanner;

    private String mainMenu = "enter a command:\n" +
            "\t [1] post a tweet\n" +
            "\t [2] see your personal timeline\n" +
            "\t [3] see all tweets (you + your subscriptions)\n" +
            "\t [4] view/add users\n" +
            "\t [5] log-out\n" +
            "\t [0] exit\n";

    private String userMenu = "User options:\n" +
            "\t [1] View a users timeline\n" +
            "\t [2] Subscribe to a user\n" +
            "\t [0] back\n";

    public JitterConsole(Jitter jitter, Scanner scanner) {
        this.jitter = jitter;
        this.scanner = scanner;
    }

    public void run() {
        hardCodeNikesh();
        initialSetup();
        runMainMenu();
    }

    // for demonstration purposes
    private void hardCodeNikesh() {
        User nikesh = new User("Nikesh", new Timeline(), new Subscriptions());
        nikesh.post("sunfish sunfish sunfish");
        jitter.addUser("Nikesh", nikesh);
    }
    //

    private void initialSetup() {
        out.println("Input user name:");
        String name = scanner.next();
        checkUser(name);
    }

    private void checkUser(String name) {
        if (Objects.equals(name, "Nikesh")) {
            out.println("Username taken, please try again");
            initialSetup();
        } else jitter.newUser(name);
    }

    private void runMainMenu() {
        while(scanner.hasNextLine()) {
            out.println(mainMenu);
            selectOption(scanner.next());
        }
    }

    private void selectOption(String command) {
        switch(command) {
            case "1": newPost(); break;
            case "2": printPosts(); break;
            case "3": printAllTweets(); break;
            case "4": usersMenu(); break;
            case "5": logOut(); break;
            case "0": System.exit(0);
        }
    }

    private void newPost() {
        out.print("Input message:\n");
        Scanner scanner = new Scanner(System.in);
        jitter.newPost(scanner.next());
    }

    private void printPosts() {
        List<Post> posts = jitter.getPosts();
        printSelectedPosts(posts);
    }

    private void printSelectedPosts(List<Post> posts) {
        for(Post post: posts) { out.print(post.getPost() + "\n"); }
    }

    private void printAllTweets() {}

    private void usersMenu() {
        printUsers();
        printUserMenu();
        String choice = scanner.next();
        switch(choice) {
            case "1": viewUser(); break;
            case "2": subscribeUser(); break;
            case "0": break;
        }
    }

    private void viewUser() {
        out.println("input user name:");
        String name = scanner.next();
        List<Post> posts = jitter.getOtherUserPosts(name);
        printSelectedPosts(posts);
    }

    private void printUserMenu() {
        out.println(userMenu);
    }

    private void subscribeUser() {

    }

    private void printUsers() {
        out.println("Current users: " + jitter.getUsernames());
    }

    private void logOut() {}

    public static void main(String args[]) {
        Users users = new Users();
        Jitter jitter = new Jitter(users);
        Scanner scanner = new Scanner(System.in);
        JitterConsole console = new JitterConsole(jitter, scanner);
        console.run();
    }
}
