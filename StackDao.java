public interface StackDao<A> {
  public boolean isEmpty();

  public A peek();

  public StackDao<A> push(A a);

  public StackDao<A> pop();
}