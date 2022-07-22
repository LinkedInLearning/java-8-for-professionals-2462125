package ch1;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        NewOrder newOrder = new NewOrder("cola", LocalDateTime.now());
        // should return the order
        System.out.println("Not empty: " + NewOrderUtil.getOrdersAfterDate(Arrays.asList(newOrder), LocalDateTime.of(2022, 1, 1, 0, 0, 0)));
        // should filter the order
        System.out.println("Empty: " + NewOrderUtil.getOrdersAfterDate(Arrays.asList(newOrder), LocalDateTime.now()));
    }
}

class NewOrderUtil {
    public static ArrayList<NewOrder> getOrdersAfterDate(List<NewOrder> newOrders, LocalDateTime afterDate) {
        ArrayList<NewOrder> result = new ArrayList<>();

        for (NewOrder newOrder : newOrders) {
            if (newOrder.getOrderDate().isAfter(afterDate)) {
                result.add(newOrder);
            }
        }

        return result;
    }
}

class NewOrder {
    private String name;
    private LocalDateTime orderDate;

    public NewOrder(String name, LocalDateTime orderDate) {
        this.name = name;
        this.orderDate = orderDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return String.format("Order '%s'\nDate: '%s'", name, orderDate);
    }
}



