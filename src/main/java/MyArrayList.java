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
            array[index] = value;
    }

    public void clear(){

    }

    public T get(int index){
        return array[index];
    }

    public int indexOf(T value){
        return 0;
    }

    public T remove(int index){

        return null;
    }

    public T set(int index, T value){
        return null;
    }


}
