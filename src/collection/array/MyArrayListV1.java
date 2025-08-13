package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }
    public void add(Object e){
        elementData[size] = e;
        size++;
    }
    public Object get(int index){
        return elementData[index];
    }
    public Object set(int index, Object element){
        Object old = get(index);
        elementData[index] = element;
        return old;
    }
    public int indexOf(Object element){
        for(int i = 0; i < size; i++) {
            if(element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayListV1{" +
            "elementData=" + Arrays.toString(elementData) +
            ", size=" + size +
            '}'+"capacity = " + elementData.length;
    }
}
