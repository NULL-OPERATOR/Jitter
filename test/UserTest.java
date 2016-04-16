import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void user_is_created() {
        User spike = new User("spike");
        Assert.assertEquals("spike", spike.getUser());
    }

}