import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User spike = new User("spike");
    private List output = new ArrayList();


    @Test
    public void user_name_is_stored() {
        assertEquals("spike", spike.getUser());
    }

    @Test
    public void posts_a_new_tweet() {
        spike.newTweet("ugh");
        output.add("ugh");
        assertEquals(output, spike.getTweets());
    }

    @Test
    public void keeps_a_list_of_subscriptions() {
        spike.subscribeToUser("Nikesh");
        output.add("Nikesh");
        assertEquals(output, spike.getSubscriptions());
    }

    @Test
    public void doesnt_add_duplicate_subscriptions() {
        spike.subscribeToUser("Nikesh");
        spike.subscribeToUser("Nikesh");
        output.add("Nikesh");
        assertEquals(output, spike.getSubscriptions());
    }

}