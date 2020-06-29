import java.util.Scanner;

public class KeltoFah{

	public static void main(String[] args) {

		double kelvin;

		System.out.printf("Introduza uma temperatura em kelvin : ");

		Scanner entrada = new Scanner(System.in);
		kelvin = entrada.nextDouble();

		double fahrenheit = (kelvin - 273.15) * 1.8 + 32;

		System.out.println(fahrenheit + " fahrenheit");

	}
}