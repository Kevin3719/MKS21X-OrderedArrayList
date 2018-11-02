import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    private T value;
    public NoNullArrayList(){
      super();
    }
    public NoNullArrayList(int capacity){
      super(capacity);
    }
    public boolean add(T value) {
      if (value == null) {
        throw new IllegalArgumentException("cannot set a value to null");
      }
      return super.add(value);
      }
    public T set(int a,T value) {
      if (value == null) {
        throw new IllegalArgumentException("cannot set a value to null");
      }
      return super.set(a,value);
    }


}
