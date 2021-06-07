public class Queue {
  private class QNode {
    int key;
    QNode next;

    public QNode(int key) {
      this.key = key;
      this.next = null;
    }
  }

  QNode front, rear;

  public Queue() {
    this.front = this.rear = null;
  }

  public void enqueue(int key) {
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
}