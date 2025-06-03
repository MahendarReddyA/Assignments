package assignments;

public class Assignment3_EmpGroups extends EmployeeClass {

	public static void main(String[] args) {
		
		EmployeeClass obj = new EmployeeClass();
    	String[] Employee = {obj.Emp1Name,obj.Emp2Name,obj.Emp3Name};
    	int[] Employeeid = {obj.Emp1ID,obj.Emp2Id,obj.Emp3Id};
    			
    	
    	System.out.println("Employee Name: " + Employee[0] + " Employee ID: " + Employeeid[0]);
		

	}

}
