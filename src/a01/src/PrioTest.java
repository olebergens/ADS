package a01.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
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
        System.out.println("Length of queue: " + pqTest.length);
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
        pqTest.pqremove();
        System.out.println("--- Ausgabe Queue without Element ---");
        System.out.println(pqTest.elementItem.toString());
        System.out.println(pqTest.elementItem.next.toString());
        System.out.println("--- Ende Ausgabe Queue without Element ---");
    }

    /**
     * Test-Output:
     * --- Ausgabe Elemente in PQ ---
     * PQueue{elementItem.val = 10, elementItem.prio = 30}
     * PQueue{elementItem.val = 20, elementItem.prio = 30}
     * PQueue{elementItem.val = 50, elementItem.prio = 20}
     * --- Ende Ausgabe Elemente in PQ ---
     * Length of queue: 3
     *
     * --- Ausgabe Front-Elemente in PQ ---
     * PQueue{elementItem.val = 10, elementItem.prio = 30}
     * --- Ende Ausgabe Front-Elemente in PQ ---
     *
     * --- Ausgabe Queue without Element ---
     * PQueue{elementItem.val = 20, elementItem.prio = 30}
     * PQueue{elementItem.val = 50, elementItem.prio = 20}
     * --- Ende Ausgabe Queue without Element ---
     * Length of Queue: 2
     */
    public static void main(String... args) {
        PrioTest prioTest = new PrioTest();
        // Hier testen wir ob die drei Elemente in die Queue gelangt sind.
        prioTest.testInsert();
        // Hier testen wir ob das erste Element der Queue auch das Element ist, welches die höchste Priorität hat und als erstes hinzugefügt wurde.
        prioTest.testFront();
        // Hier testen wir, ob die remove-Funktion auch das Element mit der höchsten Element entfernt (seien mehrere Elemente
        // mit gleich höchster Priorität in der Queue so wird das älteste Element von diesem entfernt!)
        prioTest.testRemove();
        // Hier geben wir die Länge der Queue aus, um zu sehen, wie viele Elemente in der Queue sind
        System.out.println("Length of Queue: " + prioTest.pqTest.length);
    }

}
