package wawa.util;

public final class Seq<T> implements ISeq<T> {

  public static <T> ISeq<T> nil() {
    return new Nil<>();
  }

  public static <T> ISeq<T> of(T x, T... xs) {
    ISeq<T> s = nil();
    for (int i = xs.length - 1; i >= 0; i--) {
      s = new Seq<>(xs[i], s);
    }
    return new Seq(x, s);
  }

  private final T head;

  private final ISeq<T> tail;

  private Seq(T head, ISeq<T> tail) {
    this.head = head;
    this.tail = tail;
  }

  @Override
  public T head() {
    return head;
  }

  @Override
  public ISeq<T> tail() {
    return tail;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public String toString() {
    return repr();
  }

  private static final class Nil<T> implements ISeq<T> {

    @Override
    public T head() {
      throw new UnsupportedOperationException();
    }

    @Override
    public ISeq<T> tail() {
      throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
      return true;
    }

    @Override
    public String toString() {
      return repr();
    }
  }

}
