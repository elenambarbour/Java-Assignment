package randomNumGen;

public class merge {

	public static final void merging(int array[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r-q;
		
		
		int[] leftA;
		int[] rightA;
		leftA = new int[n1];
		rightA = new int[n2];
		
		for (int i = 0; i<n1; ++i) {
			leftA[i] = array[p+i];
		}
		for (int j = 0; j<n2; ++j) {
			rightA[j] = array[q+ 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = p;
		while (i<n1 && j < n2) {
			if (leftA[i]<= rightA[j]) {
				array[k] = leftA[i];
				i++;
			}
			else {
				array[k] = rightA[j];
				j++;
			}
			k++;
		}
		
		while (i<n1) {
			array[k] = leftA[i];
			i++;
			k++;
		}
		while (j<n2) {
			array[k] = rightA[j];
			j++;
			k++;
		}	
	}
}
