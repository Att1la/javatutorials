package training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Calculator {

	public static void main(String[] args) throws IOException {
		System.out.println("Kérlek irj be egy műveletsort");
	
		String line = new BufferedReader(new InputStreamReader(System.in)).readLine();		
		System.out.println(line);
		
		String[] operations = line.split("[0-9]+");
		System.out.println(Arrays.toString(operations));
		//kivonás jel speciális a regex-ben ezért pattern kell hogy úgy értelmezze ahogy az valóban be van írva
		String[] numbers = line.split("[" + Pattern.quote("+-*/") + "]");
		System.out.println(Arrays.toString(numbers));
		
		
		int[] numbersConverted = convert(numbers);
		System.out.println(Arrays.toString(numbersConverted));
		
		int result = calculate(operations, numbersConverted);
		System.out.println(result);
		
	}

	private static int[] convert(String[] numbers) {
		int[] numbersConverted = new int[numbers.length];
		for(int i = 0; i < numbers.length; i++){
			numbersConverted[i] = Integer.valueOf(numbers[i]);
		}
		return numbersConverted;
	}

	
	private static int calculate(String[] operations, int[] numbersConverted) {
		int result = numbersConverted[0];
		for(int i = 1; i < operations.length; i++){
			switch(operations[i]){
			
			case "+": 
				result += numbersConverted[i];
				break;
			case "-":
				result -= numbersConverted[i];
				break;
			case "*":
				result *= numbersConverted[i];
				break;
			case "/":
				result /= numbersConverted[i];
				break;
			}
		}
		return result;
	}
	
	
	
	
}
