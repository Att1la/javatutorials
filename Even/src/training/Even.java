//Egy sz�mr�l amit param�terk�nt adunk meg args-on kereszt�l (run configuration), eld�nteni, hogy p�ros vagy p�ratlan

package training;

public class Even {

	public static void main(String[] args) {
		
		
		Integer number = Integer.valueOf(args[0]);
		if(number % 2 == 0)
			System.out.println("P�ros");
		else
			System.out.println("P�ratlan");
	}
	
}
