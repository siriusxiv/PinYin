/*
package sounds;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Test {

	static void genere(List<String> strs){
		FileWriter outputStream = null;
		String file_name = "Genere.java";
		try{
			outputStream = new FileWriter(play.Play.application().path()+"/app/sounds/"+file_name);
			outputStream.write(genereString(strs));
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static String genereString(List<String> strs){
		String page = "package sounds;\nimport java.util.ArrayList;\nimport java.util.List;\nclass Genere{\npstatic List<String> copyString(){\nList<String> strs = new ArrayList<String>();\n";
		for(int i = 0; i<strs.size();i++){
			page+="strs.add(\""+strs.get(i)+"\");\n";
		}
		page+="return strs\n}\n}";
		return page;
	}
	
	private static void copyString(){
		List<String> strs = new ArrayList<String>();
		strs.add("xu1");
		...
	}
	
	
}
*/
