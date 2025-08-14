package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

   /* @Override
    public String toString() {
        return "Node{" +
            "item=" + item +
            ", next=" + next +
            '}';
    }*/

    //A->B->C
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //루프에서 문자를 더할때 씀
        Node x = this;//일단 자기 자신
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
