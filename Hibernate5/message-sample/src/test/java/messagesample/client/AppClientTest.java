
import messagesample.entity.Message;
import messagesample.util.HibernateUtil;

import org.hibernate.Session;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class AppClientTest {

    @BeforeAll
    public static void init() {
        //crear entity manager?
    }

    @BeforeEach
    public void initDB() {
        //create database (also delete before create?)
    }

    @AfterAll
    static public void tearDown() {
        //close entity manager?
    }


    @Test
    public void testSaveMessage() {
        //save message
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Message message = new Message( "Hello World" );

        session.save(message);    
        session.getTransaction().commit();
        session.close();

        assertNotNull(message.getId());
    }

}