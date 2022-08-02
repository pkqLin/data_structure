package structure.node;

import structure.node.tools.Node;

import java.util.Objects;

public class MergeNode {

    /**
     * @Title:
     * @Description: 合并两个有序链表
     * @ClassName: path: structure.node.MergeNode  -->  function: mergeTwoNode
     * @Param: [head1, head2]
     * @return: structure.node.tools.Node<java.lang.Integer>
     * @Author: pkqLin
     * @Date: 2022/8/2 15:52
     * @version V1.0
     */
    public Node<Integer> mergeTwoNode(Node<Integer> head1, Node<Integer> head2){
        if(head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }
        Node head = new Node(-1);
        Node pre = head;
        while (head1 != null && head2 != null) {
            if(head1.value <= head2.value) {
                pre.next = head1;
                head1 = head1.next;
            } else {
                pre.next = head2;
                head2 = head2.next;
            }
            //pre指向新添加的节点位置
            pre = pre.next;
        }
        //合并最后不为空的链表
        pre.next = head1 == null ? head2 : head1;
        return head.next;
    }

   /* private Node sortNode(Node<Integer> node) {
        List<Integer> list = node2List(node);
        Collections.sort(list);
        Node<Integer> head = new Node(-1);
        Node<Integer> r = head;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            head.next = new Node(iterator.next());
            head = head.next;
        }
        return r.next;
    }

    @Test
    public void testMergeTwoNode(){
        for (int i = 0; i < 50; i++) {
            Node head1 = genListNode(10, 9);
            Node head2 = genListNode(6, 9);
            if (Objects.nonNull(head1)) {
                head1 = sortNode(head1);
                head1.print();
            }
            if (Objects.nonNull(head2)) {
                head2 = sortNode(head2);
                head2.print();
            }
            if(head1 == null && head2 == null) {
                continue;
            }
            Node node1 = mergeTwoNode(head1, head2);
            System.out.println("合并结果：");
            node1.print();
            System.out.println();
        }
    }*/

}
