package assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignement4_Collections {

	public static void main(String[] args) {
		// Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
 
		List<Double> Areas = new ArrayList<Double>();
		Areas.add(2344.50);//1st city
		Areas.add(98349.009);//2nd city
		Areas.add(35356.99);//3rd city
		Areas.add(98658.22);//4th city
		Areas.add(74836.22);//5th city
		
		Double total =Areas.get(2)+ Areas.get(3);
		
		System.out.println("Total area of 3rd and 4 th city" + total);
		
		List<Integer> CityAreas = new ArrayList<Integer>();
		CityAreas.add(2344);//1st city - Index 0
		CityAreas.add(98349);//2nd city - Index 1
		CityAreas.add(35356);//3rd city - Index 2
		CityAreas.add(9865);//4th city - Index 3
		CityAreas.add(748367);//5th city- Index 4
		
		Integer total1 =CityAreas.get(2)+ CityAreas.get(3);
		
		System.out.println("Total area of 3rd and 4 th city" + total1);
		
		
		//Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		
		Set<String> Attractions = new HashSet<String>();
		Attractions.add("Tirupathi");
		Attractions.add("Arunachalam");
		Attractions.add("Disney Island");
		Attractions.add("Great Wall of China");
		Attractions.add("Nayagara");
		Attractions.add("Ram sethu");
		Attractions.add("Statue of Liberty");
		Attractions.add("Dubai");
		Attractions.add("Berlin");
		Attractions.add("Banff National Park");
		Attractions.add("Amazon");
		
		System.out.println("tourist attractions in the world" + " " + Attractions);
		System.out.println("total number of tourist attractions in the world" +"  "+ Attractions.size());
		
	
		//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		int[] Numbers = {90,23,4322,446,657,76,242,257,78,24,79,24,754};
		double average = (Numbers[4] + Numbers[5])/2.0;
		System.out.println(average);
		
		//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		
		List<String> Gross = new ArrayList<>();
		Gross.add("Khaidi No 150");
		Gross.add("RRR");
		Gross.add("Rangastahalam");
		Gross.add("Eega");
		Gross.add("Syera");
		
		System.out.println("Highest groccess 3rd movie out of 5 is "+ " " + Gross.get(2));		
		
}
}
