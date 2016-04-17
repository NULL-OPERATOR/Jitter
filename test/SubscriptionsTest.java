import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.Object;

import static org.junit.Assert.*;

public class SubscriptionsTest {

    Subscriptions subscriptions = new Subscriptions();

    @Test
    public void adding_subscription() throws Exception {
        subscriptions.add("Nikesh");
//        Assert.assertArrayEquals(Object(["Nikesh"]), subscriptions.getSubscriptions());
    }

    @Test
    public void getSubscriptions() throws Exception {

    }

}