package HA01KW16;

/**
 * @AUTHOR: Ole Bergens, 221200097
 */
public class PQueue {

    Element elementItem;
    public int length = 0;

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
        if (this.elementItem == null) {this.elementItem = element;}
        Element elementTmp = this.elementItem;
        Element elementPrev = null;

        while (elementTmp != null && elementTmp.prio > element.prio) {
            elementPrev = elementTmp;
            elementTmp = elementTmp.next;
        }

        if (elementTmp == null) {
            if (elementPrev != null) elementPrev.next = element;
        } else if (elementPrev == null) {
            element.next = this.elementItem;
            this.elementItem = element;
        } else {
            element.next = elementTmp;
            elementPrev.next = element;
        }
         this.length++;
        return this;
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
     * TODO: ES WIRD DAS ERTE ELEMENT ENTFERNT -> BEI GLEICHER PRIO WIRD ABER DAS NEUESTE ELEMENT ENTFERNT UND NICHT DAS ÄLTESTE!
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
