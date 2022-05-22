package a03.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
public class Test {

    public static void main(String... args) {
        int[] max = SortingTest.fillArrayWithRandomNumbers(100);
        MoTQuicksort moTQuicksort = new MoTQuicksort();
        moTQuicksort.quicksort(max);
        for (int i = 0; i < max.length; i++)
            System.out.println(max[i]);

        SortingTest sortingTest = new SortingTest();
        sortingTest.startTest(new MoTQuicksort());
        sortingTest.startTest(new NativeQuicksort());
    }

}
