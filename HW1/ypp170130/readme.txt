This is a readme file containing instructions for executing homework 1.

Authors:
1. Sharayu Mantri - ssm171330
2. Yash Pradhan   - ypp170130

The uploaded folder with name as my netid: ypp170130 contains three java files.
1. SinglyLinkedList.java
2. DLLInterface.java
3. DoublyLinkedList.java

Steps for running the files from cmd

NOTE: while executing from command prompt, the pwd should be the directory containing

1. Compile the SinglyLinkedList.java by executing following command
	> javac ypp170130/SinglyLinkedList.java

2. Compile the DLLInterface.java by executing following command
	> javac ypp170130/DLLInterface.java

3. Compile the DoublyLinkedList.java by executing following command
	> javac ypp170130/DoublyLinkedList.java

4. To run the main(driver) program
	
	> java ypp170130/DoublyLinkedList
	This will create a doubly linked list of default size 10, with nodes with values 1 to 10

	> java ypp170130/DoublyLinkedList X
	This will create a doubly linked list of size of the nonnegative integer X provided as command line argument, 
	here doubly linked list of size say X = 10 will be created.

	by following the above commands, the console would display following:

	10: 1 2 3 4 5 6 7 8 9 10


	Cases: 
			1: to move cursor to the next element, if one exists
            2: to remove element at the cursor
            3: to move cursor to the previous element, if one exists
            4: adds an element which is given as input following 4
            5: prints cursor element, integer value in this case
            6: print entire list


	Note: initially cursor is at dummy head, and performing instruction case 1 would move it to first node which has value 1.

	Sample Input:

	1 1 5 1 2 1 3 1 1 1 4 99 5 1 3 3 3 6 

	Sample Output:

	10: 1 2 3 4 5 6 7 8 9 10 						//entire doubly linked list is printed first
	
	1												//1 cursor moves to first node, value is printed
	2												//1 cursor moves to next node, value is printed
	Current Element : 2								//5 cursor element is printed via instruction 5
	3												//1 cursor moves to the next node, value is printed
	9: 1 2 4 5 6 7 8 9 10 							//2 remove is done, node 3 is removed, doubly linked list is printed, cursor moves prev
	4												//1 cursor moves to next node, value is printed
	2												//3 cursor moves to previous node, value is printed
	4												//1 cursor moves to next node, value is printed		
	5												//1 cursor moves to next node, value is printed
	6												//1 cursor moves to next node, value is printed
	Enter Number to add: 							//instruction 4, the next integer value is inserted after the cursor, cursor moves to newly inserted node
	10: 1 2 4 5 6 99 7 8 9 10 						//  99 has been inserted between nodes 6 and 7, cursor points to 99 
	Current Element : 99							//5 cursor element is printed via instruction 5
	7												//1 cursor moves to next node, value is printed
	99												//3 cursor moves to previous node, value is printed
	6												//3 cursor moves to previous node, value is printed
	5												//3 cursor moves to previous node, value is printed
	10: 1 2 4 5 6 99 7 8 9 10 						//6 entire contents are printed


	# Calling remove will only succeed if the call to remove is after instruction 1 or 3(which moves the iterator)
	# Consecutive calls to add will insert nodes, and unset the ready flag
	# If at first node, case 3 would say, no previous element
	# If at last node, case 1 would say, no next element
