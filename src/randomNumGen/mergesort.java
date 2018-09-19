package randomNumGen;

public class mergesort {

	public static final void mergesorting(int array[], int p, int r) {
		int q = 0;
		if (p<r) {
			q = Math.floorDiv((p+r), 2);
			mergesorting( array, p, q);
			mergesorting( array, q+1, r);
			merge.merging(array, p, q, r);
		}
	}
}
