
package ssm171330;
import java.util.*;

public class BinarySearchTree<T extends Comparable<? super T>> implements Iterable<T> {
    static class Entry<T> {
        T element;
        Entry<T> left, right;

        public Entry(T x, Entry<T> left, Entry<T> right) {
            this.element = x;
            this.left = left;
            this.right = right;
        }
    }

    Entry<T> root;
    int size;
    Stack<Entry<T>> s;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    // helper method find(x)
    // returns entry containing x of where it failed to find x
    public Entry<T> find(T x) {
        s = new Stack<>();
        s.push(null);
        return find(root, x);
    }

    // loop invariant s.peek() returns parent of t
    public Entry<T> find(Entry<T> t, T x) {

        if (t == null || t.element == x) {
            return t;
        }

        while (true) {

            if (x.compareTo(t.element) == -1) {
                if (t.left == null) {
                    break;
                }

                else {
                    s.push(t);
                    t = t.left;
                }
            } else if (x.compareTo(t.element) == 0) {
                break;
            }

            else {
                if (t.right == null) {
                    break;
                } else {
                    s.push(t);
                    t = t.right;
                }
            }

        }

        return t;

    }

    /**
     * TO DO: Is x contained in tree?
     */
    public boolean contains(T x) {

        Entry<T> t = find(x);

        if (t == null || t.element.compareTo(x) != 0) {
            return false;
        }
        return true;
    }

    /**
     * TO DO: Is there an element that is equal to x in the tree? Element in tree
     * that is equal to x is returned, null otherwise.
     */
    public T get(T x) {
        Entry<T> t = find(x);
        return t == null ? null : t.element;
    }

    /**
     * TO DO: Add x to tree. If tree contains a node with same key, replace element
     * by x. Returns true if x is a new element added to tree.
     */
    public boolean add(T x) {

        if (size == 0) {
            root = new Entry<T>(x, null, null);
            size++;
            return true;
        }

        else {

            Entry<T> t = find(x);

            if (x.compareTo(t.element) == 0) {
                t.element = x;
                return false;
            } else if (x.compareTo(t.element) < 0) {
                t.left = new Entry(x, null, null);
            } else {
                t.right = new Entry(x, null, null);

            }

            size++;
            return true;
        }

    }

    /**
     * TO DO: Remove x from tree. Return x if found, otherwise return null
     */
    public T remove(T x) {

        if (root == null) {
            return null;

        }
        Entry<T> t = find(x);

        if (x.compareTo(t.element) != 0) {
            return null;
        }

        if (t.left == null || t.right == null) {
            bypass(t);
            size--;
        } else {
            // t has 2 children
            s.push(t);
            Entry<T> minRight = find(t.right, x);
            t.element = minRight.element;
            bypass(minRight);
            size--;
        }
        return x;
    }

    private void bypass(Entry<T> t) {

        Entry<T> parent = s.peek();
        Entry<T> child = t.left == null ? t.right : t.left;

        if (parent == null) {
            root = child;
        } else if (parent.left == t) {
            parent.left = child;
        } else {
            parent.right = child;
        }

    }

    public T min() {

        if (size == 0) {
            return null;
        }
        Entry<T> t = root;
        while (t.left != null) {
            t = t.left;

        }
        return t.element;
    }

    public T max() {
        if (size == 0) {
            return null;
        }
        Entry<T> t = root;

        while (t.right != null) {
            t = t.right;

        }
        return t.element;
    }

    // TODO: Create an array with the elements using in-order traversal of tree
    public Comparable[] toArray() {
        Comparable[] arr = new Comparable[size];
        int index = 0;
        toArray(arr, index, root);
        return arr;

    }

    public void toArray(Comparable[] arr, int index, Entry<T> root) {
        if (root == null) {
            return;
        }
        toArray(arr, index, root.left);
        arr[index++] = root.element;
        toArray(arr, index, root.right);

    }

// Start of Optional problem 2

    /**
     * Optional problem 2: Iterate elements in sorted order of keys Solve this
     * problem without creating an array using in-order traversal (toArray()).
     */
    public Iterator<T> iterator() {
        return null;
    }

    // Optional problem 2. Find largest key that is no bigger than x. Return null if
    // there is no such key.
    public T floor(T x) {
        return null;
    }

    // Optional problem 2. Find smallest key that is no smaller than x. Return null
    // if there is no such key.
    public T ceiling(T x) {
        return null;
    }

    // Optional problem 2. Find predecessor of x. If x is not in the tree, return
    // floor(x). Return null if there is no such key.
    public T predecessor(T x) {
        return null;
    }

    // Optional problem 2. Find successor of x. If x is not in the tree, return
    // ceiling(x). Return null if there is no such key.
    public T successor(T x) {
        return null;
    }


    public void printTree() {
        System.out.print("[" + size + "]");
        printTree(root);
        System.out.println();
    }

    // Inorder traversal of tree
    void printTree(Entry<T> node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(" " + node.element);
            printTree(node.right);
        }
    }

// End of Optional problem 2

    public static void main(String[] args) {
        BinarySearchTree<Integer> t = new BinarySearchTree<>();
        Scanner in = new Scanner(System.in);
        whileloop:
        while(in.hasNext()) {
            int com = in.nextInt();
            switch(com) {
                case 1: //add
                    t.add(in.nextInt());
                    t.printTree();
                    break;
                case 2: //remove
                    t.remove(in.nextInt());
                    t.printTree();
                    break;
                case 3: //get
                    System.out.println(t.get(in.nextInt()));
                    break;
                case 4: //contains
                    System.out.println(t.contains(in.nextInt()));
                    break;
                case 5: //min
                    System.out.println("min of tree is :"+ t.min());
                    break;
                case 6: //max
                    System.out.print("max of tree is: " + t.max());
                    break;
                case 7: //toArray
                    t.printTree();
                    break;
                case 8: //toArray
                    System.out.println(t.size);
                    break;
                default:  // Exit loop
                    break whileloop;
            }
        }
    }


}

