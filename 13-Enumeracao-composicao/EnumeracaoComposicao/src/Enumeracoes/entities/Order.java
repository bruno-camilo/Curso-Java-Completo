package Enumeracoes.entities;

import Enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date monent;
    private OrderStatus status;

    public Order(){

    }
    public Order(Integer id, Date monent, OrderStatus status){
        this.id = id;
        this.monent = monent;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMonent() {
        return monent;
    }

    public void setMonent(Date monent) {
        this.monent = monent;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Order [id=" + id + ", moment= "+ monent +", status= " + status+ "]";
    }
}
