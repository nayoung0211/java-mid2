package collection.link;


public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add (E o){
        Node<E> newNode = new Node<E>(o);
        if(first==null){
            first = newNode;
        }else{
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next!=null){
            x = x.next;
        }
        return x;
    }
    //추가코드
    public void add (int index,E o) {
        Node<E> newNode = new Node(o);
        if(index == 0){
            newNode.next = first;
            first = newNode;
        }else{
            Node<E> prev = getNode(index-1);
            newNode.next = prev.next;//원래있던 값은 내꺼의 다음으로 넣기
            prev.next = newNode;
        }
        size++;
    }

    //추가코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index == 0){
            first = removeNode.next;
        }else{
            Node prev = getNode(index-1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;//노드간의 연결 끊기 안에 있는 데이터는 prev.next 에 참조값 넣음
        size--;
        return removedItem;
    }

    public E set(int index,E o){
        Node<E> x = getNode(index);
        E old = x.item;
        x.item = o;
        return old;
    }

    public E get(int index){
        Node<E> x = getNode(index);
        return x.item;
    }

    private Node<E> getNode(int index) {
     Node<E> x = first;
     for(int i=0;i<index;i++){
         x = x.next;
     }
     return x;
    }

    public int indexOf(E o){
        int index = 0;
        for(Node<E> x=first;x!=null;x=x.next){
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

    private static class Node<E>{

        E item;
        Node next;

        public Node(E item) {
            this.item = item;
        }

        //A->B->C
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            //루프에서 문자를 더할때 씀
            Node<E> x = this;//일단 자기 자신
            sb.append("[");
            while (x != null) {
                sb.append(x.item);//문자열 추가
                if(x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
