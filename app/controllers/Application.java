package controllers;

import java.util.List;

import langs.Language;

import play.mvc.Controller;
import play.mvc.Result;
import sounds.Sounds;

import views.html.index;

public class Application extends Controller {
	
    public static Result index() {
		List<String> sounds = Sounds.get10();
		String lang = session("lang");
		if(Language.exists(lang)){
	        return ok(index.render(sounds,lang));
		}else{
			return ok(index.render(sounds,"en"));
		}
    }
    
    public static Result changeLanguage(String language){
    	session("lang",language);
    	return redirect(routes.Application.index());
    }
  
}
