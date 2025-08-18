package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size =0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
      initBuckets(capacity);
    }
    public MyHashSetV3(int capacity){
        this.capacity = capacity;
        initBuckets(capacity);
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }
    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
    public boolean remove(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(searchValue);
        if(result){
            size--;
            return true;
        }else{
            return false;
        }
    }
    public int size() {
        return size;
    }

    //단축키 ctrl+alt+n
    private int hashIndex (E value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    //중복 제거 단축 키 ctrl+alt+m
    private void initBuckets(int capacity) {
        buckets = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }
}
