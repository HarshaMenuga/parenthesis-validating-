package exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> string = new ArrayList<String>();
		
		FileReader file = new FileReader("C:\\Users\\harsh\\OneDrive\\Desktop\\DemoCSV.csv");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			  string.add(sc.nextLine().replaceAll(",", "  "));
		}
		String[] data = new String[string.size()];
		for(int i =0;i<string.size();i++) {
			data[i] = string.get(i);
		}
		try (FileWriter fileWriter = new FileWriter("C:\\Users\\harsh\\OneDrive\\Desktop\\demo.xls")) {
			for(int i =0;i<data.length;i++) {
				fileWriter.write(data[i]+"\n");
			}
		}
	}

}
