package vectors;

import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// Crie um array de inteiros de 10 posi��es
		int[] array = new int[10];

		// Preenchido com os elementos de 1 a 10 em ordem crescente.
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}

		// Leia um n�mero inteiro do usu�rio
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.close();

		// Imprima o vetor antes da remo��o.
		System.out.println(Arrays.toString(array));

		// Remova esse n�mero do vetor, caso o n�mero realmente exista no vetor e imprima o vetor.
		if(numero >= 1 && numero <= 10) {
			for (int i = numero-1; i < array.length-1; i++) {
				array[i] = array[i + 1];
			}
			System.out.print("[");
			for (int i = 0; i < array.length-1; i++) {
				System.out.print(array[i]);
				if(i != 8) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
		}else {
			System.out.println(Arrays.toString(array));
		}
	}
}
