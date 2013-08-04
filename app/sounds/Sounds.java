package sounds;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Sounds {
	
	public static List<String> get10(){
		List<String> sounds = new ArrayList<String>();
		File folder = new File(play.Play.application().path().toString() + "//public//sounds");
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
		return select10(sounds);
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
