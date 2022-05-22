package a03.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
public class NativeQuicksort extends AbsQuicksort{
	@Override
    public void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }
	
	int part(int[] arr, int left, int right) {
		int pivot = arr[left];
		int i = left;		
		for(int j = left; j <= right - 1; j++) {
			if(arr[j] < pivot) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
			}
		}
		int tmp = arr[i];
		arr[i] = arr[right];
		arr[right] = tmp;
		return(i);
	}
	
	
    public static void quicksort(int[] arr, int left, int right) {
    	if(left<right) {
    	int part = part(arr, 0, arr.length - 1);
    	quicksort(arr, left, part - 1);
        quicksort(arr, part + 1, right);
    }
    }
}
