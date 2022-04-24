package a01.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
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
     * Aufgabe 1c)
     *  Wenn die Prioritätswarteschlange leer ist, so returne ich auch einfach null, da es ja kein front Element gibt in einer leeren Warteschlange.
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

}
