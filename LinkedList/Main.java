package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertATPos(1,1);
        list.insertATPos(2,2);
        list.insertATPos(3,3);
        list.display();
        list.deleteATPosition(3);
        list.display();
        list.deleteAfterNode(1);
        list.display();
        System.out.println("Value Found At index: " + list.searchNode(1));


    }
}
