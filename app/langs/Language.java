package langs;

import java.util.ArrayList;
import java.util.List;

public class Language {

	public static List<String> list(){
		List<String> languages = new ArrayList<String>();
		languages.add("en");
		languages.add("fr");
		languages.add("ja");
		return languages;
	}
	
	public static boolean exists(String language){
		if(language!=null){
			List<String> languages = list();
			int i = 0;
			while(i<languages.size()){
				if(languages.get(i).equals(language)){
					return true;
				}
				i++;
			}
		}
		return false;
	}

	public static String set(String language,String content){
		switch(language){
		case "en":
			switch(content){
			case "name":
				return "English";
			case "title":
				return "Here you can test your understanding of Chinese syllables";
			case "not-supported":
				return "Your browser does not support the audio tag.";
			case "show":
				return "Show anwser";
			case "showall":
				return "Show all anwsers";
			case "hideall":
				return "Hide all anwsers";
			case "again":
				return "Do it again";
			case "play-exp":
				return "Play the syllable you want : (type sha4, le5 or bian1 for example)";
			case "go":
				return "GO!";
			case "warning":
				return "If you ever experience any problem, just use Mozilla Firefox.";
			default:
				return "ERROR content";
			}
		case "fr":
			switch(content){
			case "name":
				return "Français";
			case "title":
				return "Vous pouvez ici tester votre compréhension des syllabes chinoises";
			case "not-supported":
				return "Votre browser ne supporte pas le tag audio. Autrement dit, il pue. Changez-en et utilisez Mozilla Firefox !";
			case "show":
				return "Montrer la réponse";
			case "showall":
				return "Montrer toutes les réponses";
			case "hideall":
				return "Cacher toutes les réponses";
			case "again":
				return "Recommencer";
			case "play-exp":
				return "Ecoutez la syllabe que vous voulez : (écrivez sha4, le5 ou bian1 par exemple)";
			case "go":
				return "GO !";
			case "warning":
				return "Si vous avez un quelconque problème, passez juste à Mozilla Firefox.";
			default:
				return "ERROR content";
			}
		case "ja":
			switch(content){
			case "name":
				return "日本語";
			case "title":
				return "このページで、中国語の発音の認識を試すことが出来ます。";
			case "not-supported":
				return "あなたのブラウザーはダメなんだよ！古いじゃん!";
			case "show":
				return "答えを表示";
			case "showall":
				return "答えを全員表示";
			case "hideall":
				return "答えを全員隠す";
			case "again":
				return "またやろう";
			case "play-exp":
				return "中国語に存在する音を聞こう (sha4かle5、bian1なんかを書いて下さい)";
			case "go":
				return "聞く";
			case "warning":
				return "何か問題があれば、Mozilla Firefoxを使っていいですよ。";
			default:
				return "ERROR content";
			}
		default:
			return "ERROR language";
		}
	}
}
