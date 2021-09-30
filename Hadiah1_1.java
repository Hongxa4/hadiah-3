import java.util.Scanner;
public class Hadiah1_1 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double celcius, faren;
		
		
		System.out.print("Masukkan Nilai Celcius : ");
		celcius = input.nextDouble();
	
		System.out.print("\n");
		faren = ((celcius*9)/5)+32;
		
		System.out.println("Hasil Nilai Fahrenheit : " + faren);
		
		
	}
	
	
	
	
	
}