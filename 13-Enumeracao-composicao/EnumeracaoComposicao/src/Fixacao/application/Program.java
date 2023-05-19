package Fixacao.application;

import Enumeracoes.entities.enums.OrderStatus;
import Fixacao.entities.Client;
import Fixacao.entities.Order;
import Fixacao.entities.OrderItem;
import Fixacao.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String clientName = sc.next();
        sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());
        //criar o objeto
        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        System.out.print("How many items to this order? ");
        int x = sc.nextInt();

        Order order = new Order(new Date(), orderStatus, client);
        for (int i = 1; i <= x; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int producQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(producQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
