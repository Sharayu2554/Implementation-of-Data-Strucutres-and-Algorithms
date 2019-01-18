This is a readme file containing instructions for executing homework 1.

Authors:
1. Sharayu Mantri - ssm171330
2. Sheetal Kadam (sak170006)

The uploaded folder with name as my netid: ssm171330 contains three java files.
1. BoundedQueue.java

Steps for running the files from cmd

NOTE: while executing from command prompt, the pwd should be the directory containing

1. Compile the SinglyLinkedList.java by executing following command
	> javac ssm171330/BoundedQueue.java

2. To run the main(driver) program
	
	> java ssm171330/BoundedQueue
	This will create a Queue of default size 10, with nodes with values 1 to 10

	> java ssm171330/BoundedQueue X
	This will create a Queue of size of the nonnegative integer X provided as command line argument, 
	here queue of size say X = 10 will be created.

	by following the above commands, the console would display following:

	1 2 3 4 5 6 7 8 9 10


	Cases: 
	    1: to push an element in queue, if queue is not full else, it will return false
            2: to poll(remove) an element from queue, if queue is not empty else it will return null 
            3: to print the size of queue.
            4: Copy queue in an array and print the array
            5: prints queue


	Note: initially cursor is at rear and queue is already full, and performing instruction case 1 (trying to add element in full queue will return false)

	Sample Input:

	10 1 12 2 2 3 4 5 

	Sample Output:

	1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 

	1
	12
	false
	1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 

	2
	1
	2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 

	2
	2
	3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 

	3
	 size : 8
	4
	 Array : [3, 4, 5, 6, 7, 8, 9, 10]
	5
	3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 

	
