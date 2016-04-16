import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class PostTest {

    Posts posts = new Posts();
    @Before
    public void addPost() {
        posts.addPost("ah");
    }


    @Test
    public void outputs_posts() {
        List output = new ArrayList();
        output.add("ah");
        Assert.assertEquals(output, posts.getPosts());
    }

}