package com.bridgelabz;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WritingMain {

    public static void main(String[] args) throws IOException {
    	
        List<String[]> csvData = AddressBook.createCsvDataSimple();

        try (CSVWriter writer = new CSVWriter(new FileWriter("C:\\NEW\\Day28_Assignment\\OpencCsv\\src\\main\\java\\com\\bridgelabz\\Example.csv"))) {
            writer.writeAll(csvData);   
        }catch (IOException e) {
			System.out.println("File Not Found");
		}
        finally {
        	System.out.println("Data Written to CSV file.....");
        }
    }
}