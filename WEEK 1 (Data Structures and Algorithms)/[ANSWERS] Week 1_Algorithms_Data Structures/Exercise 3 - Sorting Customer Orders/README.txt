Exercise 3: Sorting Customer Orders


QUESTION:


Scenario: 
You are tasked with sorting customer orders by their total price on an e-commerce platform. This helps in prioritizing high-value orders.


o   Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort).


ANSWER:


Bubble Sort:

- It Repeatedly compares adjacent elements and swaps them if they are in the wrong order.
- It shows time complexity O(n^2) in average and worst cases, O(n) in best case (already sorted).
- It shows space complexity: O(1)
- It is mainly suitable for: Small datasets or nearly sorted data.

Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.


Insertion Sort:

- It builds the sorted part of the array one element at a time by inserting elements into their correct position.
- It shows time complexity: O(n^2) in average and worst cases, O(n) in best case (already sorted).
- It shows space complexity: O(1)
- It is mainly suitable for: Small datasets or nearly sorted data.

Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

Quick Sort:

- It picks an element as a pivot and partitions the array around the pivot. Recursively sorts the sub-arrays.
- It shows time complexity: Average case: O(n log n), Worst case: O(n^2)
- It shows space complexity: O(log n) average, O(n) worst case
- It is mainly suitable for: Large datasets.

Quick Sort is an efficient, in-place sorting algorithm that, on average, makes O(nlogn) comparisons to sort n items. In the worst-case, it makes  comparisons, though this behavior is rare.

Merge Sort:

- It divides the array into two halves, recursively sorts them, and merges the sorted halves.
- It shows time complexity: O(n log n) in all cases
- It shows space complexity: O(n)
- It is mainly suitable for: Large datasets, stable sorting (maintains relative order of equal elements).

Merge Sort is a divide-and-conquer algorithm that was invented by John von Neumann in 1945. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
