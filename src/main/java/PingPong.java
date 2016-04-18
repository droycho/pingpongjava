import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class PingPong {
  public static void main(String[] args) {}

  public static ArrayList<Object> isPingPong(Integer num) {
    ArrayList<Object> pingPongArray = new ArrayList<Object>();
    String ping = "ping";
    String pong = "pong";
    String pingpong = "pingpong";
    for (Integer index = 1; index <= num; index++)
     {
      if(index % 15 == 0){
        pingPongArray.add(pingpong);
      } else if (index % 5 == 0){
        pingPongArray.add(pong);
      } else if (index % 3 == 0){
        pingPongArray.add(ping);
      } else {
        pingPongArray.add(index);
      }
    }
    return pingPongArray;
  }
}
