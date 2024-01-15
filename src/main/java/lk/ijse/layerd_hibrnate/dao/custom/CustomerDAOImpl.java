package lk.ijse.layerd_hibrnate.dao.custom;

import lk.ijse.layerd_hibrnate.dto.Tm.CustomerTm;
import lk.ijse.layerd_hibrnate.entity.Customer;
import lk.ijse.layerd_hibrnate.utill.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl {

//    public ArrayList<CustomerTm> getAll() throws SQLException, ClassNotFoundException {
//
//        ArrayList<CustomerTm> allCustomers = new ArrayList<>();
//        while (resultSet.next()){
//            allCustomers.add(new CustomerTM(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5)));
//        }
//        return allCustomers;
//    }
//

    public boolean save(Customer entity) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(entity);
        transaction.commit();
        session.close();
        return true;
      //  return CrudUtil.execute("INSERT INTO customer VALUES (?,?,?)",entity.getCustomer_id(),entity.getCustomer_name(),entity.getCustomer_address());
    }
    public boolean update(Customer entity) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
        //return CrudUtil.execute("UPDATE customer SET cust_name = ?, address = ?  WHERE customer_id = ?",entity.getCustomer_name(),entity.getCustomer_address(),entity.getCustomer_id());
    }


    public boolean delete(CustomerTm entity) throws SQLException, ClassNotFoundException {
        return  true;
        // return CrudUtil.execute("DELETE FROM customer WHERE ID = ?",entity.getCustomer_id());
    }

}
