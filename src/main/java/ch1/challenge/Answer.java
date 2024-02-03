package ch1.challenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


class Answer {
    // Change these boolean values to control whether you see
    // the expected answer and/or hints
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static List<Order> filterOrders(List<Order> orders, LocalDate filterDate) {

        ArrayList<Order> filteredOrders = OrderUtil.getOrdersAfterDate(orders, filterDate);
        System.out.println("Filtered Orders: " + filteredOrders);
        return filteredOrders;
    }
}

class OrderUtil {
    // Method to filter orders after a given date
    public static ArrayList<Order> getOrdersAfterDate(List<Order> orders, LocalDate afterDate) {
        // Your code goes here
        return null;
    }
}

class Order {
    private String name;
    private LocalDate date;

    public Order(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Order '%s'\nDate: '%s'", name, date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(name, order.name) && Objects.equals(date, order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date);
    }
}
