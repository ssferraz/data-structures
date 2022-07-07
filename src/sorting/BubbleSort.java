package sorting;

public class BubbleSort {
	
	public static void bubbleSort(int v[]) {
		int n = v.length;
		boolean trocou;
		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			for (int j = 0; j < n - i - 1; j++) {
				if(v[j + 1] < v[j]) {
					int aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
					trocou = true;
				}
			}
			if(!trocou) {
				return;
			}
		}
	}
}
