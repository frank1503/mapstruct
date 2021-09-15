package expressions;

import lombok.Builder;

@Builder
public class Customer {

    private String name;
    private int customerNumber;

    public Customer(String name, int customerNumber) {
        this.name = name;
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
