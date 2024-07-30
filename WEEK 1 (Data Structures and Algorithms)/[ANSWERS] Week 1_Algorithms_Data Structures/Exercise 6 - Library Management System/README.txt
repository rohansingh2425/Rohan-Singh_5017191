Exercise 6: Library Management System


QUESTION:


Scenario: 
You are developing a library management system where users can search for books by title or author.


o   Explain linear search and binary search algorithms.


ANSWER:



LINEAR SEARCH ALGORITHM:



- Start from the first element of the list.

- Compare the current element with the target value (e.g., book title or author).

- If the current element matches the target value, return the position of the element.

- If the current element does not match the target value, move to the next element in the list.

- Repeat steps 2-4 until the element is found or the list ends.

- If the list ends without finding the target value, return an indication that the target is not in the list.



BINARY SEARCH ALGORITHM:



- Ensure the list is sorted.

- Set two pointers: low at the start of the list and high at the end of the list.

- Find the middle element: mid = (low + high) / 2.

- Compare the middle element with the target value.

- If the middle element matches the target value, return the position of the element.

- If the middle element is greater than the target value, discard the right half by setting high to mid - 1.

- If the middle element is less than the target value, discard the left half by setting low to mid + 1.

- Repeat steps 3-7 until the element is found or low exceeds high.

- If the target value is not found, return an indication that the target is not in the list (e.g., -1 or null).
