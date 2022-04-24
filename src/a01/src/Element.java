package a01.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
public class Element {
    int val;
    int prio;
    Element next = null;

    public Element(int val, int prio) {
        this.val = val;
        this.prio = prio;
    }

    @Override
    public String toString() {
        return "PQueue{" +
                "elementItem.val = " + val + ", " +
                "elementItem.prio = " + prio +
                '}';
    }

}
