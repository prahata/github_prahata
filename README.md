# java-algo


A. DepthOfBinaryRandomTree.java

* Description

This snippet code is intended to get Binary random three depth of an array of random numbers 

* Steps 

0. Change an array of integer in line 147, with another random number you will examine 

in this example I use

int datarandom []={47,24,36,19,21,29,46,92,100,83,71,17,14,10,49};

1. compile DepthOfBinaryRandomTree.java 
2. execute #java DepthOfBinaryRandomTree.class



* Result

depth 1 nodes :24,92 

depth 2 nodes :19,36,83,100

depth 3 nodes :17,21,29,46,71

depth 4 nodes :14,49

depth 5 nodes :10








B. SumDiceRoll.java 
* Description

This snippet code is intended to count the way of one dice 6 faces to get certain value  when it throwed

* Steps 

1. compile SumDiceRoll.java 
2. execute #java SumDiceRoll.class

3. please enter integer value , when prompt is show up

Enter target nspace value to achieve by a single dice: 

Enter target nspace value to achieve by a single dice: 5


* Result



You want to check target value : 5

5, 

throw dice 1 times , have 1 ways to get 5

4, 1,

3, 2,

2, 3,

1, 4,


throw dice 2 times , have 4 ways to get 5

3, 1, 1,

2, 2, 1,

1, 3, 1,

2, 1, 2,

1, 2, 2,

1, 1, 3, 

throw dice 3 times , have 6 ways to get 5

2, 1, 1, 1,

1, 2, 1, 1,

1, 1, 2, 1,

1, 1, 1, 2,


throw dice 4 times , have 4 ways to get 5

1, 1, 1, 1, 1, 

throw dice 5 times , have 1 ways to get 5


total number of ways of throwing  , for a 6 faces dice to get nspaces 5 is 16
