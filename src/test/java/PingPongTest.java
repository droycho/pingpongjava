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
  // @Test
  // public void isPingPong_forNumbersDivisiblebyThree_Array(){
  //   PingPong testPingPong = new PingPong();
  //   ArrayList<Object> expected = new ArrayList<Object>();
  //   expected.add(1);
  //   expected.add(2);
  //   expected.add("ping");
  //   assertEquals(expected, testPingPong.isPingPong(3));
  // }
  // @Test
  // public void isPingPong_forNumbersDivisiblebyFive_Array(){
  //   PingPong testPingPong = new PingPong();
  //   ArrayList<Object> expected = new ArrayList<Object>();
  //   expected.add(1);
  //   expected.add(2);
  //   expected.add("ping");
  //   expected.add(4);
  //   expected.add("pong");
  //   assertEquals(expected, testPingPong.isPingPong(5));
  // }
  // @Test
  // public void isPingPong_forNumbersDivisiblebyFifteen_Array(){
  //   PingPong testPingPong = new PingPong();
  //   ArrayList<Object> expected = new ArrayList<Object>();
  //   expected.add(1);
  //   expected.add(2);
  //   expected.add("ping");
  //   expected.add(4);
  //   expected.add("pong");
  //   expected.add("ping");
  //   expected.add(7);
  //   expected.add(8);
  //   expected.add("ping");
  //   expected.add("pong");
  //   expected.add(11);
  //   expected.add("ping");
  //   expected.add(13);
  //   expected.add(14);
  //   expected.add("pingpong");
  //   assertEquals(expected, testPingPong.isPingPong(15));
  // }
  // @Test
  // public void isPingPong_forNumberLessThanThree_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, pingPong.isPingPong(2))
  // }
  // @Test
  // public void isPingPong_forNumbersDivisibleByThree_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, pingPong.isPingPong(3))
  // }
  // @Test
  // public void isPingPong_forNumbersNotDivisibleByThree_false() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(false, pingPong.isPingPong(7))
  // }
  // @Test
  // public void isPingPong_forNumbersDivisiblebyFive_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, pingPong.isPingPong(10))
  // }
  // @Test
  // public void isPingPong_forNumbersNotDivisibleByFive_false() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(false, pingPong.isPingPong(4))
  // }
  // @Test
  // public void isPingPong_forNumbersDivisibleByThreeAndFive_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, pingPong.isPingPong(15))
  // }
  // @Test
  // public void isPingPong_forNumbersNotDivisibleByThreeAndFive_false() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(false, pingPong.isPingPong(16))
  // }
}
