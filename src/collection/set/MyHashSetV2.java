package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size =0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
      initBuckets(capacity);
    }
    public MyHashSetV2(int capacity){
        this.capacity = capacity;
        initBuckets(capacity);
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }
    public boolean contains(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
    public boolean remove(Object searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Object> bucket = buckets[hashIndex];
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
    private int hashIndex (Object value) {
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
        return "MyHashSetV2{" +
            "buckets=" + Arrays.toString(buckets) +
            ", size=" + size +
            ", capacity=" + capacity +
            '}';
    }
}
