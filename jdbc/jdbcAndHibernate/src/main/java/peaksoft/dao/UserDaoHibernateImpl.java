package peaksoft.dao;

import org.hibernate.Session;
import peaksoft.model.User;
import peaksoft.util.HibernateUtil;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public UserDaoHibernateImpl() {
    }

    @Override
    public void createUsersTable() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL = "CREATE TABLE  IF NOT EXISTS users(" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(50) NOT NULL," +
                "lastName VARCHAR(50) NOT NULL ," +
                "age SMALLINT);";
        session.beginTransaction();
        session.createSQLQuery(SQL).executeUpdate();
        session.getTransaction().commit();
        session.close();

    }


    @Override
    public void dropUsersTable() {
        Session session =  HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
        String SQL = "DROP TABLE IF EXISTS users";
        session.createSQLQuery(SQL).executeUpdate();
        System.out.println(ANSI_GREEN+"TABLE DELETED"+ANSI_RESET);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session =HibernateUtil.getSessionFactory().openSession();
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeUserById(long id) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.get(User.class,id);
        session.delete(user);
        System.out.println(ANSI_GREEN+"REMOVE USER BY ID"+ANSI_RESET);
        session.getTransaction().commit();
        session.close();
    }
    @Override
    public List<User> getAllUsers() {
        Session session =HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<User> users = session.createQuery("FROM User").getResultList();
        session.getTransaction().commit();
        session.close();
        return users;
    }

    @Override
    public void cleanUsersTable() {
     Session session=HibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     String SQL = "TRUNCATE TABLE users";
     session.createSQLQuery(SQL).executeUpdate();
        System.out.println(ANSI_GREEN+"CLEAN TABLE"+ANSI_RESET);
     session.getTransaction().commit();
     session.close();

    }
}
