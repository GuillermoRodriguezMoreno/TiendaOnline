package org.iesvdm;

import org.iesvdm.models.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;


public class TestOnlineShop {

    @Test
    public void instanciar(){

        Account cuenta = new Account(null, null, "1", "fuengirola", false, LocalDate.now(), null);
        Customer cliente = new Customer(cuenta, null, "1","fuengirola", "666666666", "example@gmail.com");
        WebUser usuario = new WebUser(cliente, "nick", "123", WebUser.UserState.ACTIVE);

        cliente.setWebUser(usuario);

        Assertions.assertEquals(cuenta.getId(), "1");
        Assertions.assertEquals(cliente.getAddress(), "fuengirola");
        Assertions.assertEquals(usuario.getCustomer(), cliente);

    }

    @Test
    public void crearProductos(){

        Product prod1 = new Product("1", "ordenador", 1234.50, "PcComponentes");
        Product prod2 = new Product("2", "impresora", 234, "PcComponentes");
        Product prod3 = new Product("3", "lampara", 50.60, "Ikea");

        Assertions.assertEquals(prod1.getId(), "1");
        Assertions.assertEquals(prod2.getPrecio(), 234);
        Assertions.assertEquals(prod3.getSupplier(), "Ikea");

    }

    @Test
    public void añadirProductos(){

        // Cuenta
        Account cuenta = new Account(null, null, "1", "fuengirola", false, LocalDate.now(), LocalDate.now());

        // Usuario
        WebUser usuario = new WebUser(null, "nick", "123", WebUser.UserState.ACTIVE);

        // Cliente
        Customer cliente = new Customer(cuenta, usuario,"1", "fuengirola", "666666666", "example@gmail.com");

        usuario.setCustomer(cliente);

        // Carrito
        ShoppingCart carrito = new ShoppingCart(usuario.getCustomer().getAccount(), usuario, LocalDate.now(), null);

        // Productos
        Product prod1 = new Product("1", "ordenador", 1234.50, "PcComponentes");
        Product prod2 = new Product("2", "impresora", 234, "PcComponentes");
        Product prod3 = new Product("3", "lampara", 50.60, "Ikea");

        // Linea Productos
        LineItem lineaProducto1 = new LineItem(null, prod1, 2, carrito);
        LineItem lineaProducto2 = new LineItem(null, prod2, 1,  carrito);
        LineItem lineaProducto3 = new LineItem(null, prod3, 4,  carrito);

        ArrayList<LineItem> lineItemList = new ArrayList<>();
        lineItemList.add(lineaProducto1);
        lineItemList.add(lineaProducto2);
        lineItemList.add(lineaProducto3);

        // Settear a carrito

        carrito.setLineItemList(lineItemList);

        // Test existe WebUser y Account y pertenecen a carrito

        Assertions.assertEquals(usuario, carrito.getWebUser());
        Assertions.assertEquals(cuenta, carrito.getAccount());

        // Test carrito contiene producto 1, 2 y 3

        Assertions.assertEquals(prod1, carrito.getLineItemList().get(0).getProduct());
        Assertions.assertEquals(prod2, carrito.getLineItemList().get(1).getProduct());
        Assertions.assertNotEquals(prod1, carrito.getLineItemList().get(2).getProduct());

    }

    @Test
    public void asociadoACarrito(){

        // Account
        Account cuenta = new Account(null, null, "1", "fuengirola", false, LocalDate.now(), LocalDate.now());

        // Pago
        Payment pago = new Payment(null, cuenta, "1", LocalDate.now(), new BigDecimal("34.56"), "Pago realizado");

        ArrayList<Payment> listaPagos = new ArrayList<>();
        listaPagos.add(pago);

        // Pedido
        Order pedido = new Order(listaPagos, cuenta, "1", LocalDate.now(), LocalDate.now(), "fuengirola", Order.OrderStatus.SHIPPED, new BigDecimal("34.56"));

        pago.setOrder(pedido);
        ArrayList<Order> listaPedidos = new ArrayList<>();
        listaPedidos.add(pedido);

        cuenta.setOrderList(listaPedidos);
        cuenta.setPaymentList(listaPagos);

        // Carrito
        ShoppingCart carrito = new ShoppingCart(cuenta, null, LocalDate.now(), null);

        // Test carrito contiene Pago y Pedido asociado a una cuenta
        Assertions.assertEquals(pago, carrito.getAccount().getPaymentList().get(0));
        Assertions.assertEquals(pedido, carrito.getAccount().getOrderList().get(0));

    }
}
