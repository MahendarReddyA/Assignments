package assignments;

public class Assignment6_Arrays_Datatypes {

	public static void main(String[] args) {
		// Create two arrays to store student names ["Suresh","Mahesh","Naresh"] andmarks [75, 80, 82] 
		//Add 10 marks to each students using assignment operators andstore it into another array, 
		//after adding 10 marks identify the average marks of allstudents
		
		String[] Students = {"Suresh","Mahesh","Naresh"};
		int[] Marks= {75, 80, 82};
		int total =0;
		
		System.out.println("Updated Marks");
		for (int i=0;i<Marks.length;i++) {
			Marks[i]= Marks[i]+ 10; // Add 10 marks directly
			System.out.println(Students[i] +" " + Marks[i]);
			total=total+Marks[i];
		}
		
		System.out.println("total marks of the Students"+ total);
		// Calculate average marks
		 double avg = total / Marks.length;
	        System.out.println("Average Marks: " + avg);
	    }
	
	}


