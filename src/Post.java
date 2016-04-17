import java.util.Date;

public class Post {

    private String post, user;
    private Date date;

    public Post(String post, String user, Date date) {
        this.post = post;
        this.user = user;
        this.date = date;
    }

    public String getPost() {
        return date.toString() + ": " + user + " : " + post;
    }

    public Date getDate() {
        return date;
    }

}
