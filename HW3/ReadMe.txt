This is a readme file containing instructions for executing homework 1.

Authors:
1. Sharayu Mantri - ssm171330
2. Sheetal Kadam (sak170006)

The uploaded folder with name as my netid: ssm171330 contains three java files.
1. BinaryHeap.java

Steps for running the files from cmd

NOTE: while executing from command prompt, the pwd should be the directory containing

1. Compile the SinglyLinkedList.java by executing following command
	> javac ssm171330/BinaryHeap.java

2. To run the main(driver) program
	
	> java ssm171330/BinaryHeap
	This will create a Queue of default size 10, with nodes with values 1 to 10

	> java ssm171330/BinaryHeap

	by following the above commands, the console would display following:

	2 7 4 8 9 
	//I have pushed this value in array [8, 7, 4, 2, 9] and passed array to binaryheap, 
	//binaryHeap then called heapify before creating the actual heap. 


	Cases: 
    	1: to push an element in queue, if queue is not full else, it will throw an exception saying queue is full
        2: to remove an element from queue, if queue is not empty else it will throw an exception saying queue is full
        3: to push an element in queue, if queue is not full else, it will return false
        4: to remove an element from queue, if queue is not empty else it will return false
        5: prints queue


	Note: initially cursor is at rear and queue is already full, and performing instruction case 1 (trying to add element in full queue will return false)

	Sample Input:

	2 7 4 8 9 
	1 //option to add element
	1 //add element
	1 7 2 8 9 4 
	1 //option to add element
	5 //add element
	1 7 2 8 9 4 5 
	1 //option to add element
	6 //add element
	1 6 2 7 9 4 5 8 
	1  //option to add element
	3 //add element
	1 3 2 6 9 4 5 8 7 
	1 //option to add element
	0 //add element
	0 1 2 6 3 4 5 8 7 9 
	2 //remove element from queue
	0 //add element
	1 3 2 6 9 4 5 8 7 
	2 //remove element from queue
	1  //removed element
	2 3 4 6 9 7 5 8 
	2 //remove element from queue
	2  //removed element
	3 6 4 8 9 7 5 
	2 //remove element from queue
	3  //removed element
	4 6 5 8 9 7 
	2 //remove element from queue
	4  //removed element
	5 6 7 8 9 
	2 //remove element from queue
	5  //removed element
	6 8 7 9 
	2 //remove element from queue
	6  //removed element
	7 8 9 
	2 //remove element from queue
	7  //removed element
	8 9 
	2 //remove element from queue
	8  //removed element
	9 
	2 //remove element from queue
	9  //removed element
	

	
