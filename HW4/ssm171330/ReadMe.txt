This is a readme file containing instructions for executing homework 1.

Authors:
1. Sharayu Mantri - ssm171330
2. Sheetal Kadam (sak170006)

The uploaded folder with name as my netid: ssm171330 contains three java files.
1. BinarySearchTree.java

Steps for running the files from cmd

NOTE: while executing from command prompt, the pwd should be the directory containing

1. To run the main(driver) program
	
	> java ssm171330.BinarySearchTree
	This will create a Queue of default size 10, with nodes with values 1 to 10

	> java ssm171330.BinarySearchTree

	by following the above commands, the console would display following:

	
	Cases: 
    	1: Add element in binary search tree
    	2: Remove  the element from binary search tree
    	3: get element from tree
    	4: contains check
    	5: min of tree
    	6: max of tree
    	7: print tree
    	8: print size of tree


	Note: initially cursor is at rear and queue is already full, and performing instruction case 1 (trying to add element in full queue will return false)

	Sample Input:
1
1
[1] 1
1
1
[1] 1
1
2
[2] 1 2
1
3
[3] 1 2 3
1
4
[4] 1 2 3 4
1
5
[5] 1 2 3 4 5
2
2
[4] 1 3 4 5
2
4
[3] 1 3 5
2
5
[2] 1 3
2
4
[2] 1 3
4
3
true
4
2
false
3
1
1
3
2
null
5
min of tree is :1
6
max of tree is: 37
[2] 1 3
8
2
9
