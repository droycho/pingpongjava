import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {
  @Test
  public void isPingPong_countUpToGivenNumber_Array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    assertEquals(expected, testPingPong.pingPong(2));
  }

  @Test
  public void isPingPong_forNumberLessThanThree_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, pingPong.isPingPong(2))
  }
  @Test
  public void isPingPong_forNumbersDivisibleByThree_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, pingPong.isPingPong(3))
  }
  @Test
  public void isPingPong_forNumbersNotDivisibleByThree_false() {
    PingPong testPingPong = new PingPong();
    assertEquals(false, pingPong.isPingPong(7))
  }
  @Test
  public void isPingPong_forNumbersDivisiblebyFive_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, pingPong.isPingPong(10))
  }
  @Test
  public void isPingPong_forNumbersNotDivisibleByFive_false() {
    PingPong testPingPong = new PingPong();
    assertEquals(false, pingPong.isPingPong(4))
  }
  @Test
  public void isPingPong_forNumbersDivisibleByThreeAndFive_true() {
    PingPong testPingPong = new PingPong();
    assertEquals(true, pingPong.isPingPong(15))
  }
  @Test
  public void isPingPong_forNumbersNotDivisibleByThreeAndFive_false() {
    PingPong testPingPong = new PingPong();
    assertEquals(false, pingPong.isPingPong(16))
  }
}
