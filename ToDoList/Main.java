package ToDoList;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Task task1 = new Task("eat","6am");
        Task task2 = new Task("sleep","10pm");
        Task task3 = new Task("walk","5pm");
        Task task4 = new Task("sport","5am");

        System.out.println(task2.getTaskTitle());
        System.out.println(task2.getDiscription());
        System.out.println(task3.getTaskTitle());
        System.out.println(task3.getDiscription());

        list.addToDo(task1);
        list.addToDo(task2);
        list.addToDo(task3);
        list.addToDo(task4);

        task1.markCompleted();
        task3.markCompleted();

        list.markToDoCompleted("sport");

        System.out.println(task2.isCompleted());

        list.viewToDoList();

    }
}
