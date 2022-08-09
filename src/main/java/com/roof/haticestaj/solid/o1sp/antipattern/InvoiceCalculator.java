package com.roof.haticestaj.solid.o1sp.antipattern;

public class InvoiceCalculator {
    Invoice invoice;

    public double calculateTotal() {
        double price = ((invoice.getBook().getPrice() - invoice.getBook().getPrice() * invoice.getDiscountRate()) * invoice.getQuantity());

        double priceWithTaxes = price * (1 + invoice.getTaxRate());

        return priceWithTaxes;
    }
}
