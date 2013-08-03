package controllers;

import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import sounds.Sounds;

import views.html.index;

public class Application extends Controller {

	static List<String> sounds = Sounds.getAll();
	
    public static Result index() {
        return ok(index.render(sounds));
    }
  
}
