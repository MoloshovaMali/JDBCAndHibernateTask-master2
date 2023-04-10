package peaksoft.service;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
//    UserDaoJdbcImpl userDaoJdbc = new UserDaoJdbcImpl();
    UserDaoHibernateImpl userDaoHibernate=new UserDaoHibernateImpl();
    public void createUsersTable() {
//        userDaoJdbc.createUsersTable();
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
//        userDaoJdbc.dropUsersTable();
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
//        userDaoJdbc.saveUser("Kanat", "Subanov", (byte) 23);
        userDaoHibernate.saveUser("Kanat","Subanov",(byte)23);
    }

    public void removeUserById(long id) {
//        userDaoJdbc.removeUserById((Long)id);
        userDaoHibernate.removeUserById((Long)id);
    }

    public List<User> getAllUsers() {
//        return userDaoJdbc.getAllUsers();
        return  userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
//        userDaoJdbc.cleanUsersTable();
        userDaoHibernate.cleanUsersTable();
    }
}
