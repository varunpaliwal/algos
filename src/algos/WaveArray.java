package algos;

import java.util.Arrays;

/* Given an array a[], rearrange the elements to get them wave sorted:
 * a1>a2<a3>a4<a5>a6...
 */
public class WaveArray {

	int[] waveSort(int[] inputArr){
		int[] waveSorted = new int[inputArr.length];
		Arrays.sort(inputArr);
		for(int i=0,j=0; i< Math.ceil(inputArr.length/2.0); i++,j=j+2){
			waveSorted[j]=inputArr[i+(inputArr.length/2)];
			if(j+1<inputArr.length)
				waveSorted[j+1]=inputArr[i];
		}

		return waveSorted;
	}
}
