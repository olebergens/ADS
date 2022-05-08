/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */

package a02.src;

import java.util.Arrays;

public class SortTest {

    public void startTest( SortingAlgorithm sortingAlgorithm) {
        assert sortingAlgorithm != null;
        double endTime = 0, measureTime = 0;

        // Random-Number-Array
        for (int i = 0; i < 12; i++) {
            int[] arr10R = SortingAlgorithm.fillArrayWithRandomNumbers(10);
            sortingAlgorithm.startTimer();
            sortingAlgorithm.sort(arr10R);
            endTime = sortingAlgorithm.endTimer();
            System.out.println("10-Randomnumbers Sort-Time: " + endTime + "s");
            measureTime += endTime;
        }
        System.out.println("10-Randomnumbers Sort-Time (average): " + measureTime / 12 + "s");
        measureTime = 0;

        for (int i = 0; i < 12; i++) {
            int[] arr100R = SortingAlgorithm.fillArrayWithRandomNumbers(100);
            sortingAlgorithm.startTimer();
            sortingAlgorithm.sort(arr100R);
            endTime = sortingAlgorithm.endTimer();
            System.out.println("100-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
            measureTime += endTime;
        }
        System.out.println("100-Randomnumbers Sort-Time (average): " + measureTime / 12 + "s");
        measureTime = 0;

        for (int i = 0; i < 12; i++) {
            int[] arr1000R = SortingAlgorithm.fillArrayWithRandomNumbers(1000);
            sortingAlgorithm.startTimer();
            sortingAlgorithm.sort(arr1000R);
            endTime = sortingAlgorithm.endTimer();
            System.out.println("1000-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
            measureTime += endTime;
        }
        System.out.println("1000-Randomnumbers Sort-Time (average): " + measureTime / 12 + "s");
        measureTime = 0;

        for (int i = 0; i < 12; i++) {
            int[] arr10000R = SortingAlgorithm.fillArrayWithRandomNumbers(10000);
            sortingAlgorithm.startTimer();
            sortingAlgorithm.sort(arr10000R);
            endTime = sortingAlgorithm.endTimer();
            System.out.println("10000-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
            measureTime += endTime;
        }
        System.out.println("10000-Randomnumbers Sort-Time (average): " + measureTime / 12 + "s");
        measureTime = 0;

        for (int i = 0; i < 12; i++) {
            int[] arr20000R = SortingAlgorithm.fillArrayWithRandomNumbers(20000);
            sortingAlgorithm.startTimer();
            sortingAlgorithm.sort(arr20000R);
            endTime = sortingAlgorithm.endTimer();
            System.out.println("20000-Randomnumbers Sort-Time: " + sortingAlgorithm.endTimer() + "s");
            measureTime += endTime;
        }
        System.out.println("10000-Randomnumbers Sort-Time (average): " + measureTime / 12 + "s");
        measureTime = 0;

        // Number-Array-Ascend
        int[] arr10A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(10);
        int[] arr100A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(100);
        int[] arr1000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(1000);
        int[] arr10000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(10000);
        int[] arr20000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(20000);
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
        int[] arr10D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(10);
        int[] arr100D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(100);
        int[] arr1000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(1000);
        int[] arr10000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(10000);
        int[] arr20000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(20000);
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

    public void startTest() {
        double endTime = 0, startTime = 0;
        double measureTime = 0;
        // Random-Number-Array
        for (int i = 0; i <= 12; i++) {
            int[] arr10R = SortingAlgorithm.fillArrayWithRandomNumbers(10);
            startTime = System.currentTimeMillis();
            Arrays.sort(arr10R);
            endTime = System.currentTimeMillis();
            System.out.println("10-Randomnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d);
            measureTime += (endTime - startTime) / 1000d;
        }
        System.out.println("10-Randomnumbers Sort-Time Java Array Sort (average): " + measureTime / 12 + "s");
        measureTime = 0;

        for (int i = 0; i <= 12; i++) {
            int[] arr100R = SortingAlgorithm.fillArrayWithRandomNumbers(100);
            startTime = System.currentTimeMillis();
            Arrays.sort(arr100R);
            endTime = System.currentTimeMillis();
            System.out.println("100-Randomnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d);
            measureTime += (endTime - startTime) / 1000d;
        }
        System.out.println("100-Randomnumbers Sort-Time Java Array Sort (average): " + measureTime / 12 + "s");
        measureTime = 0;
        for (int i = 0; i <= 12; i++) {
            int[] arr1000R = SortingAlgorithm.fillArrayWithRandomNumbers(1000);
            startTime = System.currentTimeMillis();
            Arrays.sort(arr1000R);
            endTime = System.currentTimeMillis();
            System.out.println("1000-Randomnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d);
            measureTime += (endTime - startTime) / 1000d;
        }
        System.out.println("1000-Randomnumbers Sort-Time Java Array Sort (average): " + measureTime / 12 + "s");
        measureTime = 0;
        for (int i = 0; i < 12; i++) {
            int[] arr10000R = SortingAlgorithm.fillArrayWithRandomNumbers(10000);
            startTime = System.currentTimeMillis();
            Arrays.sort(arr10000R);
            endTime = System.currentTimeMillis();
            System.out.println("10000-Randomnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d);
            measureTime += (endTime - startTime) / 1000d;
        }
        System.out.println("1000-Randomnumbers Sort-Time Java Array Sort (average): " + measureTime / 12 + "s");
        measureTime = 0;
        for (int i = 0; i < 12; i++) {
            int[] arr20000R = SortingAlgorithm.fillArrayWithRandomNumbers(20000);
            startTime = System.currentTimeMillis();
            Arrays.sort(arr20000R);
            endTime = System.currentTimeMillis();
            System.out.println("20000-Randomnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d);
            measureTime += (endTime - startTime) / 1000d;
        }
        System.out.println("1000-Randomnumbers Sort-Time Java Array Sort (average): " + measureTime / 12 + "s");

        // Number-Array-Ascend
        int[] arr10A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(10);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr10A);
        endTime = System.currentTimeMillis();
        System.out.println("10-Ascendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr100A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(100);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr100A);
        endTime = System.currentTimeMillis();
        System.out.println("100-Ascendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr1000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(1000);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr1000A);
        endTime = System.currentTimeMillis();
        System.out.println("1000-Ascendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr10000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(10000);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr10000A);
        endTime = System.currentTimeMillis();
        System.out.println("10000-Ascendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr20000A = SortingAlgorithm.fillArrayWithSortedNumbersAscending(20000);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr20000A);
        endTime = System.currentTimeMillis();
        System.out.println("20000-Ascendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");

        // Number-Array-Descending
        int[] arr10D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(10);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr10D);
        endTime = System.currentTimeMillis();
        System.out.println("10-Descendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr100D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(100);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr100D);
        endTime = System.currentTimeMillis();
        System.out.println("100-Descendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr1000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(1000);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr1000D);
        endTime = System.currentTimeMillis();
        System.out.println("1000-Descendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr10000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(10000);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr10000D);
        endTime = System.currentTimeMillis();
        System.out.println("10000-Descendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
        int[] arr20000D = SortingAlgorithm.fillArrayWithSortedNumbersDescend(20000);
        startTime = System.currentTimeMillis();
        Arrays.sort(arr20000D);
        endTime = System.currentTimeMillis();
        System.out.println("20000-Descendingnumbers Sort-Time Java Array Sort: " + (endTime - startTime) / 1000d + "s");
    }

}

