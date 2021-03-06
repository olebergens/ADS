package a01.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
public class PQueue {

    Element elementItem, errorel;
    public int length = 0;

    public PQueue() {
        this.elementItem = null;
        this.errorel = new Element();
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
        if (this.elementItem == null) {
            this.elementItem = element;
            return this;
        }
        Element tmp = this.elementItem;
        Element prev = null;

        while (tmp != null && tmp.prio > element.prio) {
            prev = tmp;
            tmp = tmp.next;
        }

        // Hier gibts jetzt die verschiedensten kleinen feinen Unterschiede
        if (tmp != null)
            // Case 1: das Element wird vor dem Element eingefügt welches eine kleinere Priorität als das einzufügende Element hat
            if (prev != null) {
                element.next = tmp;
                prev.next = element;
            } else { // Case 2: alle Elemente haben eine kleinere Priorität als das einzufügende Element -> das einzufügende Element wird am start eingesetzt
                element.next = this.elementItem;
                this.elementItem = element;
            }
        else  // Case 3: kein Element hat eine kleinere Priorität als dieses Element
            prev.next = element;

        this.length++;
        return this;
    }

    /**
     * @param val: value welche in einem element gespeichert werden soll
     * @param prio: priorität welche in einem element gespeichert werden soll
     *  Frage: Ich wusste nicht genau was bei der Spezifikation gemeint ist. Da dort von einem Element und einer Priorität gesprochen wird!
     *            Also hab ich einfach beides gemacht.. pqinsert für ein Element und pqinsert für eine value und einer priorität
     *            Unterschied ist eigentlich nur, dass ich das Element dann nicht bei der Übergabe erstelle sondern einfach in der Funktion selbst
     */
    public PQueue pqinsert(int val, int prio) {
        Element element = new Element(val, prio);
        if (this.elementItem == null) {
            this.elementItem = element;
            return this;
        }
        Element tmp = this.elementItem;
        Element prev = null;

        while (tmp != null && tmp.prio > element.prio) {
            prev = tmp;
            tmp = tmp.next;
        }

        // Hier gibts jetzt die verschiedensten kleinen feinen Unterschiede
        if (tmp != null)
            // Case 1: das Element wird vor dem Element eingefügt welches eine kleinere Priorität als das einzufügende Element hat
            if (prev != null) {
                element.next = tmp;
                prev.next = element;
            } else { // Case 2: alle Elemente haben eine kleinere Priorität als das einzufügende Element -> das einzufügende Element wird am start eingesetzt
                element.next = this.elementItem;
                this.elementItem = element;
            }
        else  // Case 3: kein Element hat eine kleinere Priorität als dieses Element
            prev.next = element;

        this.length++;
        return this;
    }

    /**
     * @return das Front-Element der Queue (das Element mit der höchsten Priorität in der Queue)
     * Aufgabe 1c)
     * Wenn die Prioritätswarteschlange leer ist, so returne ich auch einfach null, da es ja kein front Element gibt in einer leeren Warteschlange.
     */
    public Element pqfront() {
        if (this.elementItem != null) return this.elementItem;
        return errorel;
    }

    /**
     * @return Queue ohne das Element -> das aktuelle Element mit der höchsten Priorität wird entfernt
     */
    public PQueue pqremove() {
        Element tmp = this.elementItem;
        Element prev = null;
        while (tmp.prio == tmp.next.prio) {
            prev = tmp;
            tmp = tmp.next;
        }
        assert prev != null;
        prev.next = tmp;
        this.elementItem = prev;
        this.elementItem = this.elementItem.next;
        this.length--;
        return this;
    }

}
