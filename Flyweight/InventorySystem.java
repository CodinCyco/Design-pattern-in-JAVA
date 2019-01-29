package Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private Catalog catalog = new Catalog();
    private List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName,int orderNumber){
        Item item = catalog.lookUp(itemName);
        Order order = new Order(orderNumber,item);
        orders.add(order);
    }
    void process(){
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }
    String report(){
        return "\n total item objects made : "
                +catalog.totalItemsMade();
    }
}
