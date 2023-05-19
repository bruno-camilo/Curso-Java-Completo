package Fixacao.entities;

import Enumeracoes.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }
    public Double total(){
        Double sum = 0.0;
        for (OrderItem o: orderItems) {
           sum += o.subTotal();
        }
        return  sum;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) +" \n" );
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate() + ")  - " + client.getEmail() + "\n");
        sb.append("Order items: \n");
        for (OrderItem od: orderItems) {
            sb.append(od + "\n" );
        }
        sb.append("Total price: $" + total());
       return sb.toString();
    }
}
