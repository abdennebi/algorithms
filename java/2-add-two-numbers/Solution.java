/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode la1 = new ListNode(8);
        ListNode la2 = new ListNode(9);
        ListNode la3 = new ListNode(9);
        la1.next = la2;
        la2.next = la3;

        ListNode lb1 = new ListNode(2);
        ListNode lb2 = new ListNode(6);
        ListNode lb3 = new ListNode(4);
        // lb1.next = lb2;
        // lb2.next = lb3;

        print(addTwoNumbers(la1, lb1));

    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = l2;

        while (true){
            System.out.println("l1 = " + l1.val);
            System.out.println("l2 = " + l2.val);
            int sum = l1.val + l2.val;
            boolean remainder = false;

            if (sum >= 10){
                l2.val = sum - 10;
                remainder = true;
            }
            else {
                l2.val = sum;
            }

            if (remainder){
                if (l1.next != null){
                    l1.next.val++;
                }
                else {
                    l1.next = new ListNode(1);
                }
            }
            // if l1 ends first we stop.
            if (l1.next == null) {
                break;
            }
            // if l2 ends first, the lastet element points on the nex element of l1
            if ((l2.next == null)) {
                l2.next = l1.next;
                while (l1.next.val >= 10) {
                    l1.next.val = l1.next.val - 10;
                    if (l1.next.next != null){
                        l1.next.next.val++;
                    }
                    else {
                        l1.next.next = new ListNode(1);
                    }

                    l1 = l1.next;
                }
                break;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }

    public static void print(ListNode l){
        System.out.print("[");
        while (l != null){
            System.out.print(l.val);
            if (l.next != null){
                System.out.print(",");
            }
            l = l.next;
        }
        System.out.print("]");
    }
}
