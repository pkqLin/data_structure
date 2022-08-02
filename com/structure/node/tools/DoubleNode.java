package structure.node.tools;

public class DoubleNode<T> {
        public T value;
        public DoubleNode next;
        public DoubleNode pre;

        public DoubleNode(T data) {
            value = data;
        }

        //打印链表
        public void print() {
            DoubleNode head = this;
            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            sb1.append("前  ");sb.append("原  ");sb2.append("后  ");
            while (head != null) {
                sb1.append(head.pre == null ? "N" : "<--" + head.pre.value);
                sb.append(head == this ? head.value : "-->" + head.value);
                sb2.append(head.next == null ? "N" :  head.next.value +"-->" );
                head = head.next;
            }
            System.out.println(sb1.toString());
            System.out.println(sb.toString());
            System.out.println(sb2.toString());
    }
}
