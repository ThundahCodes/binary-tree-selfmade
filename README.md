# binary-tree-selfmade

The java project creates a binary tree data structure where the tree is made up of nodes. The project contains two classes, Node.java and App.java.

Node.java: This class implements the Comparable interface, which makes it possible to compare two instances of Node with each other. The class represents a single node in the binary tree and has the following instance variables:

left: a reference to the left child node
right: a reference to the right child node
value: a string representing the value of the node
The class also has several methods for accessing and modifying the instance variables, as well as a compareTo method for comparing two instances of Node.

App.java: This class contains three static methods:

inorder: This method traverses the binary tree in in-order and prints out each visited node's value.
insert: This method inserts a new node into the binary tree by comparing its value to the parent node's value and inserting it as either the left or right child node.
main: This method creates several nodes with different values and inserts them into the binary tree by calling the insert method. It then calls the inorder method to traverse the binary tree and print out each node's value.
