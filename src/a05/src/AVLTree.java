/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */
package a05.src;

public class AVLTree {

    private Node root;
    void updateHeight(Node node) {
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    int height(Node node) {
        return node == null ? -1 : node.height;
    }

    int balanceFactor(Node node) {
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
    //Zu machen: Insert und Fixinser siehe Vorlesung!!!
    //Zusatzt del und fixdel

}
