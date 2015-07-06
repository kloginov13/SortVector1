import java.lang.reflect.Array;
import java.util.Iterator;

public class SortedVector<T extends Comparable<? super T>> implements ISortedVector<T>, Iterable<T> {

    private T[] _array;
    private int _length;
    private int _capacity;///

    public SortedVector(){
            _length = 1;
            _capacity = -1;///
            _array = getNewArray(_length);
        }

    private T[] getNewArray(int length) {
        return (T[]) Array.newInstance(Comparable.class, length);
    }

    public void show(){
        for(int i =0 ; i < _length; i++)
        {
            System.out.print(_array[i].getClass().getName());
            System.out.println(_array[i]);
        }
    }

    public void add(T o) {
        if(_capacity+1 == _length){///
            _length += 2;
            T[] tmpArray = _array.clone();
            _array = getNewArray(_length);
            System.arraycopy(tmpArray, 0, _array, 0, tmpArray.length);
        }
        for(int i = 0; i <= _capacity; i++){///
            if(o.compareTo(_array[i]) < 0){
                T[] tmpArray = _array.clone();
                _array[i] = o;
                System.arraycopy(tmpArray, i, _array, i + 1, _length - i-1 );
                _length = _array.length;
                _capacity++;///
                return;
            }
        }
        _capacity++;///
        _array[_capacity] = o;///
    }

    public void remove(int index) {
        if(index < 0 || index > _capacity)///
            return;
        T[] tmpArray = _array.clone();
        System.arraycopy(tmpArray, 0, _array, 0, index);
        System.arraycopy(tmpArray, index+1, _array, index, _length-index-1);
        _array[_capacity] = null;///
        _capacity--;///
    }

    public T get(int index) {
        if(index < 0 || index > _capacity)///
            return null;
        return _array[index];
    }

    public int indexOf(T o) {
        for(int i = 0; i < _length; i++){
            if(o.equals(_array[i])){
                return i;
            }
        }
        return -1;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int index = 0;
            public boolean hasNext() {
                return index < _length;
            }

            public T next() {
                return _array[index++];
            }

            public void remove() {
                SortedVector.this.remove(index);
            }
        };
    }
}

