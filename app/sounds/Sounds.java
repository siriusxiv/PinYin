package sounds;

//import java.io.File;
//import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Sounds {
	
	public static List<String> get10(){/*
		List<String> sounds = new ArrayList<String>();
		String path = "/home/malik/PinYin/public/sounds";
		File folder = new File(path);
		System.out.println(path);
		FilenameFilter filter = new FilenameFilter(){
			@Override
            public boolean accept(File dir, String name) {
				int lastIndex;
				if((lastIndex = name.lastIndexOf('.'))>0)
				{
                    return name.substring(lastIndex).equals(".mp3");
				}
				return false;
            }
		};
		File files[] = folder.listFiles(filter);
		for(int i = 0; i<files.length ; i++){
			sounds.add(files[i].getName().replace(".mp3", ""));
		}
		Test.genere(sounds);*/
		return select10(Genere.copyString());
	}
	
	private static List<String> select10(List<String> sounds){
		List<String> _10sounds = new ArrayList<String>();
		int M = sounds.size();
		Random rand = new Random();
		for(int i = 0; i<10; i++){
			_10sounds.add(sounds.get(rand.nextInt(M)));
		}
		return _10sounds;
	}
	
}
