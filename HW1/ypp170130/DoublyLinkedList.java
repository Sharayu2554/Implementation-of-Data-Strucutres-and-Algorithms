/*
    @authors
    Sharayu Mantri - ssm171330
    Yash Pradhan   - ypp170130

    Short Project 1: Extending SinglyLinkedList to DoublyLinkedList

    The DoublyLinkedList extends the SinglyLinkedList and DLLIterator implements the DLLInterface
*/

package ypp170130;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoublyLinkedList<T> extends SinglyLinkedList<T> implements Iterable<T> {

    static class Entry<E> extends SinglyLinkedList.Entry<E>{

        Entry<E> prev;

        //creates Entry node for DoublyLinkedList node with prev, next and data element.
        Entry(E x, Entry<E> next, Entry<E> prev) {
            //data element and next are set by call to super, and prev is set by this constructor
            super(x, next);
            this.prev = prev;
        }
    }

    public DoublyLinkedList() {
        super();
        //call to super, makes initializations like setting linkedlist size to 0

        head = new Entry<>(null, null, null);
        //head is pointing to a dummyNode, this eliminates the need for checking whether head is null

        tail = head;
    }

    public DLLIterator iterator() { return new DLLIterator(); }

    protected class DLLIterator extends SLLIterator implements DLLInterface<T> {

        DLLIterator() {
            super();
        }

        // hasPrev() will return False when the cursor is at the first node following dummyHead, as dummyHead is not actually an element.
        public boolean hasPrev() {
            return cursor != null && ((Entry<T>) cursor).prev!= null && ((Entry) cursor).prev.prev != null;
        }

        // prev() moves the cursor to the previous node, and sets ready flag
        public T prev() {
            cursor = ((Entry<T>) cursor).prev;
            ready = true;
            return cursor.element;
        }


        // this add, insert a node following the current position of the cursor, sets ready flag to false, updates cursor to point to newly inserted node
        public void add(T e) {
            Entry<T> newNode = new Entry<T>(e, null, null);
            newNode.next = cursor.next;
            newNode.prev = ((Entry<T>) cursor);
            if(cursor != tail) {
                ((Entry<T>) cursor.next).prev = newNode;
            }
            else {
                tail = newNode;
            }
            cursor.next = newNode;
            prev = cursor;
            cursor = cursor.next;
            size++;
            ready = false;
        }

        // Removes the current element (retrieved by the most recent next())
        // Remove can be called only if next has been called and the element has not been removed
        @Override
        public void remove() {
            Entry<T> prev = ((Entry<T>) cursor).prev;
            super.remove();
            if(cursor!=tail){
                ((Entry<T>) cursor.next).prev = prev;
            }
        }

        public void printCursor() {
            System.out.println("Current Element : " + cursor.element);
        }
    }

    @Override
    public void add(T x) {
        Entry<T> newNode = new Entry<>(x, null, null);
        newNode.prev = (DoublyLinkedList.Entry<T>)tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public static void main(String args[]) {
        int n = 10;
        if(args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        DoublyLinkedList<Integer> lst = new DoublyLinkedList<>();
        for(int i=1; i<=n; i++) {
            lst.add(Integer.valueOf(i));
        }

        lst.printList();
        Integer test = 0;
        DoublyLinkedList<Integer>.DLLIterator it = lst.iterator();
        Scanner in = new Scanner(System.in);
        try {
            whileloop:
            while(in.hasNext()) {
                int com = in.nextInt();
                /*
                    Cases:
                            1: to move cursor to the next element, if one exists
                            2: to remove element at the cursor
                            3: to move cursor to the previous element, if one exists
                            4: adds an element which is given as input following 4
                            5: prints cursor element, integer value in this case

                */
                switch(com) {
                    case 1:  // Move to next element and print it
                        if (it.hasNext()) {
                            System.out.println(it.next());
                        } else {
                            System.out.println("There is no next element in the list");
                            //break whileloop;
                        }
                        break;
                    case 2:  // Remove element
                        it.remove();
                        lst.printList();
                        break;
                    case 3:
                        if (it.hasPrev()) {
                            System.out.println(it.prev()); 
                        } else {
                            System.out.println("There is no previous element in the list");
                            //break whileloop;
                        }
                        break;
                    case 4:
                        System.out.println("Enter Number to add: ");
                        it.add(in.nextInt());
                        lst.printList();
                        break;
                    case 5:
                        it.printCursor();
                        break;
                    case 6:
                        lst.printList();
                        break;
                    default:  // Exit loop
                        System.out.println("Instruction not known, exiting code.");
                        break whileloop;
                }
            }
            lst.printList();
        }
        catch (NoSuchElementException e) {
           System.out.println("Cannot Perform Consecutive Remove operations without moving iterator.");
        }
    }
}