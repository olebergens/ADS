/**
 * Die Priority-Queue ist so aufgebaut, dass ich jedes Element nach ihrer Priorität in die Schlange einfüge.
 * Dabei ist die Schlange dann Prioritätsabwärts sortiert. Also die hächste Priorität ist das erste Element und die niedrigste Priorität ist das letzte Element.
 */
public class PQueue {

    Element elementItem;

    public PQueue() {
        this.elementItem = null;
    }

    /**
     * Kann entfernt werden, da wenn wir den Konstruktor aufrufen die Queue leeren und eine neue erstellen.
     */
    public PQueue pqempty() {
        return new PQueue();
    }

    /**
     * @param element: Element welches in die Queue gelangen soll
     */
    public PQueue pqinsert(Element element) {
        PQueue pQueue = new PQueue();
        if (this.elementItem == null) this.elementItem = element;
        Element elementTmp = this.elementItem;
        Element elementPrev = null;

        while (elementTmp != null && elementTmp.prio > element.prio) {
            elementPrev = elementTmp;
            elementTmp = elementTmp.next;
        }

        if (elementTmp == null) {
            assert elementPrev != null;
            elementPrev.next = element;
        } else if (elementPrev == null) {
            element.next = this.elementItem;
            this.elementItem = element;
        } else {
            element.next = elementTmp;
            elementPrev.next = element;
        }
        pQueue.elementItem = this.elementItem;
        return pQueue;
    }

    /**
     * @return das Front-Element der Queue (das Element mit der höchsten Priorität in der Queue)
     * Wenn die Prioritätswarteschlange leer ist, so returne ich auch einfach null, da es ja kein front Element gibt in einer leeren Warteschlange.
     */
    public Element pqfront() {
        if (this.elementItem != null) return this.elementItem;
        return null;
    }

    /**
     * @return Queue ohne das Element -> das aktuelle Element mit der höchsten Priorität wird entfernt
     */
    public PQueue pqremove() {
        return null;
    }

    public static void testcase() {
        Element element1 = new Element(50, 20);
        Element element2 = new Element(20, 30);
        Element element3 = new Element(10, 30);
        PQueue pqTest = new PQueue();
        pqTest.pqinsert(element1);
        pqTest.pqinsert(element2);
        pqTest.pqinsert(element3);
        pqTest.pqremove();
        System.out.println(pqTest.elementItem.val);
        System.out.println(pqTest.elementItem.next.val);
        System.out.println(pqTest.elementItem.next.next.val);
        System.out.println("HEAD:" + pqTest.pqfront().val);
    }


    public static void main(String... args) {
        testcase();
    }

}
