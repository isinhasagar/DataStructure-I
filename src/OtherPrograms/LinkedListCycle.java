package OtherPrograms;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast.next == null || fast == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(LinkedListCycle.hasCycle(null));
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}
