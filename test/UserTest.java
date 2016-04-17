import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    User spike = new User("spike");

    @Test
    public void user_name_is_stored() {
        Assert.assertEquals("spike", spike.getUser());
    }

    @Test
    public void posts_a_new_tweet() {
        spike.newTweet("ugh");
        List output = new ArrayList();
        output.add("ugh");
        Assert.assertEquals(output, spike.getTweets());
    }

    @Test
    public void keeps_a_list_of_subscriptions() {
        spike.subscribeToUser("Nikesh");
        List output = new ArrayList();
        output.add("Nikesh");
        Assert.assertEquals(output, spike.getSubscriptions());
    }

}