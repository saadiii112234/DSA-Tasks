class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val + " pushed to stack");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.next;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node curr = top;
        System.out.print("Stack: ");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
    }
}