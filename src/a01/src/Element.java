package a01.src;

/**
 * @AUTHOR: Ole Bergens, 221200097
 */
public class Element {
    int val;
    int prio;
    Element next;

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
