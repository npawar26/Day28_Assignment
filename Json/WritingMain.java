package com.bridgelabz;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WritingMain
{
   @SuppressWarnings("unchecked")
   public static void main( String[] args )
   {
       //First Employee
       JSONObject employeeDetails = new JSONObject();
       employeeDetails.put("firstName", "Nikhil");
       employeeDetails.put("lastName", "pawar");
       employeeDetails.put("city", "Dhule");
        
       JSONObject employeeObject = new JSONObject(); 
       employeeObject.put("employee", employeeDetails);
       
       //Second Employee
       JSONObject employeeDetails2 = new JSONObject();
       employeeDetails2.put("firstName", "Aryan");
       employeeDetails2.put("lastName", "Patil");
       employeeDetails2.put("city", "Shirpur");
        
       JSONObject employeeObject2 = new JSONObject(); 
       employeeObject2.put("employee", employeeDetails2);
        
       JSONArray employeeList = new JSONArray();
       employeeList.add(employeeObject);
       employeeList.add(employeeObject2);
        
       try (FileWriter file = new FileWriter("C:\\NEW\\Day28_Assignment\\Json\\src\\main\\java\\com\\bridgelabz\\Example.json"))
       { 
           file.write(employeeList.toJSONString()); 
           file.flush();

       } catch (IOException e) {
           e.printStackTrace();
       }finally {
    	   System.out.println("Data written to Json file.....");
       }
   }
}