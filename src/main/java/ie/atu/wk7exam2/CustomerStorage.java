package ie.atu.wk7exam2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerStorage {
    public static String getOrderId;
    public static String getName;
    public static String getAge;
    public static String getEmail;
    private int orderId;

    private String name;

    private int age;

    private String email;
}
