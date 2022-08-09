package com.roof.haticestaj.solid.o2ocp.antipattern;

import com.roof.haticestaj.solid.o1sp.antipattern.Invoice;

public class NoSqlPersistence implements InvoicePersistence{
    @Override
    public void save(Invoice invoice) {
        // save to mongodb
    }
}
