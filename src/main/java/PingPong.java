import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String index = request.queryParams("index");
      Integer integerIndex = Integer.parseInt(index);
      ArrayList<Object> isPingPong = isPingPong(integerIndex);

      model.put("isPingPong", isPingPong);
      model.put("index", request.queryParams("index"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

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
