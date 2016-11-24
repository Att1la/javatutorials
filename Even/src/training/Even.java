//Egy számról amit paraméterként adunk meg args-on keresztül (run configuration), eldönteni, hogy páros vagy páratlan

package training;

public class Even {

	public static void main(String[] args) {
		
		
		Integer number = Integer.valueOf(args[0]);
		if(number % 2 == 0)
			System.out.println("Páros");
		else
			System.out.println("Páratlan");
	}
	
}
