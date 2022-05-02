package a02.src;

public class ShellSort extends SortingAlgorithm {

    @Override
    public void sort(int[] inputArray) {
        int mid = inputArray.length / 2;
        for (; mid > 0; mid /= 2) {
            for (int i = 0; (i + mid) < inputArray.length; i += mid) {
                if (inputArray[i] > inputArray[i + mid]) {
                    int temp = inputArray[i + mid];
                    inputArray[i + mid] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        }
    }
}
