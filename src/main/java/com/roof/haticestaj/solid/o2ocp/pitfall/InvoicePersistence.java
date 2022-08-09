package com.roof.haticestaj.solid.o2ocp.pitfall;

import com.roof.haticestaj.solid.o1sp.pitfall.Invoice;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }

    public void saveToDatabase() {
        // Saves the invoice to database
    }
}
