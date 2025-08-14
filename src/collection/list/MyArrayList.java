package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }
    @Override
    public void add(int index,E e) {
        //코드 추가
        if(size == elementData.length){
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //코드 추가, 요소의 마지막부터 index 까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i=size; i>index; i--){
            //[2]의 저장된 데이터를 [3]으로 옮김
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    //경고를 없애기
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index){
        return (E) elementData[index];
    }

    public E set(int index, E element){
        E old = get(index);
        elementData[index] = element;
        return old;
    }
    @Override
    public int indexOf(E element){
        for(int i = 0; i < size; i++) {
            if(element.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }
    //코드 추가
    @Override
    public E remove(int index){
        E old = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return old;
    }

    private void shiftLeftFrom(int index) {
        for(int i=index; i<size-1; i++){
            elementData[i] = elementData[i+1];
        }
    }

    @Override
    public String toString() {
        return "MyArrayListV1{" +
            "elementData=" + Arrays.toString(Arrays.copyOf(elementData,size)) +
            ", size=" + size +
            '}'+"capacity = " + elementData.length;
    }
}