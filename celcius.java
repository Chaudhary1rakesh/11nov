package first_java_programe;

import java.util.Scanner;

public class celcius {
	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int faren =sc.nextInt();
		float Celsius= ((faren-32)*5)/9;
		System.out.print("this value in Farenheight:"+Celsius);
}
}
