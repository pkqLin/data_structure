package structure.node;

import structure.node.tools.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReserveNode {

    //获取一个1-5数字型的链表
    public static Node getNodeList() {
      /*  if (size == 0) {
            return null;
        }*/
        int size = 5;
        size--;
        Node head = new Node(5);
        Node pre = head;
        while (size != 0) {
            Node cur = new Node(size);
            pre.next = cur;
            pre = cur;
            size--;
        }
        return head;
    }

    public static void main(String[] args){
       /* Node node =getNodeList();
        node.print();
        reserve(node).print();*/
        String[] a=new String[]{"IT资产类","非IT资产类","费用类","宣传用品类"};
        String[] b=new String[]{"IT资产类","非IT资产类","费用类","宣传用品类"};
        List<String> purchaseTypeList = new ArrayList<>();
//        purchaseTypeList.add("IT资产类");
        purchaseTypeList.add("宣传用品类");
//        purchaseTypeList.add("非IT资产类");
//        purchaseTypeList.add("宣传用品类");
//        purchaseTypeList.add("非佣金支出类");
        purchaseTypeList.add("健康险业务宣传类");
        //目前结算的采购类型就这三种
        List<String> allType= new ArrayList<>();
        for (int m = 0; m < purchaseTypeList.size() ; m++) {
            if (Arrays.asList(a).contains(purchaseTypeList.get(m))) {
                allType.add("佣金支出类");
            } else if ("非佣金支出类".equals(purchaseTypeList.get(m))) {
                allType.add("非佣金支出类");
            } else if ("健康险业务宣传类".equals(purchaseTypeList.get(m))) {
                allType.add("健康险业务宣传类");
            }
        }
        allType=allType.stream().distinct().collect(Collectors.toList());
        for(String m:allType){
            System.out.println(m);
        }
    }

    //    1、双指针法
    //    建立两个指针pre next 以及已知的head节点
    //    next指针存储需要反转节点的下一个节点信息 pre指针存储需要反转的节点的上一个节点信息
    //    反转当前节点 将head.next --> pre
    //    将pre向后移动 head节点向后移动 继续反转后一个节点
    //    重复3 4 步骤 直到head == null 表示已经反转完毕
    public static Node reserve1(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node pre = null;
        Node next = null;
        //只看next = head.next ; head = next 就是在将head向后移动
        //中间进行了head节点的反转操作
        //最后将pre的位置向后移动
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    //  2、递归法
    //    每个节点都需要设置 node.next.next = node, node.next = null
    //    递归到最后的5节点时，开始反转链表 4.next.next = 4; 4.next = null
    //    递归方法返回5节点 此时链表为 1 --> 2 --> 3 --> 4 <-- 5
    //    递归层层返回 则完成了链表反转
    public static Node reserve(Node<Integer> head){
        if (head == null || head.next == null) {
            return head;
        }
        Node cur = reserve(head.next);
        head.next.next=head;
        head.next=null;
        return cur;
    }

}
