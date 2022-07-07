package sorting;

public class MergeSort {

	public static void mergeSort(int v[]) {
		int aux[] = new int[v.length];
		int high = v.length-1;
		sort(v, aux, 0, high);
	}
	
	private static void merge(int v[], int aux[], int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++) {
			aux[k] = v[k];
		}
		for (int k = low; k <= high; k++) {
			if(i > mid) {
				v[k] = aux[j++];
			} else if(j > high) {
				v[k] = aux[i++];
			} else if(aux[j] < aux[i]) {
				v[k] = aux[j++];
			} else {
				v[k] = aux[i++];
			}
		}
	}

	private static void sort(int v[], int aux[], int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		sort(v, aux, low, mid);
		sort(v, aux, mid + 1, high);
		merge(v, aux, low, mid, high);
	}
}
