package HA01KW16;

public class PrioTest {

    PQueue pqTest;

    /**
     * Beim Aufruf des Konstruktors wird die Queue mit drei Elementen gefüllt, um die Funktionsfähigkeit zu testen.
     */
    public PrioTest() {
        this.pqTest = new PQueue();
        pqTest.pqinsert(new Element(50, 20));
        pqTest.pqinsert(new Element(20, 30));
        pqTest.pqinsert(new Element(10, 30));
    }

    /**
     * Beim Aufruf des Konstruktors wird die Queue mit drei Elementen gefüllt. Nun wenn ich diese ausgeben will,
     * müssen diese ja nun in der richtigen Reihenfolge in der PQ sein:
     * 10, 20, 50 -> da 10[prio:30], 20[prio:30], 50[prio:20] -> 10 vor der 20, da 10 nach 20 eingefügt
     */
    void testInsert() {
        System.out.println("--- Ausgabe Elemente in PQ ---");
        System.out.println(pqTest.elementItem.toString());
        System.out.println(pqTest.elementItem.next.toString());
        System.out.println(pqTest.elementItem.next.next.toString());
        System.out.println("--- Ende Ausgabe Elemente in PQ ---");
        System.out.println();
    }

    /**
     * Beim Aufruf dieser Funktion muss das vorderste Element in der Queue ausgegeben werden. Das Element in diesem Fall
     * ist auch das Element mit der höchsten Priorität (falls mehrere mit der höchsten Priorität bestehen, dann das
     * neueste aus der Queue)
     */
    void testFront() {
        System.out.println("--- Ausgabe Front-Elemente in PQ ---");
        System.out.println(pqTest.pqfront().toString());
        System.out.println("--- Ende Ausgabe Front-Elemente in PQ ---");
        System.out.println();
    }

    void testRemove() {
        testInsert();
        pqTest.pqremove();
        System.out.println("--- Ausgabe Queue without Element ---");
        System.out.println(pqTest.elementItem.toString());
        System.out.println(pqTest.elementItem.next.toString());
        System.out.println("--- Ende Ausgabe Queue without Element ---");
    }

    public static void main(String... args) {
        PrioTest prioTest = new PrioTest();
        // Hier testen wir ob die drei Elemente in die Queue gelangt sind.
        prioTest.testInsert();
        // Hier testen wir ob das erste Element der Queue auch das Element ist, welches die höchste Priorität hat und als erstes hinzugefügt wurde.
        prioTest.testFront();
        // Hier geben wir die Länge der Queue aus, um zu sehen, wie viele Elemente in der Queue sind
        System.out.println("Length of Queue: " + prioTest.pqTest.length);
        // Hier testen wir, ob die remove-Funktion auch das Element mit der höchsten Element entfernt (seien mehrere Elemente
        // mit gleich höchster Priorität in der Queue so wird das älteste Element von diesem entfernt!)
        prioTest.testRemove();
        // Hier geben wir die Länge der Queue aus, um zu sehen, wie viele Elemente in der Queue sind
        System.out.println("Length of Queue: " + prioTest.pqTest.length);
    }

}
