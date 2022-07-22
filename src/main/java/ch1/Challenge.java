package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        Order order = new Order("cola", new Date());
        // should return the order
        System.out.println("Not empty: " + OrderUtil.getOrdersAfterDate(Arrays.asList(order), new Date(20, 0, 1)));
        // should filter the order
        System.out.println("Empty: " + OrderUtil.getOrdersAfterDate(Arrays.asList(order), new Date()));

    }
}

class OrderUtil {
    public static ArrayList<Order> getOrdersAfterDate(List<Order> newOrders, Date date) {
        ArrayList<Order> result = new ArrayList<>();

        for (Order order : newOrders) {
            if (order.getDate().compareTo(date) < 0) {
                continue;
            }
            result.add(order);
        }

        return result;
    }
}

class Order {
    private String name;
    private Date date;

    public Order(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Order '%s'\nDate: '%s'", name, date);
    }
}



