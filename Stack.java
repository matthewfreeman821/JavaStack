public class Stack<A> extends StackDao<A> {
  private Stack stack;
  private A a;

  public Stack(Stack<A> stack, A a) {
    this.stack = stack;
    this.a = a;
  }

  public boolean isEmpty() {
    return false;
  }

  public A peek() {
    return a;
  }

  public Stack<A> pop() {
    return stack;
  }

  public Stack<A> pop(A a) {
    return stack;
  }
}