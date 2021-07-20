public class Queue {

  // Need to have an add method to add to the Queue
  private class QNode<T> {
    T key;
    QNode next;

    public QNode(T key) {
      this.key = key;
      this.next = null;
    }
  }

  QNode front, rear;

  public Queue() {
    this.front = this.rear = null;
  }

  public void enqueue(T key) {
    QNode temp = new QNode(key);

    if (this.rear == null) {
      this.front = this.rear = temp;
    }

    this.rear.next = null;
    this.rear = temp;
  }

  public void dequeue() {
    if (this.front == null) {
      throw new RuntimeException("Queue is empty");
    }
    Qnode temp = this.front;
    this.front = this.front.next;

    if (this.front == null) {
      this.rear = null;
    }
  }

  public static void main(String[] args) {
    int firstVal = 0;
    int secondVal = 1;
    QNode(firstVal);
    System.out.println(QNode(firstVal));
  }
}