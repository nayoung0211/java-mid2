package collection.link;


public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add (Object o){
        Node newNode = new Node(o);
        if(first==null){
            first = newNode;
        }else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while(x.next!=null){
            x = x.next;
        }
        return x;
    }
    //추가코드
    public void add (int index,Object o) {
        Node newNode = new Node(o);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        }else{
            Node prev = getNode(index-1);
            newNode.next = prev.next;//원래있던 값은 내꺼의 다음으로 넣기
            prev.next = newNode;
        }
        size++;
    }

    //추가코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        if(index == 0){
            first = removeNode.next;
        }else{
            Node prev = getNode(index-1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;//노드간의 연결 끊기 안에 있는 데이터는 prev.next 에 참조값 넣음
        size--;
        return removeNode;
    }

    public Object set(int index,Object o){
        Node x = getNode(index);
        Object old = x.item;
        x.item = o;
        return old;
    }

    public Object get(int index){
        Node x = getNode(index);
        return x.item;
    }

    private Node getNode(int index) {
     Node x = first;
     for(int i=0;i<index;i++){
         x = x.next;
     }
     return x;
    }

    public int indexOf(Object o){
        int index = 0;
        for(Node x=first;x!=null;x=x.next){
            if(x.item.equals(o)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
            "first=" + first +
            ", size=" + size +
            '}';
    }
}
