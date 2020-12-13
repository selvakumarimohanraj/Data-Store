package dataStore2;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.*;
public class Class2 {
	 @SuppressWarnings("unchecked")
	    public static void main( String[] args )
	    {
	        //First Employee
		 Scanner s=new Scanner(System.in);
		
		 
	        JSONObject employeeDetails = new JSONObject();
	        System.out.println("enter n");
	        int n=s.nextInt();
	        s.nextLine();
	        String St="";
	        for(int i=0;i<n;i++)
	        {
	        	String e=s.nextLine();
	        	String a[]=e.split(" ");
	        	if(St.contains(a[0]))
	        			{
	        		System.out.print("Key already exists");
	        		//System.exit(0);
	        			}
	        	else
	        	{
	        	 employeeDetails.put(a[0],a[1]);
	        	 St+=a[0];
	        	}
	        	
	        }
	       /* employeeDetails.put("firstName", "Lokesh");
	        employeeDetails.put("lastName", "Gupta");
	        employeeDetails.put("website", "howtodoinjava.com");*/
	         
	       JSONObject employeeObject = new JSONObject(); 
	        employeeObject.put("employee", employeeDetails);
	         
	        //Second Employee
	       /* JSONObject employeeDetails2 = new JSONObject();
	        employeeDetails2.put("firstName", "Brian");
	        employeeDetails2.put("lastName", "Schultz");
	        employeeDetails2.put("website", "example.com");
	         
	        JSONObject employeeObject2 = new JSONObject(); 
	        employeeObject2.put("employee", employeeDetails2);*/
	         
	        //Add employees to list
	        JSONArray employeeList = new JSONArray();
	        employeeList.add(employeeObject);
	        //employeeList.add(employeeObject2);
	        System.out.println("enter pk");
	        String str=s.nextLine();
	        System.out.print(employeeDetails.get(str));
	         
	        //Write JSON file
	        try (FileWriter file = new FileWriter("employees.json")) {
	 
	            file.write(employeeList.toJSONString());
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
