import java.util.EmptyStackException;

public class EmptyStack<A> implements StackDao<A> {
  public boolean isEmpty() {
    return true;
  }

  public A peek() {
    throw new EmptyStackException();
  }

  public StackDao<A> push(A a) {
    return new Stack<A>(this, a);
  }

  public StackDao<A> pop() {
    throw new EmptyStackException();
  }
}