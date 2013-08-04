package controllers;

import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import sounds.Sounds;

import views.html.index;

public class Application extends Controller {
	
    public static Result index() {
		List<String> sounds = Sounds.get10();
        return ok(index.render(sounds));
    }
  
}
