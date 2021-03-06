public class NodeBasedStack<T> {
  private class Node {
    T data;
    Node next;

    public Node(T val, Node n) {
      data = val;
      next = n;
    }

    public T getData() {
      return data;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node n) {
      next = n;
    }
  }

  Node top;
  int size;

  public NodeBasedStack() {
    top = null;
    size = 0;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public int size() {
    return size;
  }

  public void push(T data) {
    Node node = new Node(data, top);
    top = node;
    size++;
  }

  public T peek() {
    T data = null;
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    } else {
      data = top.getData();
    }
    return data;
  }

  public T pop() {
    T data = null;
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    } else {
      data = top.getData();
      top = top.getNext();
      size--;

    }
    return data;
  }

  public booelan contains(T val) {
    Node tmp = top.getData();
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty");
    }
    while (tmp != null) {
      if (tmp.getData() == val) {
        return true;
      }
      tmp = tmp.getNext();
    }
    return false;
  }

  public static void main(String[] args) {
    NodeBasedStack<Integer> stack = new NodeBasedStack<>();

    stack.push(1);
    System.out.println(stack.peek());
    System.out.println(stack.size);
    stack.push(2);
    System.out.println(stack.peek());
    System.out.println(stack.size);
    stack.push(3);
    System.out.println(stack.peek());
    System.out.println(stack.size);
    stack.pop();
    System.out.println(stack.peek());
    System.out.println(stack.size);
    stack.push(4);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    System.out.println(stack.size);
    stack.pop();
    stack.pop();
    stack.pop();
  }
}