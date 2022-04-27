package JavaTestII;

import java.util.ArrayList;
import java.util.List;


public class Manager {
    List<Customer>customerList=new ArrayList<Customer>();


    public Manager(){
        this.customerList=new ArrayList<Customer>();
    }
    public Manager(List<Customer> customerList) {
        this.customerList = customerList;
    }


    public void addCustomer(String name,String email,String phone){
        Customer customer=new Customer();

        customer.setName(name);
        customer.setEmail(email);
        customer.setPhone(phone);
        customerList.add(customer);
    }
    public void findByName(String name){
        boolean check=false;
        for (int i=0;i<customerList.size();i++){
            if(customerList.get(i).getName().contains(name)){
                System.out.println(customerList.get(i));
                check=true;
            }
        }
        if (!check){
            System.out.println("Not found");
        }
    }
    public void displayAll(){
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
    }
}
