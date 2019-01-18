/*
    @authors
    Sharayu Mantri - ssm171330
    Yash Pradhan   - ypp170130

    Short Project 1: Extending SinglyLinkedList to DoublyLinkedList

	This interface would be implement by DoublyLinkedList 

*/

package ypp170130;



public interface DLLInterface<T> {
	
	boolean hasPrev();
	//returns true if there is a previous node, false otherwise

	T prev();
	//moves the cursor to the previous node, this should be called only after hasPrev() returns true

	boolean hasNext();
	//returns true if there is a next node, false otherwise

	T next();
	//moves the cursor to the next node, this should be called only after hasNext() returns true

	void remove();
	//if the ready flag is set, this would remove the node that is being pointed by cursor, cursor moves one step back(cursor = cursor.previous)

	void add(T x);
	//adds new node with data element x at the position after the cursor, cursor is updated to point to this newly inserted node.
}
