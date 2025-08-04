/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
        // Add your code here.
        TreeSet<Integer> set = new TreeSet<>();
        while(head1 != null){
            set.add(head1.data);
            head1 = head1.next;
        }
        while(head2 != null){
            set.add(head2.data);
            head2 = head2.next;
        }
        Node dummy = new Node(0);
        Node current = dummy;
        for(int value : set){
            current.next = new Node(value);
            current = current.next;
        }
        return dummy.next;
    }
}