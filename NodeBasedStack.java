import java.util.EmptyStackException;

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

    public Node getNext() {
      return next;
    }

    public void setNext(Node n) {
      next = n;
    }
  }

  Node top;
  int size;

  public nodeBasedStack(){
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

  public T pop() {
    T data = null;
    if (isEmpty()) {
      throw new EmptyStackException();
    } else {
      data = top.getData();
      tmp.setNext(null);
      size--;
    }
    return data;
  }

  public T peek() {
    T data = null;
    if (isEmpty()) {
      throw new EmptyStackException();
    } else {
      data = top.getData();
    }
    return data;
  }
}