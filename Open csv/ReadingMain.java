package com.bridgelabz;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVReader;

public class ReadingMain {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\NEW\\Day28_Assignment\\OpencCsv\\src\\main\\java\\com\\bridgelabz\\Example.csv");

		try (CSVReader reader = new CSVReader(new FileReader(file))) {
			List<String[]> r = reader.readAll();
			r.forEach(x -> System.out.println(Arrays.toString(x)));
		}catch (IOException e) {
			System.out.println("File Not Found");
		}
	}
}