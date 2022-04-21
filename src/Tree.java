public class Tree {
    int val;
    Tree left, right, parent;

    public Tree() {
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public Tree(int val, Tree tl, Tree tr) {
        this.val = val;
        this.left = tl;
        this.right = tr;
        this.parent = null;

    }

    Tree empty() {
        return null;
    }

    Tree right(Tree tree) {
        Tree tmp = null;
        if (tree == null) System.out.println("{right} Empty tree");
        else tmp = tree.right;
        return tmp;
    }

    Tree left(Tree tree) {
        Tree tmp = null;
        if (tree == null) System.out.println("{left} Empty tree");
        else tmp = tree.left;
        return tmp;
    }

    Tree parent(Tree tree) {
        Tree tmp = null;
        if (tree == null) System.out.println("{parent} Empty tree");
        else tmp = tree.parent;
        return tmp;
    }

    int value(Tree tree) {
        int tmp = -1;
        if (tree == null) System.out.println("{value} Empty tree");
        else tmp = tree.val;
        return tmp;
    }

}
