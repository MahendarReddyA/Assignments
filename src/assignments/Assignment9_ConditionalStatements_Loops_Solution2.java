package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment9_ConditionalStatements_Loops_Solution2 {

	public static void main(String[] args) {
		
		String[][] employees = {
				    {"Alice Johnson", "75000", "5.1", "4.2"},
		            {"Bob Smith", "68000", "3.2", "3.8"},
		            {"Carol Davis", "82000", "7.1", "4.5"},
		            {"David Brown", "90000", "10.2", "2.5"},
		            {"Eva Green", "60000", "2.4", "3.5"}
		};
		
		//Create Map to Store Final Output
		//A Map to store each employee’s name and their hike percentage
        //String → employee name; Double → hike %.
		
		Map<String,Double> Emp = new HashMap<>();
		
		//Loop Through Each Employee
		
//		Syntax - for (Type variable : collection) {
//      Code to be executed for each element
		
		for(String[] emp : employees) {
			
			// Extract Individual Values
			    String name = emp[0];
	            double salary = Double.parseDouble(emp[1]);
	            double experience = Double.parseDouble(emp[2]);
	            double rating = Double.parseDouble(emp[3]);
	            double variablePayPercent;
	            double bonus;
	            double reward = 0;
	            {
	    // Determine hike values based on rating
	            }
		if (rating >= 4.0) {
            variablePayPercent = 15.0;
            bonus = 1500;
        } else if (rating >= 3.0) {
            variablePayPercent = 10.0;
            bonus = 1200;
        } else {
            variablePayPercent = 3.0;
            bonus = 300;
        }
		
		//  Add reward if experience >= 5
        if (experience >= 5.0) {
            reward = 5000;
        }
            
         // Calculate hike and hike percentage
            double hikeAmount = (salary * (variablePayPercent/100)  + bonus + reward);
            double hikePercentage = (hikeAmount / salary) * 100;
            
            //Store in Emp map
            Emp.put(name,hikePercentage);
//            System.out.println(hikeAmount);
//            System.out.println(hikePercentage);
        }
		System.out.println("Employees Hike Percentage");
		System.out.println(Emp);
		for(Map.Entry<String,Double>Employees : Emp.entrySet()) {
			System.out.printf("Employee: %-15s | Hike %%: %.2f%%\n",Employees.getKey(),Employees.getValue());
			
		}
			
		}
             
	}

	

