/**
 * Created by randallcrame on 2/22/17.
 */
public class MyArrayList<T> {

    private T[] array;

    MyArrayList(){
    array = (T[]) new Object[10];
    }

    MyArrayList(int size){
    array = (T[]) new Object[size];
    }

    public int size(){
        return array.length;
    }

    private boolean isArrayFull(){
        return (this.array[array.length-1]!= null);
    }
    private T[] doubleSize(){
        T[] newArray = (T[])  new Object[array.length*2];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void add(T value){
        if (isArrayFull())
            array = doubleSize();
        for (int i = 0; i < array.length; i++){
            if (array[i] == null){
                array[i] = value;
                break;
            }
        }
    }

    public void add(T value, int index ) throws IndexOutOfBoundsException{
        T[] subArray = (T[]) new Object[array.length-index];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[index+i];
        }
        array[index] = value;
        for (int i = 0; i < subArray.length-1; i++){
            array[index+1+0] = subArray[i];
        }
        add(subArray[subArray.length-1]);

    }

    public void clear(){
        array = (T[]) new Object[array.length];
    }

    public T get(int index){
        return array[index];
    }

    public int indexOf(T value){
        int index = -1, counter = 0;
        for (T t: this.array) {
            if (t.equals(value)) {
                index = counter;
                break;
            }
            counter++;
        }
        return index;
    }

    public void remove(int index){

        array[index] = null;
    }

    public void set(int index, T value) throws IndexOutOfBoundsException{
        array[index] = value;
    }

    public boolean contains(T value){
        for (T item: array) {
            if (item.equals(value))
                return true;
        }
        return false;
    }

    public boolean isEmpty(){
        for(T item: array){
            if (item != null)
                return false;
        }
        return true;
    }

}
