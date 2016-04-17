import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Users {

    private HashMap users = new HashMap();

    public void add(String name, User user) {
        if(users.containsKey(name)) {
            users.replace(name, user);
        }
        else {
            users.put(name, user);
        }
    }

    public String getUsernames() {
        String names = "";
        for (Object key : users.keySet()) {
            names += (key.toString());
        }
        return names;
    }

    public User getUser(String user) {
        return (User) users.get(user);
    }


}
