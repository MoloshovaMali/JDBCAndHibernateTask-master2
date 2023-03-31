package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Util.connection().close();
        UserDaoJdbcImpl userDaoJdbc=new UserDaoJdbcImpl();
//        userDaoJdbc.createUsersTable();
        userDaoJdbc.saveUser("Kanat","Kubanov",(byte) 23);
        userDaoJdbc.saveUser("Malika","Moloshova",(byte) 17);
        userDaoJdbc.saveUser("Nurisa","Jarmamat kyzy",(byte) 20);
        userDaoJdbc.saveUser("Bakyt","Latibov",(byte) 22);
        userDaoJdbc.saveUser("Uson","Kamylov",(byte) 22);
        userDaoJdbc.saveUser("Asan","Tairov",(byte) 23);
//        userDaoJdbc.removeUserById(1);
//        userDaoJdbc.dropUsersTable();
//        for(User user: userDaoJdbc.getAllUsers()){
//            System.out.println(user);
//        }
//        userDaoJdbc.cleanUsersTable();

    }
}
