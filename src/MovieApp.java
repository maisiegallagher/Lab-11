import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {
	
	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		
//		Movie category1 = new Movie("Animated");
//		Movie category2 = new Movie("Drama");
//		Movie category3 = new Movie("Horror");
//		Movie category4 = new Movie("SciFi");
		
		
		ArrayList<String> category1 = new ArrayList<>();
		
		category1.add("The Lion King"); // index 0, element 1, animated
		category1.add("Sleeping Beauty"); // index 1, element 2, animated
		
		ArrayList<String> category2 = new ArrayList<>();
		
		category2.add("Fargo"); // index 0, element 1, drama
		category2.add("Rocky"); // index 1, element 2, drama
		category2.add("Dances With Wolves"); // index 2, element 3, drama
		
		ArrayList<String> category3 = new ArrayList<>();
		
		category3.add("The Silence Of The Lambs"); // index 0, element 1, horror
		category3.add("Frankenstein"); // index 1, element 2, horror
		
		ArrayList<String> category4 = new ArrayList<>();
		
		category4.add("Star Wars"); // index 0, element 1, scifi
		category4.add("E.T. The extra-terrestrial"); // index 1, element 2, scifi
		category4.add("Close Encounters Of The Third Kind"); // index 2, element 3, scifi

	}

}
