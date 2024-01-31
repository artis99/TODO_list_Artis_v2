import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {


        DBlogic db = new DBlogic();

        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to do with your tasks (C - create, R - read, U - update, D - delete: ");
        String user_choice = scan.nextLine();

        switch (user_choice) {
            case "C":
                System.out.println("Add new task: ");
                String another_task = scan.nextLine();

                db.create(another_task);
                break;
            case "R":
                db.read();
                break;
            case "U":
                System.out.println("Which task do you want to update: ");
                String task_row = scan.nextLine();

                System.out.println("Update task: ");
                String update_task_row = scan.nextLine();

                db.update(update_task_row);


                break;
            case "D":
                System.out.println("Which task do you want to delete: ");
                String task_row = scan.nextLine();

                db.delete(task_row);


                break;
        }


          // db.create();
        // db.delete();
        // db.update();
        db.read();


    }
}