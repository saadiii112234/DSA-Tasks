public class CircularQueue {
    private int[] arr;
    private int front, rear, size;

    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int val) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            System.out.println("Queue Full");
            return;
        } else if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = val;
        System.out.println(val + " enqueued");
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println(arr[front] + " dequeued");
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Circular Queue: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) System.out.print(arr[i] + " ");
        } else {
            for (int i = front; i < size; i++) System.out.print(arr[i] + " ");
            for (int i = 0; i <= rear; i++) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();
        cq.dequeue();
        cq.display();
    }
}