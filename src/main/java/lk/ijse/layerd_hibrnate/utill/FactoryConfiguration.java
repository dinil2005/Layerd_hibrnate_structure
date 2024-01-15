package lk.ijse.layerd_hibrnate.utill;



import lk.ijse.layerd_hibrnate.dto.Tm.CustomerTm;
import lk.ijse.layerd_hibrnate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class);//.addAnnotatedClass(Book.class);// Add new calls pass class name annotated class method
        sessionFactory= configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?
                factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
