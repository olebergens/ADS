/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */

package a02.src;

public class BubbleSort extends SortingAlgorithm {
//Sucht das kleinste Element im Array und speichert sie dann in pos.
//Sollte es das kleinste Element sein, dann fügt sie das kleinste Element(input[pos]) an der i-te Stelle
	@Override
    public void sort(int[] input) {
        int fin,tmp;
        while(fin==0) {
        	fin = 1;
        	for(int i = 0; i < (input.length-1); i++) {
        		if(input[i] < input[i+1]) {
        			fin = 0;
        			tmp = input[i];
        			input[i] = input[i+1];
        			input[i+1] = tmp;
        		}
        	}
        
        }
    }
}