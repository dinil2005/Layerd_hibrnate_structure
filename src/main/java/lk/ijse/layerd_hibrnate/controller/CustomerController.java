package lk.ijse.layerd_hibrnate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import lk.ijse.layerd_hibrnate.bo.custom.CustomeBOImpl;
import lk.ijse.layerd_hibrnate.dao.custom.CustomerDAOImpl;
import lk.ijse.layerd_hibrnate.dto.Tm.CustomerTm;
import lk.ijse.layerd_hibrnate.entity.Customer;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {
    @FXML
    private TextField custIdTxt;

    @FXML
    private TextField custNameTxt;

    @FXML
    private TextField custAddresTxt;

    @FXML
    private Button saveBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private Button updateBtn;

    @FXML
    private TableView<?> customerTable;

    @FXML
    private TableColumn<?, ?> cust_id_row;

    @FXML
    private TableColumn<?, ?> cust_name_row;

    @FXML
    private TableColumn<?, ?> cust_adress_row;


    CustomeBOImpl customeBO = new CustomeBOImpl();
    CustomerDAOImpl customerDAO = new CustomerDAOImpl();
    @FXML
    void deleteOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {

    }


    @FXML
    void saveOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
 String id = custIdTxt.getText();
 String name = custNameTxt.getText();
 String addrres = custAddresTxt.getText();
        boolean isSaved = customerDAO.save(new Customer(id,name,addrres));
        if(isSaved){
            System.out.println("Saved");
        }

    }

    @FXML
    void updateBtnOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String id = custIdTxt.getText();
        String name = custNameTxt.getText();
        String addrres = custAddresTxt.getText();

        boolean isUpdate = customerDAO.update(new Customer(id,name,addrres));

        if (isUpdate){
            System.out.println("Update");
        }

    }



    private void setCellValues() {
        cust_id_row.setCellValueFactory(new PropertyValueFactory<>("customer_id"));
        cust_name_row.setCellValueFactory(new PropertyValueFactory<>("ustomer_name"));
        cust_adress_row.setCellValueFactory(new PropertyValueFactory<>("customer_address"));
//        colCustomerId.setCellValueFactory(new PropertyValueFactory<>("customerId"));
//        colCustomerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
//        colTelephone.setCellValueFactory(new PropertyValueFactory<>("contact"));
//        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
//        colGmail.setCellValueFactory(new PropertyValueFactory<>("gmail"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setCellValues();
    }
}


