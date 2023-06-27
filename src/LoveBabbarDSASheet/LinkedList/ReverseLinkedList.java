package LoveBabbarDSASheet.LinkedList;

public class ReverseLinkedList {
    static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
