package a01.src;

public class RQTest {

    RQueue rqTest;

    /**
     * Beim Aufruf des Konstruktors wird die Queue mit drei Elementen gefüllt, um die Funktionsfähigkeit zu testen.
     */
    public RQTest() {
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
        RQTest rq = new RQTest();
        rq.testInsert();

        rq.testFront();
        rq.testRemove();
        System.out.println("Length of Queue: " + rq.rqTest.length);
    }
}
