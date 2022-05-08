/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */

package a02.src;

public class ShellSort extends SortingAlgorithm {

    @Override
    public void sort(int[] inputArray) {
        int mid = inputArray.length / 2;
        for (; mid > 0; mid /= 2) {
            for (int i = 0; (i + mid) < inputArray.length; i++) {
                for (int j = 0; (j + mid) < inputArray.length; j += mid) {
                    if (inputArray[j] > inputArray[j + mid]) {
                        int temp = inputArray[j + mid];
                        inputArray[j + mid] = inputArray[j];
                        inputArray[j] = temp;
                    }
                }
            }
        }
    }

}
