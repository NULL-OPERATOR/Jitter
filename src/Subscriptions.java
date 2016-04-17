import java.util.ArrayList;
import java.util.List;

public class Subscriptions {

    private ArrayList subscriptions = new ArrayList();


    public void add(String user) {
        if (!subscriptions.contains(user)) {
            subscriptions.add(user);
        }

    }

    public List getSubscriptions() {
        return subscriptions;
    }



}
