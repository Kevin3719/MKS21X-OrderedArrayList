/* OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>

    This is a NoNullArrayList that maintains all elements in a sorted order upon insertion.

    Override both add methods -> find the correct index where the new element should be added,
                                 then add() the new element into that position

                                 (hint: 1.compareTo 2.helper method)


    Override set(index,value) -> remove() the element at index, then add() the new value.


    Only have 2 constructors:  default + startingCapacity.
  */

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int capacity){
    super(capacity);
  }
  public boolean add(T value) {
    return super.add(value);
  }
  public void add(int index, T value){
  }
  public T set(int a,T value){
    return super.set(a,value);
  }
}
