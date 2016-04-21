import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/allergy-list", (request, response) -> {
    	Map<String, Object> model = new HashMap<String, Object>();
    	model.put("template", "templates/allergy-list.vtl");

      Allergen newAllergen = new Allergen();
      Integer score = Integer.parseInt(request.queryParams("score"));
      ArrayList<String> allergenList = newAllergen.listAllergies(score);

      model.put("allergenList", allergenList);

    	
    	return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

	}
}