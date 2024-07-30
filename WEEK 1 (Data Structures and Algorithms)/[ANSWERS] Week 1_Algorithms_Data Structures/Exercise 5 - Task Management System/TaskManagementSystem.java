import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;  

    }
}

class Node {
    Task data;
    Node next;

    public Node(Task data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void searchTask(int taskId) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data.taskId == taskId) {
                System.out.println("Task found: " + temp.data.taskName);
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Task not found.");
        }
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Task ID: " + temp.data.taskId + ", Task Name: " + temp.data.taskName + ", Status: " + temp.data.status);
            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {
        Node temp = head, prev = null;
        if (temp != null && temp.data.taskId == taskId) {
            head = temp.next; 
            return;
        }
        while (temp != null && temp.data.taskId != taskId) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Task not found.");
            return;
        }
        prev.next = temp.next;
    }
}

public class TaskManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList taskList = new LinkedList();

        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();  

            scanner.close();


            switch (choice) {
                case 1:
                    System.out.print("Enter task ID: ");   
 
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter task status: ");
                    String status = scanner.nextLine();
                    Task task = new Task(taskId, taskName, status);
                    taskList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task ID to search: ");
                    int searchId = scanner.nextInt();
                    taskList.searchTask(searchId);
                    break;
                case 3:
                    taskList.traverse();
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    taskList.deleteTask(deleteId);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

/*
Linked List Operations Time Complexities:

Add: O(1) - Constant time, as you only need to update pointers.   
Search: O(n) - Linear time, as you need to traverse the list in the worst case.   
Traverse: O(n) - Linear time, as you visit each node once.
Delete: O(1) if you have a reference to the node, otherwise O(n) to find the node.

Advantages of Linked Lists over Arrays for Dynamic Data:

- Linked lists can grow or shrink as needed without the overhead of resizing the entire data structure like arrays.This is particularly efficient when the data size is unpredictable.
- Inserting or deleting elements in a linked list is generally faster than in an array, especially when the position is not at the end.This is because you only need to update pointers, avoiding the costly shifting of elements in an array.
- Linked lists tend to use memory more efficiently than arrays, as they don't need to allocate a contiguous block of memory upfront.This is especially beneficial when dealing with large datasets.
 */
