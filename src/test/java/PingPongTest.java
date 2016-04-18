import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {
  @Test
  public void isPingPong_countUpToGivenNumber_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    assertEquals(expected, testPingPong.isPingPong(2));
  }
  @Test
  public void isPingPong_forNumbersDivisiblebyThree_Array(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    assertEquals(expected, testPingPong.isPingPong(3));
  }
  @Test
  public void isPingPong_forNumbersDivisiblebyFive_Array(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    expected.add(4);
    expected.add("pong");
    assertEquals(expected, testPingPong.isPingPong(5));
  }
  @Test
  public void isPingPong_forNumbersDivisiblebyFifteen_Array(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(1);
    expected.add(2);
    expected.add("ping");
    expected.add(4);
    expected.add("pong");
    expected.add("ping");
    expected.add(7);
    expected.add(8);
    expected.add("ping");
    expected.add("pong");
    expected.add(11);
    expected.add("ping");
    expected.add(13);
    expected.add(14);
    expected.add("pingpong");
    assertEquals(expected, testPingPong.isPingPong(15));
  }
}
