package a03.src;
import a02.src.SortingAlgorithm;
import java.util.Random;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
public class SortingTest {
    private double startTime;

    public static int[] fillArrayWithSortedNumbersAscending(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) arr[i] = i;
        return arr;
    }

    public static int[] fillArrayWithSortedNumbersDescend(int n) {
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) arr[n - i] = i;
        return arr;
    }

    public static int[] fillArrayWithRandomNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) arr[i] = new Random().nextInt();
        return arr;
    }

    /**
     * startet den Timer. Variable wird auf jetzige Zeit Millisekunden gesetzt.
     */
    public void startTimer() {
        this.startTime = System.currentTimeMillis();
    }

    /**
     * @return Sekundenanzahl zwischen Zeitverschiebung der Aufrufe.
     */
    public double endTimer() {
        return (System.currentTimeMillis() - this.startTime) / 1000D;
    }

    public void startTest(AbsQuicksort absQuicksort) {
        int[] arr10R = SortingAlgorithm.fillArrayWithRandomNumbers(10);
        startTimer();
        absQuicksort.quicksort(arr10R);
        System.out.println("10-Randomnumbers Sort-Time: " + endTimer() + "s");

        int[] arr100R = SortingAlgorithm.fillArrayWithRandomNumbers(100);
        startTimer();
        absQuicksort.quicksort(arr100R);
        System.out.println("100-Randomnumbers Sort-Time: " + endTimer() + "s");

        int[] arr1000R = SortingAlgorithm.fillArrayWithRandomNumbers(1000);
        startTimer();
        absQuicksort.quicksort(arr1000R);
        System.out.println("1000-Randomnumbers Sort-Time: " + endTimer() + "s");

        int[] arr10000R = SortingAlgorithm.fillArrayWithRandomNumbers(10000);
        startTimer();
        absQuicksort.quicksort(arr10000R);
        System.out.println("10000-Randomnumbers Sort-Time: " + endTimer() + "s");

        int[] arr20000R = SortingAlgorithm.fillArrayWithRandomNumbers(20000);
        startTimer();
        absQuicksort.quicksort(arr20000R);
        System.out.println("20000-Randomnumbers Sort-Time: " + endTimer() + "s");
        // Number-Array-Ascend
        int[] arr10A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(10);
        int[] arr100A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(100);
        int[] arr1000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(1000);
        int[] arr10000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(10000);
        int[] arr20000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(20000);
        startTimer();
        absQuicksort.quicksort(arr10A);
        System.out.println("10-Ascendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr100A);
        System.out.println("100-Ascendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr1000A);
        System.out.println("1000-Ascendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr10000A);
        System.out.println("10000-Ascendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr20000A);
        System.out.println("20000-Ascendingnumbers Sort-Time: " + endTimer() + "s");

        // Number-Array-Descending
        int[] arr10D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(10);
        int[] arr100D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(100);
        int[] arr1000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(1000);
        int[] arr10000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(10000);
        int[] arr20000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(20000);
        startTimer();
        absQuicksort.quicksort(arr10D);
        System.out.println("10-Descendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr100D);
        System.out.println("100-Descendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr1000D);
        System.out.println("1000-Descendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr10000D);
        System.out.println("10000-Descendingnumbers Sort-Time: " + endTimer() + "s");
        startTimer();
        absQuicksort.quicksort(arr20000D);
        System.out.println("20000-Descendingnumbers Sort-Time: " + endTimer() + "s");
    }
}
