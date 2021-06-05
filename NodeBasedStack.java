public class NodeBasedStack<T> {
  private class Node {
    T data;
    Node next;

    public Node(T val, Node n) {
      data = val;
      next = n;
    }

    public void setData(T val) {
      data = val;
    }

    public T getData() {
      return data;
    }

    public void setNext(Node n) {
      next = n;
    }

    public Node getNext() {
      return next;
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

  public void push(T val) {
    Node node = new Node(val, top);
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
      Node tmp = top;
      top = top.getNext();
      tmp.setNext(null);
    }
    return data;
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
  }
}