public class QueueLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front = null;
    private Node rear = null;

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (rear == null) {
            front = rear = newNode;
            System.out.println(val + " enqueued");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(val + " enqueued");
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(front.data + " dequeued");
        front = front.next;
        if (front == null) rear = null;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node curr = front;
        System.out.print("Queue: ");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}