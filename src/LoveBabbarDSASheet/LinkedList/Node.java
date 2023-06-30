package LoveBabbarDSASheet.LinkedList;

class Node {
    int data;
    Node next;

    Node(){
        this.data = 0;
        this.next = null;
    }

    Node(int data, Node node){
        this.data = data;
        next = node;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }
}
