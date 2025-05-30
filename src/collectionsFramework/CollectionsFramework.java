package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsFramework {
	
	// Array ==> Data type can store multiple values with similar data type together at one place

	// Challenges of Arrays

	// 1. Arrays are fixed in size
	// 2. Memory will be allocated at the beginning of creating array / static memory allocation
	// 3. Array allows similar data types only
	// 4. Modifications also not allowed

	// String[] newEmpNames = new String[4] ;
	// newEmpNames[0] = "Teja";
	// newEmpNames[1] = "Afreen";
	// newEmpNames[2] = "Aryan";
	// newEmpNames[3] = "Bharath";

	// Collections Framework

	// List ==> ArrayList, LinkedList

	// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. List can follow dynamic memory allocation
	// 3. List allows modifications
	// 4. List allows duplicate values

	// Set ==> HashSet, LinkedHashSet, TreeSet

	// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. Set can follow dynamic memory allocation
	// 3. Set allows modifications
	// 4. Set won't allow duplicate values

	// Map ==> HashMap, LinkedHashMap, TreeMap & HashTable

	// 1. Map can store multiple values with different data type together in the form of key and value at one place by allocating memory dynamically
	// 2. Map can follow dynamic memory allocation
	// 3. Map allows modifications
	// 4. Map wont allow duplicate keys but values can be duplicated


	public static void main(String[] args) {
		
		String[] newEmpNames = new String[5];
		/***********Arraylist***************/
				
		newEmpNames[0] = "Teja";
        newEmpNames[1] = "Sai";
        newEmpNames[2] = "Ram";
        newEmpNames[3] = "Bharath";
        newEmpNames[4] = "Mahendar";
		
		//syntax to initialize/create: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the data: variable.get(index);
		// Syntax to get the total value: variable.size();
		
		List<String> empnamearraylist = new ArrayList<String>();
		empnamearraylist.add("Mahendar Reddy");
		empnamearraylist.add("Ram");
		empnamearraylist.remove("Ram");
		empnamearraylist.add("Hanuman");
		empnamearraylist.add("Ram");
		empnamearraylist.add(null);
		
		System.out.println("employeenamearraylist size is " + empnamearraylist.size());
		System.out.println(empnamearraylist);
		System.out.println("**********arraylist*********");


	/***********Linkedlist***************/
	
//	newEmpNames[0] = "Teja";
//    newEmpNames[1] = "Sai";
//    newEmpNames[2] = "Ram";
//    newEmpNames[3] = "Bharath";
//    newEmpNames[4] = "Mahendar";
	
	//syntax to initialize/create: List<DataType> variable = new Linkedlist<DataType>();
	// Syntax to add data: variable.add(value);
	// Syntax to remove the data: variable.remove(value);
	// Syntax to get the data: variable.get(index);
	// Syntax to get the total value: variable.size();
	
	List<String> empnameLinkedList = new LinkedList<String>();
	empnameLinkedList.add("Mahendar Reddy");
	empnameLinkedList.add("Ram");
	empnameLinkedList.remove("Ram");
	empnameLinkedList.add("Hanuman");
	empnameLinkedList.add("Ram");
	empnameLinkedList.add(null);
	
	System.out.println("employeenameLinkedlist size is " + empnameLinkedList.size());
	System.out.println(empnameLinkedList);
}
}

