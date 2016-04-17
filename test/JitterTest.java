//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//
//public class JitterTest {
//
//    private ByteArrayOutputStream outStream = new ByteArrayOutputStream();
//
//    Jitter jitter = new Jitter();
//
//    @Before
//    public void setup_user() {
//        User ham = new User("ham");
//        ham.newTweet("holo");
//        jitter.addUser(ham);
//        System.setOut(new PrintStream(outStream));
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//    }
//
//    @Test
//    public void can_write_a_tweet() {
//
//    }
//
//    @Test
//    public void prints_the_users_tweets() {
//        jitter.printUserTweets();
//    }
//
//
//
//}