package Arrays;

public class Arrays {

	public static void main(String[] args) {
		//To store list of values into array
		String[][][] Data= {
				{ // Semester 1
	                {"Mathematics I", "Pass(78)"},
	                {"Physics", "Pass(85)"},
	                {"Chemistry", "Fail(21)"},
	                {"Computer Programming", "Pass(74)"},
	                {"Engineering Drawing", "Pass(88)"},
	                {"Basic Electrical Eng.", "Pass(79)"}
	            },
	            { // Semester 2
	                {"Mathematics II", "Pass(82)"},
	                {"Mechanics", "Pass(77)"},
	                {"Environmental Sc.", "Pass(67)"},
	                {"Basic Electronics", "Fail(19)"},
	                {"Engineering Physics", "Fail(42)"},
	                {"Engineering Graphics", "Pass(60)"}
	            },
	            { // Semester 3
	                {"Data Structures", "Pass(88)"},
	                {"Discrete Mathematics", "Pass(75)"},
	                {"Digital Electronics", "Pass(72)"},
	                {"Operating Systems", "Pass(81)"},
	                {"Signals and Systems", "Pass(83)"},
	                {"Object-Oriented Prog.", "Pass(78)"}
	            },
	            { // Semester 4
	                {"Algorithms", "Pass(91)"},
	                {"Computer Networks", "Pass(90)"},
	                {"Software Systems", "Pass(86)"},
	                {"Microprocessors", "Pass(82)"},
	                {"Communication Eng.", "Fail(27)"},
	                {"Software Engineering", "Pass(80)"}
	            },
	            { // Semester 5
	                {"Probability & Stats", "Pass(91)"},
	                {"Machine Learning", "Pass(88)"},
	                {"Compiler Design", "Pass(86)"},
	                {"Theory of Computation", "Pass(89)"},
	                {"Embedded Systems", "Pass(73)"},
	                {"Computer Graphics", "Pass(90)"}
	            }
	        };
		// Print Semester 3 Subject 4 and Subject 5 names
		System.out.println("Semister 3 subject 4"+ Data[2][3][0]);
		System.out.println("Semister 3 subject 5"+ Data[2][4][0]);
		
		 // Print marks of Semester 5, Subject 3 and Subject 6
		System.out.println("Semester 5, Subject 3 Marks: " + Data[4][2][1]);
		System.out.println("Semester 5, Subject 6 Marks: " + Data[4][5][1]);
	}
}

