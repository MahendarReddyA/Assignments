package assignments;

import java.util.ArrayList;
import java.util.List;

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
		
		
	}

}
