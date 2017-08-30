import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	
public static void read(String file){
	
	File inputFile = new File(file);
	try {
		Scanner scanner = new Scanner(inputFile);
		
		while (scanner.hasNext()){
			System.out.println(scanner.next());
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
}
