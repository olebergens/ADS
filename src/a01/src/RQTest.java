package a01.src;

public class RQTest {

    RQueue rqTest;

    /**
     * Beim Aufruf des Konstruktors wird die Queue mit drei Elementen gefüllt, um die Funktionsfähigkeit zu testen.
     */
    public PrioTest() {
        this.rqTest = new RQueue();
        rqTest.rqinsert(50, 20);
        rqTest.rqinsert(20, 30);
        rqTest.rqinsert(10, 30);
    }

    void testInsert() {
        System.out.println("--- Ausgabe Elemente in PQ ---");
        System.out.println(rqTest.head.toString());
        System.out.println(rqTest.head.next.toString());
        System.out.println(rqTest.head.next.next.toString());
        System.out.println("--- Ende Ausgabe Elemente in PQ ---");
        System.out.println("Length of queue: " + rqTest.length);
        System.out.println();
    }

    void testFront() {
        System.out.println("--- Ausgabe Front-Elemente in PQ ---");
        System.out.println(rqTest.rqfront().toString());
        System.out.println("--- Ende Ausgabe Front-Elemente in PQ ---");
        System.out.println();
    }

    void testRemove() {
        rqTest.pqremove();
        System.out.println("--- Ausgabe Queue without Element ---");
        System.out.println(pqTest.head.toString());
        System.out.println(pqTest.head.next.toString());
        System.out.println("--- Ende Ausgabe Queue without Element ---");
    }


    public static void main(String... args) {
        PrioTest prioTest = new PrioTest();
        prioTest.testInsert();

        prioTest.testFront();
        prioTest.testRemove();
        System.out.println("Length of Queue: " + prioTest.rqTest.length);
    }
}
