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
    }

}
