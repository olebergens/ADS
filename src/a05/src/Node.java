/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
package a05.src;

public class Node {
    int value; //Wert/Schlüssel
    int height; //Höhe

    Node right = null;
    Node left = null;

    public Node(int value){
        this.value = value;
    }
}
