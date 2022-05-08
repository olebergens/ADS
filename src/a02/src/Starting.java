/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */

package a02.src;

public class Starting {

    public static void main(String... args) {
        SortTest sortTest = new SortTest();
        System.out.println("----- START TESTING SHELLSORT -----");
        sortTest.startTest(new ShellSort());
        System.out.println();
        System.out.println("----- START TESTING SEARCHSORT -----");
        sortTest.startTest(new SearchSort());
        System.out.println();
        System.out.println("----- START TESTING JAVA ARRAYSORT -----");
        sortTest.startTest();
        System.out.println();
    }

}
