public class PrioTest {

    PQueue pQueue;
    int size;

    /**
     * @param size of elements in the queue with random Priority!
     */
    public PrioTest(int size) {
        this.pQueue = new PQueue();
        this.size = size;
    }

    private void setUp() {
        for (int i = 0; i < size; i++) {
            int prio = (int) (Math.random() * 8) + 1; // generate prio within boundary 1-10
            this.pQueue.pqinsert(new Element(i, prio));
        }
    }

    /**
     * per setUp-Funktion füllen wir die Queue einfach mit random Werten und geben dann die Queue einfach per dieser
     * Funktion aus -> sehen dann, dass die insert-Funktion funktioniert!
     */
    private void testInsert() {
        setUp();
        while (this.pQueue.elementItem != null) {
            printElement(this.pQueue.elementItem);
            this.pQueue.elementItem = this.pQueue.elementItem.next;
        }
    }

    private void printElement(Element element) {
        System.out.println("val: " + element.val + " | prio: " + element.prio);
    }


    public static void main(String... args) {
        PrioTest prioTest = new PrioTest(40);
        prioTest.testInsert();
    }

}
