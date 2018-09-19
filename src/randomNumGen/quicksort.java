package randomNumGen;

public class quicksort {
	public static final void quicksorting (int array[], int p, int r) {
		int q =0;
		if (p<r) {
			q = partition.partitioning(array, p, r);
			quicksorting(array, p, q-1);
			quicksorting(array, q+1, r);
		}
	}
}
