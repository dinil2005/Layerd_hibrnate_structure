package lk.ijse.layerd_hibrnate.bo.custom;

import lk.ijse.layerd_hibrnate.dao.custom.CustomerDAOImpl;
import lk.ijse.layerd_hibrnate.dto.Tm.CustomerTm;
import lk.ijse.layerd_hibrnate.entity.Customer;

import java.sql.SQLException;

public class CustomeBOImpl {
    CustomerDAOImpl customerDAO = new CustomerDAOImpl();
    public boolean addCustomer(Customer dto) throws SQLException, ClassNotFoundException {
        return customerDAO.save(new Customer(dto.getCustomer_id(), dto.getCustomer_name(), dto.getCustomer_address()));
    }

    public boolean updateCustomer(CustomerTm dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(new Customer(dto.getCustomer_id(),dto.getCustomer_name(), dto.getCustomer_address()));
    }

}
