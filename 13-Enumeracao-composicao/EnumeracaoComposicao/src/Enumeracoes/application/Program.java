package Enumeracoes.application;

import Enumeracoes.entities.Order;
import Enumeracoes.entities.enums.OrderStatus;

import java.sql.SQLOutput;
import java.util.Date;

public class Program {
    public static void main(String[] args){
        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;
        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");

        System.out.println(os1);
        System.out.println(os2);


    }
}
