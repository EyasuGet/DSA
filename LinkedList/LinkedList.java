package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    // #1: INSERTING AT ANY GIVEN POSITION
    public  void insertATPos(int val,int index){
        if (index ==1){
            insertAtFirst(val);
            return;
        }
        if (index==size+1){
            insertAtEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index-1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    // #2 DELETING AT ANY POSITION
    public int deleteATPosition(int index){
        if(index == 1){
            return deleteFirst();
        }
        if (index == size){
            return deleteLAst();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    // #3: DELETING AFTER A GIVEN NODE
    public int deleteAfterNode(int index){
        if(size <= 1){
            System.out.println("There is only one element");
            return -1;
        }
        if (index >= size){
            System.out.println("The next element doesn't exist");
            return -1;
        }
        Node nextNode = get(index);
        if(nextNode.next == null){
            System.out.println("Next element doesnt exist");
        }
        int val = nextNode.next.value;
        nextNode.next = nextNode.next.next;
        size--;
        return val;

    }
    // #4: SEARCHING A NODE
    public int searchNode(int value){
        Node node = head;
        int i=1;
        while(node.next != null){
            if(node.value == value){
                return i;
            }
            node = node.next;
            i++;
        }
        if(node.value == value){
            return i;
        }
        return  -1;

    }
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail== null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void insertAtEnd(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index)
    {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteLAst()
    {
        if(size<=1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size -1 );
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return  val;
    }
}
