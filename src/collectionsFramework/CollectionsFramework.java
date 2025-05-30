package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
	
	// Order of Storing Values: Random Order
	// Null Values: Allowed

	Set<String> empNamesHashSet = new HashSet<String>();
	empNamesHashSet.add("Teja");
	empNamesHashSet.add("Afreen");
	empNamesHashSet.add("Aryan");
	empNamesHashSet.add("Bharath");
	empNamesHashSet.add("Afreen"); // duplicate, ignored
	empNamesHashSet.add(null);

	empNamesHashSet.remove("Bharath");

	System.out.println("HashSet size = " + empNamesHashSet.size());
	System.out.println(empNamesHashSet);
	
	System.out.println("*************** LinkedHashSet ***************");

	// Syntax to Initialize/create: Set<DataType> variable = new LinkedHashSet<DataType>();
	// Syntax to add data: variable.add(value);
	// Syntax to remove the data: variable.remove(value);
	// Syntax to get the total value: variable.size();

	// Order of Storing Values: Insertion Order
	// Null Values: Allowed

	Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
	empNamesLinkedHashSet.add("Teja");
	empNamesLinkedHashSet.add("Afreen");
	empNamesLinkedHashSet.add("Aryan");
	empNamesLinkedHashSet.add("Bharath");
	empNamesLinkedHashSet.add("Teja");   // Duplicate, ignored
	empNamesLinkedHashSet.add(null);
	empNamesLinkedHashSet.add(null);    // Duplicate null, ignored

	empNamesLinkedHashSet.remove("Bharath");

	System.out.println("LinkedHashSet size is :" + empNamesLinkedHashSet.size());
	System.out.println(empNamesLinkedHashSet);
	
	System.out.println("*************** TreeSet ***************");

	// Syntax to Initialize/create: Set<DataType> variable = new TreeSet<DataType>();
	// Syntax to add data: variable.add(value);
	// Syntax to remove the data: variable.remove(value);
	// Syntax to get the total value: variable.size();

	// Order of Storing Values: Ascending/Alphabetical order
	// Null Values: Not Allowed (will throw NullPointerException at runtime)

	Set<String> empNamesTreeSet = new TreeSet<String>();
	empNamesTreeSet.add("Teja");
	empNamesTreeSet.add("Afreen");
	empNamesTreeSet.add("Aryan");
	empNamesTreeSet.add("Bharath");
	empNamesTreeSet.add("Teja");     // Duplicate, ignored

	//empNamesTreeSet.add(null);       // ❌ This will throw NullPointerException
	empNamesTreeSet.remove("Bharath");

	System.out.println("TreeSet size is : " + empNamesTreeSet.size());
	System.out.println(empNamesTreeSet);
	
	System.out.println("*************** HashMap ***************");

	// Syntax to Initialize/create: Map<Key,Value> variable = new HashMap<Key,Value>();
	// Syntax to add data: variable.put(Key,value);
	// Syntax to remove the data: variable.remove(key);
	// Syntax to get the total value: variable.size();
	// Syntax to get the total value: variable.get(key);

	// Order of Storing Values: Ascending/Alphabetical order
	// Null Values: Not Allowed (will throw NullPointerException at runtime)

	Map<Integer,String> empNamesHashMap = new HashMap<Integer,String>();
	empNamesHashMap.add(Name,"Teja");
	empNamesHashMap.add(10,"Afreen");
	empNamesHashMap.add("Aryan");
	empNamesHashMap.add("Bharath");
	empNamesHashMap.add("Teja");     // Duplicate, ignored

	//empNamesHashMap.add(null);       // ❌ This will throw NullPointerException
	empNamesHashMap.remove("Bharath");

	System.out.println("HashMap size is : " + empNamesHashMap.size());
	System.out.println(empNamesHashMap);
}
}

