import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/main.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/parcel", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      int height = Integer.parseInt(request.queryParams("height"));
      int width = Integer.parseInt(request.queryParams("width"));
      int length = Integer.parseInt(request.queryParams("length"));
      int weight = Integer.parseInt(request.queryParams("weight"));
      int distance = Integer.parseInt(request.queryParams("distance"));

    }

      Parcels myParcels = new Parcels(height, width, length, weight, distance);
      model.put("myParcels", myParcels);

      model.put("template", "templates/parcel.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
   }
}
