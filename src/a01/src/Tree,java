/**
 * @AUTHOR: Ole Bergens, 221200097
 * @AUTHOR: Blazej Schott, 221200610
 * @AUTHOR: Antonin Gräser, 221201792
 * @AUTHOR: Nils Martin, 221202136
 */

//Aufgabe 2.
package a01.src;

public class Tree {
    final public static int ERRORVAL = -1;
    private int val;
    private Tree left, right, parent = null;

    static Tree emptyTree() {
        return null;
    }

    static Tree consTree(int v, Tree left, Tree right) {
        Tree t = new Tree();
        t.val = v;
        t.left = left;
        t.right = right;
        if (t.left != null)
            left.parent = t;
        if (t.right != null)
            right.parent = t;
        return t;
    }

    static Tree leftTree(Tree t) {
        if (t == null)
            System.out.println("(left) empty tree");
        else
            t = t.left;
        return t;
    }

    static Tree rightTree(Tree t) {
        if (t == null)
            System.out.println("(right) empty tree");
        else
            t = t.right;
        return t;
    }

    static Tree parentTree(Tree t) {
        if (t == null)
            System.out.println("(parent) empty tree");
        else
            t = t.parent;
        return t;
    }

    static int valueTree(Tree t) {
        if (t == null)
            System.out.println("(value) empty tree");
        int v = t.val;
        return v;
    }

    static void inorder(Tree t) {
        if (t != null) {
            inorder(t.left);
            System.out.print(t.val + " ");
            inorder(t.right);
        }
    }

    static void preorder(Tree t) {
        if (t != null) {
            System.out.print(t.val + " ");
            preorder(t.left);
            preorder(t.right);
        }
    }

    static void postorder(Tree t) {
        if (t != null) {
            postorder(t.left);
            postorder(t.right);
            System.out.print(t.val + " ");
        }
    }

    static Tree insertTree(Tree t, int v) {
        Tree newNode = consTree(v, null, null);
        if (t == null)
            return newNode;
        if (v == t.val)
            return t;
        if (v < t.val) {
            if (t.left == null)
                t.left = newNode;
            else
                t = insertTree(t.left, v);
        }
        if (v > t.val) {
            if (t.right == null)
                t.right = newNode;
            else
                insertTree(t.right, v);
        }
        return t;
    }

    public static void main(String[] args) {
        Tree t_1 = new Tree();
        t_1 = consTree(42, consTree(10, emptyTree(), emptyTree()), consTree(55, emptyTree(), emptyTree()));
        System.out.println("t_1:");
        System.out.println(" left tree: " + valueTree(leftTree(t_1)));
        System.out.println(" right tree: " +  valueTree(rightTree(t_1)));
        System.out.println(" parent tree from right tree: " +  valueTree(parentTree(rightTree(t_1))));
        System.out.println(" value tree: " + valueTree(t_1));
        System.out.print("\n");

        Tree t_2 = insertTree(null, 5);
		insertTree(t_2, 3);
		insertTree(t_2,2);
		insertTree(t_2, 4);
		insertTree(t_2, 8);
		insertTree(t_2, 6);
		insertTree(t_2, 7);
		insertTree(t_2, 9);

        System.out.println("t_2:");
        System.out.print(" preorder from tree t_2: ");
        preorder(t_2); //W-L-R
        System.out.println();
        System.out.print(" inorder from tree t_2: ");
        inorder(t_2); //L-W-R
        System.out.println();
        System.out.print(" postorder from tree t_2: ");
        postorder(t_2); //L-R-W
        System.out.println();    
    }
}
