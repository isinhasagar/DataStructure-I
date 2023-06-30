package LoveBabbarDSASheet.LinkedList;

import java.util.Scanner;

class LinkedListOperations {
    private int size;
    private Node start;

    LinkedListOperations(){
        size = 0;
        start = null;
    }

    // Check if list is empty or not.
    public boolean isEmpty(){
        return start == null;
    }

    // Get the size of the list.
    public int getListSize(){
        return size;
    }

    // View the Linked List
    public void viewList(){
        Node t;
        if(isEmpty())
            System.out.println("List is empty.");
        else{
            t = start;
            for(int i=1; i<size; i++){
                System.out.println(" " + t.getData());
                t = t.getNext();
            }
        }
    }

    // Insert element at first position.
    public void insertAtFirst(int number){
        Node t = new Node();
        t.setData(number);
        t.setNext(start);
        start = t;
        size++;
    }

    // Insert element at last position.
    public void insetAtLast(int number){
        Node n = new Node();
        n.setData(number);
        Node t = start;
        if(t == null) start = n;
        else{
            while(t.getNext() != null)
                t=t.getNext();
            t.setNext(n);
        }
        size++;
    }

    // Insert element at a given position
    public void insertAtPos(int data, int pos){
        if(pos == 1) insertAtFirst(data);
        else if(pos == size+1) insetAtLast(data);
        else if(pos > 1 && pos<=size){
            Node n,t;
            n=new Node(data, null);
            t=start;
            for(int i=1; i<pos-1; i++){
                t=t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else
            System.out.println("Insertion not possible at position: "+ pos);
    }

    // Delete element at first position
    public void deleteFirst(){
        if(start == null) System.out.println("List is Empty.");
        else{
            start = start.getNext();
            size--;
        }
    }

    // Delete element at last position
    public void deleteLast(){
        if(start == null) System.out.println("List is Empty.");
        else if(size == 1){
            start=null;
            size--;
        }
        else{
            Node t = start;
            for(int i=1; i<size-1; i++)
                t=t.getNext();
            t.setNext(null);
            size--;
        }
    }

    // Delete element at a given position
    public void deleteAtPos(int pos){
        if(start == null) System.out.println("List is Empty.");
        else if(pos <1 || pos > size) System.out.println("Invalid Position.");
        else if(pos == 1) deleteFirst();
        else if(pos == size) deleteLast();
        else{
            Node t, t1;
            t=start;
            for(int i=1; i<pos-1; i++){
                t=t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedListOperations list = new LinkedListOperations();
        boolean flag = true;
        while(flag){
            System.out.println("-----------------------------------");
            System.out.println("1. Add item at start. ");
            System.out.println("2. Add item at last. ");
            System.out.println("3. Add item at given position. ");
            System.out.println("4. Delete at first. ");
            System.out.println("5. Delete at last. ");
            System.out.println("6. Delete item at given position. ");
            System.out.println("7. View List ");
            System.out.println("8. Exit. ");
            System.out.println("-----------------------------------");
            System.out.println("Enter your choice. ");

            int position, value;
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Value.");
                    value = scan.nextInt();
                    list.insertAtFirst(value);
                }
                case 2 -> {
                    System.out.println("Enter Value.");
                    value = scan.nextInt();
                    list.insetAtLast(value);
                }
                case 3 -> {
                    System.out.println("Enter Position.");
                    position = scan.nextInt();
                    System.out.println("Enter Value.");
                    value = scan.nextInt();
                    list.insertAtPos(value, position);
                }
                case 4 -> list.deleteFirst();
                case 5 -> list.deleteLast();
                case 6 -> {
                    System.out.println("Enter Position.");
                    position = scan.nextInt();
                    list.deleteAtPos(position);
                }
                case 7 -> list.viewList();
                case 8 -> flag = false;
                default -> System.out.println("Invalid Choice.");
            }
        }

    }

}
