package randomNumGen;

public class partition {
	public static final int partitioning (int array[], int p, int r) {
		int temp = 0;
		int end = array[r];
		int i = p-1;
		for (int j = p; j<r; ++j) {
			if (array[j] <= end) {
				i++;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		temp = array[i+1];
		array[i+1] = array[r];
		array[r] = temp;
		return i+1;
	}
}
