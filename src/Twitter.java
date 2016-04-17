
import java.util.*;

public class Twitter {

    private User user;
    private HashMap<String, User> users = new HashMap();




    private HashMap getUsers() {
        return users;
    }

    private void addUser(User user) {
        this.users.put(user.getUser(), user);
    }

    private void setCurrentUser(String newUser) {
        this.user = new User(newUser);
    }



    public static void main(String args[]) {

        Twitter twitter = new Twitter();

        }

    }


}