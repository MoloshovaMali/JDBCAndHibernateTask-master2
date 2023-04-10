package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        /**jdbc**/
//        Util.connection().close();
//        UserDaoJdbcImpl userDaoJdbc=new UserDaoJdbcImpl();
//        userDaoJdbc.createUsersTable();
//        userDaoJdbc.saveUser("Kanat","Kubanov",(byte) 23);
//        userDaoJdbc.saveUser("Malika","Moloshova",(byte) 17);
//        userDaoJdbc.saveUser("Nurisa","Jarmamat kyzy",(byte) 20);
//        userDaoJdbc.saveUser("Bakyt","Latibov",(byte) 22);
//        userDaoJdbc.saveUser("Uson","Kamylov",(byte) 22);
//        userDaoJdbc.saveUser("Asan","Tairov",(byte) 23);
//        userDaoJdbc.removeUserById(1);
//        userDaoJdbc.dropUsersTable();
//        for(User user: userDaoJdbc.getAllUsers()){
//            System.out.println(user);
//        }
//        userDaoJdbc.cleanUsersTable();
        /**hibernate**/
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
        userDaoHibernate.createUsersTable();
        userDaoHibernate.dropUsersTable();
        userDaoHibernate.saveUser("Kanat","Kubanov",(byte) 23);
        userDaoHibernate.saveUser("Malika","Moloshova",(byte)17);
        userDaoHibernate.saveUser("Uson","Kamylov",(byte)23);
        userDaoHibernate.saveUser("Bakyt","Latibov",(byte)22);
        userDaoHibernate.saveUser("Asan","Tairov",(byte)23);
        userDaoHibernate.removeUserById(3L);
        for(User user: userDaoHibernate.getAllUsers()){
            System.out.println(user);
        }
        userDaoHibernate.cleanUsersTable();

    }
}
