import entity.Students;
import org.hibernate.SessionFactory;

import org.hibernate.SessionFactory;
import  org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        Students student1 = new Students();
//        student1.setFirstname("Jonny");
//        student1.setLastname("Smith");
//        student1.setAge(22);

//        session.save(student1);
        Students student = session.get(Students.class, 1);
        System.out.println(student);
        transaction.commit();



        session.close();
        sessionFactory.close();
    }
}
