package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionalStatements_Loops {

	private static Object employee;

	public static void main(String[] args) {
		// to store Employee table info 
		
		Map<String,String > Employee1 = new HashMap<>();
		Employee1.put("Name","Alice Johnson");
		Employee1.put("Base Salary","75000");
		Employee1.put("Experience (Years)", "5.1");
		Employee1.put("Year-End Rating(Out of 5)","4.2");
		
        Map<String, String> Employee2 = new HashMap<>();
        Employee2.put("Name", "Bob Smith");
        Employee2.put("Base Salary", "68000");
        Employee2.put("Experience (Years)", "3.2");
        Employee2.put("Year-End Rating(Out of 5)", "3.8");

        Map<String, String> Employee3 = new HashMap<>();
        Employee3.put("Name", "Carol Davis");
        Employee3.put("Base Salary", "82000");
        Employee3.put("Experience (Years)", "7.1");
        Employee3.put("Year-End Rating(Out of 5)", "4.5");

        Map<String, String> Employee4 = new HashMap<>();
        Employee4.put("Name", "David Brown");
        Employee4.put("Base Salary", "90000");
        Employee4.put("Experience (Years)", "10.2");
        Employee4.put("Year-End Rating(Out of 5)", "2.5");

        Map<String, String> Employee5 = new HashMap<>();
        Employee5.put("Name", "Eva Green");
        Employee5.put("Base Salary", "60000");
        Employee5.put("Experience (Years)", "2.4");
        Employee5.put("Year-End Rating(Out of 5)", "3.5");
     
        
        List<Map<String, String>> EmployeeList = new ArrayList<>();
        EmployeeList.add(Employee1);
        EmployeeList.add(Employee2);
        EmployeeList.add(Employee3);
        EmployeeList.add(Employee4);
        EmployeeList.add(Employee5);
        
     // Map to store hike percentage
        Map<String, Double> hikeMap = new HashMap<>();

        // Calculate hike for each employee
        for (Map<String, String> emp : EmployeeList) {
        	String name = emp.get("Name");
            double salary = Double.parseDouble(emp.get("Base Salary"));
            double experience = Double.parseDouble(emp.get("Experience (Years)"));
            double rating = Double.parseDouble(emp.get("Year-End Rating(Out of 5)"));
            double VariablePay = 0;
            double bonus=0;
            double reward = 0;
            if(rating>=4.0) {
            VariablePay = 15.0;
            bonus =1500;
            
            }
            else if(rating>=3.0 && rating<4.0) {
            	VariablePay=10.0;
            	bonus =1200;
            }
            else {
            	VariablePay=3.0;
            	bonus =300;
            	
            }if(experience>=5) {
            	reward=5000;
            }
         // Calculate total hike amount
          double  hike = (salary * (VariablePay/100)  + bonus + reward);
          double hikepercentage= (hike/salary)*100;

			hikeMap.put(name, hikepercentage);
        }
        
        System.out.println("Employee Hike Details");
        System.out.println(hikeMap);
        for (Map.Entry<String, Double> employee : hikeMap.entrySet()) {
        System.out.printf("Employee: %-15s | Hike %%: %.2f%%\n", employee.getKey(), employee.getValue());
     		}
     	}
}

     






