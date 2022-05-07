/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */

package a02.src;

public class SearchSort extends SortingAlgorithm {
//Sucht das kleinste Element im Array und speichert sie dann in pos.
//Sollte es das kleinste Element sein, dann fügt sie das kleinste Element(input[pos]) an der i-te Stelle
    @Override
    public void sort(int[] input) {
        int tmp;
        int pos;
        for (int i = 0; i <= input.length - 2; i++) {
            pos = i;
            for (int j = i + 1; j <= input.length - 1; j++) {
                if (!(input[j] > input[pos]))
                    pos = j;
                }
            tmp = input[i];
            input[i] = input[pos];
            input[pos] = tmp;
        }
    }
}