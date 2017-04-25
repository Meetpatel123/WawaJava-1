package wawa.util;

public interface ISeq<T> {

  T head();

  ISeq<T> tail();

  boolean isEmpty();

  default String repr() {
    ISeq<T> s = this;
    if (s.isEmpty()) {
      return "[]";
    }
    StringBuilder b = new StringBuilder("[");
    do {
      b.append(s.head());
      s = s.tail();
      if (!s.isEmpty()) b.append(",");
      else break;
    } while (true);
    return b.append("]").toString();
  }
}
