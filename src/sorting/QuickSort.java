package sorting;

public class QuickSort {

	public static void quickSort(int v[]) {
		sort(v, 0, v.length-1);
	}
	
	public static void sort(int v[], int lb, int up) {
	    if (lb < up) {
	        int ub = partition(v, lb, up);
	        sort(v, lb, ub-1);
	        sort(v, ub+1, up);
	    }
	}
	
	private static int partition(int v[], int lb, int up) {
	    int pivo = v[up];
	    int i = (lb-1);

	    for (int j = lb; j < up; j++) {
	        if (v[j] <= pivo) {
	            i++;

	            int ub = v[i];
	            v[i] = v[j];
	            v[j] = ub;
	        }
	    }

	    int ub = v[i+1];
	    v[i+1] = v[up];
	    v[up] = ub;

	    return i+1;
	}
}
