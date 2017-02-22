/**
 * Created by randallcrame on 2/22/17.
 */
public class MyArrayList<T> {
//    +add(E): boolean
//+add(int, E): void
//+clear(): void
//+get(int)abstract E
//+ indexOf(Object): int
//    remove(int): E
//    set(int, E): E

    Object[] array;

    MyArrayList(){
    array = new Object[10];
    }

    MyArrayList(int size){
    array = new Object[size];
    }

    public int size(){
        return 0;
    }


    public boolean add(){
        return false;
    }

    public void add(T element, int index ){

    }

    public void clear(){

    }

    public <T> T get(int index){
        return null;
    }

    public int indexOf(T){
        return 0;
    }

    public <T> T remove(int){

        return null;
    }

    public <T> T set(int index, T value){
        return null;
    }


}
