package ToDoList;

public class ToDoList {
    private Node head;

    public ToDoList() {
        this.head = null;
    }

    public void addToDo(Task task){
        Node node = new Node(task);
        if (head == null){
            head = node;
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }
    public void markToDoCompleted(String title){
        if (head == null){
            System.out.println("There are no tasks");
            return;
        }
        Node temp = head;

        while(temp != null){
            if(temp.task.taskTitle.equalsIgnoreCase(title)){
                temp.task.markCompleted();
                System.out.println(temp.task.taskTitle +" is marked completed");
                break;
            }
            temp = temp.next;
        }

    }
    public void viewToDoList(){

        if (head == null){
            System.out.println("There are no tasks");
            return;
        }
        Node temp = head;

        while (temp != null ) {
                if (temp.task.completed){
                System.out.println(temp.task.taskTitle + ": " + temp.task.discription + " -> completed");
                } else {
                    System.out.println(temp.task.taskTitle + ": " + temp.task.discription + " -> not completed");
                }
            temp = temp.next;
        }

    }
}
