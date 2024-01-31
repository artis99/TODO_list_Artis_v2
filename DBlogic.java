import com.mysql.cj.jdbc.DatabaseMetaData;

import java.sql.*;


public class DBlogic {

    private String DB = "jdbc:mysql://localhost:3306/TODO_list_Artis";
    private String USER = "ARCHIE";
    private String PASS = "QQQppp999@@@xc90";


    public void create(String another_task) throws SQLException {


        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String insert = "INSERT INTO tasks (task) VALUES ('"+ another_task +"')";

        stmt.executeUpdate(insert);



    }

    public void delete(String task_row) throws SQLException {


        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String delete = "DELETE FROM tasks WHERE id = '"+ task_row +"'";

        stmt.executeUpdate(delete);

    }
    public void update(String task_row, String task_value) throws SQLException {


        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String update = "UPDATE tasks SET task = '"+ task_value + "' WHERE id = '"+ task_row +"'";

        stmt.executeUpdate(update);

    }

    public void read() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();
        String select = "SELECT * FROM tasks";

        ResultSet resultSet = stmt.executeQuery(select);

        while (resultSet.next()) {
            System.out.println("task: " + resultSet.getInt("task"));
            System.out.println("task: " + resultSet.getString("task"));
            System.out.println(" ");

        }

    }

    public void update(String updateTaskRow) {
    }
}
