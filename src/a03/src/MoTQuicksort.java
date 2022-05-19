package a03.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
public class MoTQuicksort extends AbsQuicksort{

    @Override
    public void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    /**
     * @param arr inputarray
     * @param left end of bound
     * @param right end of bound
     * Median-Of-Three Quicksort-Algorithmus
     */
    public static void quicksort(int[] arr, int left, int right) {
        int midsize = right - left + 1;
        if (midsize <= 3)
            manual(arr, left, right);
        else {
            double mot = mot(arr, left, right);
            int part = partition(arr, left, right, mot);
            quicksort(arr, left, part - 1);
            quicksort(arr, part + 1, right);
        }
    }

    /**
     * @param arr inputarray
     * @param left end of bound
     * @param right end of bound
     * manual soll die Effizienz des Algorithmus verbessern, wenn nur 3 Elemente oder weniger im Array sind
     */
    public static void manual(int[] arr, int left, int right) {
        int size = right - left + 1;
        if (size <= 1) return;
        if (size == 2) {
            if (arr[left] > arr[right]) swap(arr, left, right);
        } else {
            if (arr[left] > arr[right - 1]) swap(arr, left, right - 1);
            if (arr[left] > arr[right]) swap(arr, left, right);
            if (arr[right - 1] > arr[right]) swap(arr, right - 1, right);
        }
    }

    /**
     * @param arr inputarray
     * @param left end of bound
     * @param right end of bound
     * @return pivot
     * Suche pivot-Element
     */
    public static int mot(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[left] > arr[mid])
            swap(arr, left, mid);
        if (arr[left] > arr[right])
            swap(arr, left, right);
        if (arr[mid] > arr[right])
            swap(arr, mid, right);
        swap(arr, mid, right - 1);
        return arr[right - 1];
    }

    /**
     * @param arr
     * @param left
     * @param right
     * @param piv
     * @return
     * Partionierungsalgorithmus nach Hoare
     */
    public static int partition(int[] arr, int left, int right, double piv) {
        int ptrL = left;
        int ptrR = right - 1;
        while (true) {
            while (arr[++ptrL] < piv) ; // scan größerer int-wert
            while (arr[--ptrR] > piv) ; // scan kleinerer int-wert
            if (ptrL >= ptrR) break; // ptr sind gekreuzt und dadurch breaken wir
            else swap(arr, ptrL, ptrR);
        }
        swap(arr, ptrL, right - 1);
        return ptrL;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
