/**
 * Created by randallcrame on 2/22/17.
 */
public class MySet <T> extends MyArrayList<T> {
    MySet(){
        super();
    }

    MySet(int size){
        super(size);
    }

    @Override
    public void add(T value){
        if (!contains(value)){
            super.add(value);
        }
    }

    @Override
    public void add(T value, int index){
        if (!contains(value)){
            super.add(value,index);
        }
    }
}
