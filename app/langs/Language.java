package langs;

import java.util.ArrayList;
import java.util.List;

public class Language {

	public static List<String> list(){
		List<String> languages = new ArrayList<String>();
		languages.add("en");
		languages.add("fr");
		languages.add("ja");
		languages.add("zh");
		languages.add("es");
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
				return "Votre navigateur web ne supporte pas le tag audio. Autrement dit, il pue. Changez-en et utilisez Mozilla Firefox !";
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
				return "ここでは、あなたの中国語の音節の理解度を試すことが出来ます。";
			case "not-supported":
				return "あなたのブラウザはダメなんだよ！古いじゃん!";
			case "show":
				return "答えを表示";
			case "showall":
				return "答えを全て表示";
			case "hideall":
				return "答えを全て非表示";
			case "again":
				return "もう一度";
			case "play-exp":
				return "中国語の音を聞こう (sha4かle5、bian1などを書いて下さい)";
			case "go":
				return "聞く";
			case "warning":
				return "問題がある場合は、Mozilla Firefoxを推奨します。";
			default:
				return "ERROR content";
			}
		case "zh":
			switch(content){
			case "name":
				return "中文";
			case "title":
				return "您可以在此测试和学习拼音";
			case "not-supported":
				return "您的浏览器不支持音频";
			case "show":
				return "显示答案";
			case "showall":
				return "显示所有答案";
			case "hideall":
				return "隐藏所有答案";
			case "again":
				return "再来一次";
			case "play-exp":
				return "输入您想听到的发音：（例如 sha4，le5）";
			case "go":
				return "开始";
			case "warning":
				return "如果您有任何问题，请尝试使用火狐浏览器。";
			default:
				return "ERROR content";
			}
		case "es":
			switch(content){
			case "name":
				return "Español";
			case "title":
				return "En este sitio puede probar su comprensión de las sílabas chinas";
			case "not-supported":
				return "Su navegador no soporta el audio tag. Cambie de navegador y use Mozilla Firefox!";
			case "show":
				return "Mostrar la respuesta";
			case "showall":
				return "Mostrar todas las respuestas";
			case "hideall":
				return "Ocultar todas las respuestas";
			case "again":
				return "Hacerlo de nuevo";
			case "play-exp":
				return "Escuche la sílaba que desea (escriba sha4, le5 o sea bian1 por ejemplo)";
			case "go":
				return "GO !";
			case "warning":
				return "Si usted tiene cualquier problema, vaya a Mozilla Firefox.";
			default:
				return "ERROR content";
			}
		default:
			return "ERROR language";
		}
	}
}
