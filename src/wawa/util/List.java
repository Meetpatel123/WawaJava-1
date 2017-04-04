package wawa.util;

public class List<E> extends Pair<E, List<E>> {

  public List(E first, List<E> second) {
    super(first, second);
  }

}
