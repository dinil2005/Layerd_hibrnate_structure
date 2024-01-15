package lk.ijse.layerd_hibrnate.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private String customer_id;
    private String customer_name;
    private String customer_address;


    public Customer(){

    }

    public Customer(String customer_id, String customer_name, String customer_address) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
