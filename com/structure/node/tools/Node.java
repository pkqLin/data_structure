package structure.node.tools;

public class Node<T> {
    public T value;
    public Node next;

    public Node(T data) {
        value = data;
    }

    //打印链表
    public void print() {
        Node head = this;
        StringBuffer sb = new StringBuffer();
        while (head != null) {
            sb.append(head == this ? head.value : "-->" + head.value);
            head = head.next;
        }
        System.out.println(sb.toString());
    }
}
