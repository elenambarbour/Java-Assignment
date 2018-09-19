package randomNumGen;
import java.util.Random;
import java.util.Arrays;
public final class randomNumGen {
	public static final void main(String[] args) {
		int N = 10000;
		long startTime;
		long endTime;
		int[] numArray;
		int[] numArray2;
		int[] numArray3;
		numArray = new int[N];
		numArray2 = new int[N];
		numArray3 = new int[N];
		System.out.println("Generating random nums N: " + N);
		Random numGenerator = new Random();
		for (int i = 0; i<numArray.length; i++) {
			numArray[i] = numGenerator.nextInt(1000);
		}
		for (int i = 0; i<numArray.length; i++) {
			numArray2[i] = numArray[i];
			numArray3[i] = numArray[i];
		}
		System.out.println("Generated:" + Arrays.toString(numArray));
		startTime = System.nanoTime();
		insertionsort.insertionsorting(numArray);
		endTime = System.nanoTime();
		System.out.println("Insertion Sort:" + Arrays.toString(numArray));
		System.out.println("Time took: " + (endTime - startTime) + " Nanoseconds");
		startTime = System.nanoTime();
		mergesort.mergesorting(numArray2, 0, (numArray2.length-1));
		endTime = System.nanoTime();
		System.out.println("Merge Sort:" + Arrays.toString(numArray2));
		System.out.println("Time took: " + (endTime - startTime) + " Nanoseconds");
		startTime = System.nanoTime();
		quicksort.quicksorting(numArray3, 0, (numArray3.length-1));
		endTime = System.nanoTime();
		System.out.println("Quick Sort:" + Arrays.toString(numArray2));	
		System.out.println("Time took: " + (endTime - startTime) + " Nanoseconds");
		
	}
}
