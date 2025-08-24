
class Order {
    int customerId;
    String customerName;

    public Order(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
    public void printDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}

class OnlineOrder extends Order {
    String deliveryAddress;

    public OnlineOrder(int customerId, String customerName, String deliveryAddress) {
        super(customerId, customerName); 
        this.deliveryAddress = deliveryAddress;
    }

    public void printDetails() {
        super.printDetails(); 
        System.out.println("Delivery Address: " + deliveryAddress);
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder(101, "Kavya", "Hyderabad, India");
        order.printDetails();
    }
}
