/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
package a05.src;

public class AVLTree {

    void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    private int balanceFactor(Node node) {
        return (node == null) ? 0 : height(node.right) - height(node.left);
    }

    private Node rotateRight(Node node) { //Rechtsrotation
        Node leftChild = node.left;

        node.left = leftChild.right;
        leftChild.right = node;

        updateHeight(node);
        updateHeight(leftChild);

        return leftChild;
    }

    private Node rotateLeft(Node node) { //Linksrotation
        Node rightChild = node.right;

        node.right = rightChild.left;
        rightChild.left = node;

        updateHeight(node);
        updateHeight(rightChild);

        return rightChild;
    }

    public Node insert(Node node, int value) {
        Node newNode = new Node(value);

        if (node == null)
            return newNode;

        if (node.value == value)
            return node;

        if (value < node.value) {
            if (node.left == null)
                node.left = newNode;
            else
                node.left = insert(node.left, value);
        } else {
            if (node.right == null)
                node.right = newNode;
            else
                node.right = insert(node.right, value);
        }

        updateHeight(node);

        return fixinsert(node);
    }

    public Node fixinsert(Node node) { //fixinsert == fixdelete
        int balancefactor = balanceFactor(node);

        //Ist der linke Teilbaum gewachsen bzw. linkslastig?
        //Balancefaktor(node) < -1 und Balancefaktor(node.left) <= 0 oder Balancefaktor(node.left) > 0
        if (balancefactor < -1) {
            if (balanceFactor(node.left) <= 0)
                rotateRight(node);  //Rechtsrotation wenn Balancefaktor(node.left) <= 0
            else if (balanceFactor(node.left) > 0) {
                node.left = rotateLeft(node); //Links- Rechtsrotation wenn Balancefaktor(node.left) > 0
                node = rotateRight(node);
            }
        }

        //Ist der rechte Teilbaum gewachsen bzw. rechtslastig?
        //Dann ist Balancefaktor(node) > 1 und Balancefaktor(node.right) >= 0 oder Balancefaktor(node.right) < 0
        if (balancefactor > 1) {
            if (balanceFactor(node.right) >= 0)
                rotateLeft(node);
            else if (balanceFactor(node.right) < 0) {
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        }
        updateHeight(node);
        return node;
    }

    private Node mostLeftLeaf(Node node) {
        Node tmp = node;

        while (tmp.left != null) {
            tmp = node.left;
        }
        return tmp;
    }

    public Node delete(Node node, int value) {
        if (node == null) return node;

        if (value > node.value) {                      //wennn value größer als node.value ist muss er im rechten Teilbaim sein.
            node.right = delete(node.right, value);
        }

        if (value < node.value)                      //Hier dementsprechend im Linken.
            node.left = delete(node.left, value);

        else {
            if ((node.left == null) || (node.right == null)) { //Knoten mit einen Blatt oder garkeinem
                Node tmp;

                if (node.left != null) //überprüft welches Blatt null ist
                    tmp = node.left;
                else
                    tmp = node.right;

                if (tmp == null) {  //Überprüft ob es keine Blätter gibt
                    tmp = node;
                    node = null;
                } else //Ein Blatt
                    node = tmp;

                tmp = null;
            } else {                                    //knoten mit zwei Blätter
                Node tmp = mostLeftLeaf(node.right);
                node.value = tmp.value;
                node.right = delete(node.right, node.value);
            }
        }

        if (node != null) {
            updateHeight(node);
            node = fixinsert(node); //fixinsert == fixdelete
        } else return node;

        return node;
    }
}
