This is a readme file containing instructions for executing homework 1.

Authors:
1. Sharayu Mantri - ssm171330
2. Akshaya Ramaswamy (axr170131)

The uploaded folder with name as my netid: ssm171330 contains three java files.
1. DoubleHash.java

Steps for running the files from cmd

NOTE: while executing from command prompt, the pwd should be the directory containing

1. To run the main(driver) program
	
	> javac ssm171330/DoubleHash.java
	> java ssm171330.DoubleHash
	by following the above commands, the console would display following:

 /**
 * Creating random numbers array of size capacity
 * checking the time required and distinct elements count of DoubleHash Class with Java HashSet Class
 */
Starting to add in customHashSet 
Distinct Elements : 999381
CAPACITY 1048576


Custom Hash : 359
Distinct elements : 999381
System Hash : 263

 /**
 * Added some random elements of new DoubleHash Object and checked for contains and removed are working correctly
 */
DoubleHash{DEFAULT_CAPACITY=16, CAPACITY=16, size=10, set=[ 18987 , null, null,  -109823092 , null,  11111 , null,  7 ,  8 ,  9 ,  10 ,  11 ,  123323 ,  1798798 , null, null]}
remove : 11
DoubleHash{DEFAULT_CAPACITY=16, CAPACITY=16, size=9, set=[ 18987 , null, null,  -109823092 , null,  11111 , null,  7 ,  8 ,  9 ,  10 ,  null ,  123323 ,  1798798 , null, null]}
remove : null
DoubleHash{DEFAULT_CAPACITY=16, CAPACITY=16, size=9, set=[ 18987 , null, null,  -109823092 , null,  11111 , null,  7 ,  8 ,  9 ,  10 ,  null ,  123323 ,  1798798 , null, null]}
remove : -109823092
DoubleHash{DEFAULT_CAPACITY=16, CAPACITY=16, size=8, set=[ 18987 , null, null,  null , null,  11111 , null,  7 ,  8 ,  9 ,  10 ,  null ,  123323 ,  1798798 , null, null]}
remove : 123323
DoubleHash{DEFAULT_CAPACITY=16, CAPACITY=16, size=7, set=[ 18987 , null, null,  null , null,  11111 , null,  7 ,  8 ,  9 ,  10 ,  null ,  null ,  1798798 , null, null]}

/**
 * Comparing time required to add, remove and contains elements in Java HashSet and System HashSet
 */
Adding 10000000 elements in sets
System Hash : 3240
Custom Hash : 10014
Checking 5000000 from sets
System Hash : 75
Custom Hash : 4014
Removing 5000000 from sets
System Hash : 97
Custom Hash : 138

/**
 * Adding elements of String data type in hashset and checking for all the functionalities
 */

 Element : data10
 Element : data1
 Element : data4
 Element : data5
 Element : data2
 Element : data3
 Element : data8
 Element : data9
 Element : data6
 Element : data7
Contains data25  : false
Contains data5  : true


/** Adding 25 elements in data set of string type **/
Adding new elements to data set
 Element : data14
 Element : data15
 Element : data16
 Element : data17
 Element : data10
 Element : data11
 Element : data12
 Element : data13
 Element : data19
 Element : data18
 Element : data20
 Element : data0
 Element : data1
 Element : data4
 Element : data5
 Element : data2
 Element : data3
 Element : data8
 Element : data9
 Element : data21
 Element : data7
 Element : data23
 Element : data24
 Element : data6
 Element : data22
Count : 25




