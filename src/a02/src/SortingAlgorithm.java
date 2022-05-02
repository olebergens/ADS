package a02.src;

import java.util.Random;

public abstract class SortingAlgorithm {

    private double startTime;

    public abstract void sort(int[] inputArray);

    public int[] fillArrayWithSortedNumbersAscending(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <= n; i++) arr[i] = i;
        return arr;
    }

    public int[] fillArrayWithSortedNumbersDescend(int n) {
        int[] arr = new int[n];
        for (int i = n; i >= 0; i--) arr[n - i] = i;
        return arr;
    }

    public int[] fillArrayWithRandomNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i <= n; i++) arr[i] = new Random().nextInt();
        return arr;
    }

    /**
     * Benutzung des startTimer und endTimer:
     * vor Aufruf der sort-Funktion den timer starten.
     * Nach Aufruf der sort-Funktion den timer stoppen und den Wert als return getten
     * ...
     * Profit!
     */

    public void startTimer() {
        this.startTime = System.currentTimeMillis();
    }

    public double endTimer() {
        return (System.currentTimeMillis() - this.startTime) / 1000d;
    }

}
