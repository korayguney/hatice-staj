package com.roof.haticestaj.solid.o1sp.antipattern;

public class InvoicePrinter {
    Invoice invoice;

    public void printInvoice() {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().getName() + " " + invoice.getBook().getPrice() + "$");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }
}
