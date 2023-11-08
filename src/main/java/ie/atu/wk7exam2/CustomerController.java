package ie.atu.wk7exam2;

import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @PostMapping("user")
    public CustomerStorage getUser(@RequestBody CustomerStorage orderStorage)
    {
        System.out.println("order ID "+ CustomerStorage.getOrderId);
        System.out.println("name "+ CustomerStorage.getName);
        System.out.println("age "+ CustomerStorage.getAge);
        System.out.println("email "+ CustomerStorage.getEmail);
        return orderStorage;
    }


}
