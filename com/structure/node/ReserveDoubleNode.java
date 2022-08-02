package structure.node;

import structure.node.tools.DoubleNode;

public class ReserveDoubleNode {

    //反转双链表
    //    建立两个指针pre next 以及已知的head节点
    //    next指针存储需要反转节点的下一个节点信息 pre指针存储需要反转的节点的上一个节点信息
    //    反转当前节点 将head.next --> pre ; head.last --> next
    //    将pre向后移动 head节点向后移动 继续反转后一个节点
    //    重复2 3 步骤 直到head == null 表示已经反转完毕

    public static DoubleNode reserve(DoubleNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        DoubleNode on = null;
        DoubleNode down = null;
        //只看next = head.next ; head = next 就是在将head向后移动
        //中间进行了head节点的反转操作
        //最后将pre的位置向后移动
        while (head != null) {
            down = head.next;
            head.next = on;
            head.pre = down;
            on = head;
            head = down;
        }
        return on;
    }


    //生成双向链表
    public static DoubleNode genDoubleListNode() {
        /*int size = (int) (Math.random() * (len + 1));
        if (size == 0) {
            return null;
        }*/
        int size =5;
        size--;
        DoubleNode head = new DoubleNode(5);
        DoubleNode pre = head;
        while (size != 0) {
            DoubleNode cur = new DoubleNode(size);
            pre.next = cur;
            cur.pre = pre;
            pre = cur;
            size--;
        }
        return head;
    }

    public static void main (String[] args){
        DoubleNode dn = genDoubleListNode();
        dn.print();
        reserve(dn).print();
    }
}
