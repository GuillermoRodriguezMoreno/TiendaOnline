package org.iesvdm;

import org.iesvdm.models.Account;
import org.iesvdm.models.Customer;
import org.iesvdm.models.Product;
import org.iesvdm.models.WebUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class TestInstanciarClases {

    @Test
    public void instanciar(){

        Account cuenta = new Account("1", "fuengirola", false, LocalDate.now(), null);
        Customer cliente = new Customer("1", "fuengirola", "666666666", "example@gmail.com");
        WebUser usuario = new WebUser(cliente, "nick", "123", WebUser.UserState.ACTIVE);

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

}
