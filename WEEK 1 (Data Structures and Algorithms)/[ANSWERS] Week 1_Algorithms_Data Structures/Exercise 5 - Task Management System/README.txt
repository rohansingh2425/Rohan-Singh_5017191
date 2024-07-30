Exercise 5: Task Management System


QUESTION:


Scenario: 
You are developing a task management system where tasks need to be added, deleted, and traversed efficiently.


o   Explain the different types of linked lists (Singly Linked List, Doubly Linked List).


ANSWER:


Linked lists are a fundamental data structure that can be effectively used in task management systems. They provide flexibility in adding, deleting, and traversing tasks.

Singly Linked List:

A Singly Linked List is a type of data structure that consists of a sequence of elements, each containing a reference (or link) to the next element in the sequence.

- The value stored in the node.
- A pointer/reference to the next node in the sequence.
- Traversal of a singly linked list is straightforward; you start at the head (the first node) and follow the next pointers to visit each node until you reach the end (where next is null).
- Adding a new node can be done at the beginning (constant time), middle, or end (requires traversal).
- Removing a node requires traversal to find the node to be deleted and its predecessor.
- Finding an element requires traversing the list from the head to the desired element. 
- Singly linked lists use less memory than doubly linked lists because each node only needs one reference pointer.

Doubly Linked List:

A Doubly Linked List is similar to a singly linked list but with an additional reference to the previous node.

- Each node in a doubly linked list contains three fields:
- The value stored in the node.
- A pointer/reference to the next node.
- A pointer/reference to the previous node.
- Traversal can be done in both directions. Forward traversal from the head to the end. Backward traversal from the end to the head.
- Insertion can be done at the beginning (constant time), middle, or end. The additional prev pointer allows more efficient insertion. Removing a node is more efficient compared to a singly linked list because you have direct access to the previous node. Similar to singly linked lists, searching requires traversal.
- Doubly linked lists use more memory than singly linked lists because each node has two reference pointers.

COMPARISON:

- Both types of linked lists have similar time complexity for operations like insertion, deletion, and search (O(n) for search and traversal). However, specific operations can be more efficient in a doubly linked list due to the prev pointer.
- Singly linked lists are more memory-efficient, but doubly linked lists provide more flexibility and efficiency for certain operations.



