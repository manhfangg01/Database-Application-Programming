package assignment1;

import java.util.List;

public class Order extends TruuTuong1 implements Giaodien1{
    private String orderId;
    private Customer customer;
    private double totalAmount;
    private List<OrderItems> items;

    public Order(String orderId, Customer customer, double totalAmount) {
        this.orderId = orderId;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer=" + customer +
                ", totalAmount=" + totalAmount +
                '}';
    }

    @Override
    public void gd1() {
        System.out.println("this is gd1 in order");
    }

    @Override
    public void gd2() {
        System.out.println("this is gd2 in order");
    }
}
