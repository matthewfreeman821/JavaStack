import java.util.EmptyStackException;

public class NodeBasedStack<T> {
  private class Node {
    T data;
    Node next;

    public void Node(T val, Node n) {
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

  public void nodeBasedStack() {
    top = null;
    size = 0;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public void push(T val) {
    Node node = new Node(val, top);
    top = node;
    size++;
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
      size--;
    }
    return data;
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

  public static void main(String[] args) {
    NodeBasedStack<Integer> stack = new NodeBasedStack<>();
    stack.push(5);
    System.out.println(stack.peek());
    stack.push(8);
    System.out.println(stack.peek());
    stack.push(67);
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
  }
}