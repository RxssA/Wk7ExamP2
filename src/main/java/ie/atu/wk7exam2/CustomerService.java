package ie.atu.wk7exam2;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
    private GetCustomerById getCustomerById;

    @Autowired
    public void GetCustomerById(){
        this.getCustomerById = new GetCustomerById();
    }

}
