package Thursday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LList {
    private Node head;
    private Node tail;
    private int size;
    public LList(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index -1; i++){
            temp = temp.next;
        }
        temp.next = new Node(val,temp.next);
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node1 = new Node(val);
        tail.next = node1;
        tail = node1;
        size++;
    }
    public void  deleteFirst(){
        Node temp = head;
        int val = temp.value;
        head = head.next;
        if(head == tail){
            head = null;
            tail = null;
        }
        System.out.println("deleted element is " + val);
    }
    public void deleteLast(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = tail.value;
        tail = temp;
        temp.next = null;
        size--;
        System.out.println("deleted element is : " + val);
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public static class Node{
        public int value;
        public Node next;
        Node(int a){
            this.value = a;
        }
        Node(int a, Node next){
            this.value = a;
            this.next = next;
        }
    }
    public void delete(int pos){
        Node temp = head;
        for(int i = 0; i< pos -1; i++){
            temp = temp.next;
        }
        int val = temp.value;
        temp.next = temp.next.next;
        System.out.println("deleted element is : " + val);
    }
    public static void main(String[] args) {
        LList ll = new LList();
        ll.insertFirst(10);
        ll.insertFirst(10);
        ll.insertLast(3);
        ll.insertFirst(10);
        ll.insertLast(9);
        ll.insert(1,4);
        ll.deleteFirst();
        ll.deleteLast();
        ll.delete(2);
        ll.display();
        List<Integer> LListt= new ArrayList<>();
        LListt.add(89);
        System.out.println(LListt);
    }
}