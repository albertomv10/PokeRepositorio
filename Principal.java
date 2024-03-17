import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número binario:");
		String num = scanner.nextLine();
		int n = num.length();
		System.out.println(n);
		double num_bin = Double.parseDouble(num);
		double num_dec = 0;
		for (double i=0; i<n; i++) {
			double potencia10 = Math.pow(10, i);
			double div = num_bin/potencia10;
			int rest = (int)div%2;
			double potencia2 = Math.pow(2, i);
			if (rest == 1) {
				num_dec += potencia2;
			}
		}
		System.out.print("El número en decimal es:" + (int)num_dec);
		
		scanner.close(); 
		// hola
	}

}
