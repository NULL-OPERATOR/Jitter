import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Users {

    private HashMap users = new HashMap();

    public void add(String name, User user) {
        users.put(name, user);
    }

    public List getUsernames() {
        List names = new ArrayList();
        for (Object key : users.keySet()) {
            names.add(key.toString());
        }
        return names;
    }

    public User getUser(String user) {
        return (User) users.get(user);
    }

}
