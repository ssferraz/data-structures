package vectors;

import java.util.Arrays;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// Crie um array de inteiros com 11 posições
		int[] array = new int[11];

		// Inicialize-o com os números de 1 a 10 nas dez primeiras posições, na ordem crescente.
		for (int i = 0; i < array.length-1; i++) {
			array[i] = i+1;
		}

		// Leia um novo numero inteiro do usuário.
		Scanner sc = new Scanner(System.in);
		int novoNumero = sc.nextInt();
		sc.close();

		// Insira-o no vetor mantendo ordenado de modo crescente.
		if(novoNumero > array.length-1) {
			array[array.length-1] = novoNumero;
		} else if(novoNumero >= array[0]) {
			for (int i = array.length - 1; i >= novoNumero; i--) {
				array[i] = array[i-1];
			}
		} else {
			int temp = 0;
			for (int i = 0; i < array.length; i++) {
				temp = array[i];
				array[i] = novoNumero;
				novoNumero = temp;
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
