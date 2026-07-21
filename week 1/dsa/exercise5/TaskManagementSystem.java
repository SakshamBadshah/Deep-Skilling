class Task {
    int taskId;
    String taskName;
    String status;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    void displayTask() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + taskName);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }
}

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagementSystem {

    Node head = null;

    // Add task at the end
    public void addTask(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            System.out.println("Task added successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        System.out.println("Task added successfully.");
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        Node current = head;

        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }

        return null;
    }

    // Traverse all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }

        Node current = head;

        while (current != null) {
            current.task.displayTask();
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        // If first node needs to be deleted
        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.task.taskId == taskId) {
                current.next = current.next.next;
                System.out.println("Task deleted successfully.");
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found.");
    }

    public static void main(String[] args) {

        TaskManagementSystem taskList = new TaskManagementSystem();

        taskList.addTask(new Task(101, "Complete Java Assignment", "Pending"));
        taskList.addTask(new Task(102, "Prepare Resume", "Completed"));
        taskList.addTask(new Task(103, "Practice DSA", "In Progress"));
        taskList.addTask(new Task(104, "Submit Project", "Pending"));

        System.out.println("\nAll Tasks:");
        taskList.displayAllTasks();

        System.out.println("\nSearching Task ID 103:");
        Task found = taskList.searchTask(103);

        if (found != null) {
            found.displayTask();
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task ID 102:");
        taskList.deleteTask(102);

        System.out.println("\nTasks After Deletion:");
        taskList.displayAllTasks();
    }
}