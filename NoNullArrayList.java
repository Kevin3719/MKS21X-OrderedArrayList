/* NoNullArrayList<T> extends ArrayList<T>
    is an ArrayList of T that cannot take a null as a value.

    Override set and both add methods -> throw an IllegalArgumentException when null is added,
                                       otherwise call the old add method.


    Only have 2 constructors:  default + startingCapacity.
  */



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
    public void add(int index, T value) {
      if (value == null) {
        throw new IllegalArgumentException("cannot set a value to null");
      }
      super.add(index,value);
    }
}
