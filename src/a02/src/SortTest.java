package a02.src;

import org.jetbrains.annotations.NotNull;

public class SortTest {

    public void startTest(@NotNull SortingAlgorithm sortingAlgorithm) {
        // Random-Number-Array
        int[] arr10R = sortingAlgorithm.fillArrayWithRandomNumbers(10);
        int[] arr100R = sortingAlgorithm.fillArrayWithRandomNumbers(100);
        int[] arr1000R = sortingAlgorithm.fillArrayWithRandomNumbers(1000);
        int[] arr10000R = sortingAlgorithm.fillArrayWithRandomNumbers(10000);
        int[] arr20000R = sortingAlgorithm.fillArrayWithRandomNumbers(20000);
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr10R);
        System.out.println("10-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr100R);
        System.out.println("100-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr1000R);
        System.out.println("1000-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr10000R);
        System.out.println("10000-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr20000R);
        System.out.println("20000-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        // Number-Array-Ascend
        int[] arr10A = sortingAlgorithm.fillArrayWithSortedNumbersAscending(10);
        int[] arr100A = sortingAlgorithm.fillArrayWithSortedNumbersAscending(100);
        int[] arr1000A = sortingAlgorithm.fillArrayWithSortedNumbersAscending(1000);
        int[] arr10000A = sortingAlgorithm.fillArrayWithSortedNumbersAscending(10000);
        int[] arr20000A = sortingAlgorithm.fillArrayWithSortedNumbersAscending(20000);
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr10A);
        System.out.println("10-Ascendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr100A);
        System.out.println("100-Ascendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr1000A);
        System.out.println("1000-Ascendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr10000A);
        System.out.println("10000-Ascendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr20000A);
        System.out.println("20000-Ascendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        // Number-Array-Descending
        int[] arr10D = sortingAlgorithm.fillArrayWithSortedNumbersDescend(10);
        int[] arr100D = sortingAlgorithm.fillArrayWithSortedNumbersDescend(100);
        int[] arr1000D = sortingAlgorithm.fillArrayWithSortedNumbersDescend(1000);
        int[] arr10000D = sortingAlgorithm.fillArrayWithSortedNumbersDescend(10000);
        int[] arr20000D = sortingAlgorithm.fillArrayWithSortedNumbersDescend(20000);
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr10D);
        System.out.println("10-Descendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr100D);
        System.out.println("100-Descendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr1000D);
        System.out.println("1000-Descendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr10000D);
        System.out.println("10000-Descendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
        sortingAlgorithm.startTimer();
        sortingAlgorithm.sort(arr20000D);
        System.out.println("20000-Descendingnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
    }
}

