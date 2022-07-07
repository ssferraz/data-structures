package sorting;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
			
		int v1[] = new int[50000];
		int v2[] = new int[100000];
		int v3[] = new int[200000];
		

		for (int i = 0; i < v1.length; i++) {
			int value = random.nextInt(10000);
			v1[i] = value;
		}
		
		for (int i = 0; i < v2.length; i++) {
			int value = random.nextInt(10000);
			v2[i] = value;
		}
		
		for (int i = 0; i < v3.length; i++) {
			int value = random.nextInt(10000);
			v3[i] = value;
		}
		
		
		// 1. Escolha qual algoritmo de ordenação deseja testar comentando os outros 2
		// 2. Escolha o vetor que possui a quantidade de elementos que deseja testar.
		for (int i = 0; i < 30; i++) {
			//testBubbleSort(v3);
			//testMergeSort(v2);
			testQuickSort(v1);
		}
	}

	public static void testBubbleSort(int v[]) {
		int aux[] = new int[v.length];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = v[i];
		}
		long tempoInicial = System.currentTimeMillis();
		BubbleSort.bubbleSort(aux);
		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f%n", (tempoFinal - tempoInicial) / 1000d);
	}
	
	public static void testMergeSort(int v[]) {
		int aux[] = new int[v.length];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = v[i];
		}
		long tempoInicial = System.currentTimeMillis();
		MergeSort.mergeSort(aux);
		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f%n", (tempoFinal - tempoInicial) / 1000d);
	}
	
	public static void testQuickSort(int v[]) {
		int aux[] = new int[v.length];
		for (int i = 0; i < aux.length; i++) {
			aux[i] = v[i];
		}
		long tempoInicial = System.currentTimeMillis();
		QuickSort.quickSort(aux);
		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f%n", (tempoFinal - tempoInicial) / 1000d);
	}

}
