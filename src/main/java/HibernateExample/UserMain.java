package HibernateExample;
import org.hibernate.Session;

public class UserMain {
    static Session session;
    public static void main(String[] args) {
        System.out.println(".......Hibernate Maven Example.......\n");


        Session session = UserSession.getSessionFactory().openSession();
        session.beginTransaction();
        User userObj = new User();
        userObj.setUserid(5);
        userObj.setUsername("Editor ");
        userObj.setCreatedBy("Administrator");
        userObj.setCreatedDate("01/07/1996");

        session.save(userObj);
        session.getTransaction().commit();
        session.close();


    }

}

