package a02.src;

import java.util.Random;

public abstract class SortingAlgorithm {

    private double startTime;

    public abstract void sort(int[] inputArray);

    public int[] fillArrayWithSortedNumbersAscending(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) arr[i] = i;
        return arr;
    }

    public int[] fillArrayWithSortedNumbersDescend(int n) {
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) arr[n - i] = i;
        return arr;
    }

    public int[] fillArrayWithRandomNumbers(int n) {
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
        return (System.currentTimeMillis() - this.startTime) / 1000d;
    }

}
