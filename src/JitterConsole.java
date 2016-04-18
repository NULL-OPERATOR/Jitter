import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.out;

public class JitterConsole {

    private Jitter jitter;
    private Scanner scanner;
    private MainMenu mainMenu;

    public JitterConsole(Jitter jitter, Scanner scanner) {
        this.jitter = jitter;
        this.scanner = scanner;
        this.mainMenu = new MainMenu(jitter, scanner);
    }

    public void run() {
        hardCodeNikesh();
        initialSetup();
        mainMenu.run();
    }

    // so that there is one user (Nikesh) already setup
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

    public static void main(String args[]) {
        Users users = new Users();
        Jitter jitter = new Jitter(users);
        Scanner scanner = new Scanner(System.in);
        JitterConsole console = new JitterConsole(jitter, scanner);
        console.run();
    }
}
