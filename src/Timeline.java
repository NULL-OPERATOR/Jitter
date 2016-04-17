import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Timeline {

    private List posts = new ArrayList();

    public void add(String message, String name) {
        Date date = new Date();
        Post post = new Post(message, name, date);
        posts.add(post);
    }

    public List getPosts() {
        return posts;
    }
}