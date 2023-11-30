package com.paymentchain.billing.common;

import com.paymentchain.billing.dto.InvoiceResponse;
import com.paymentchain.billing.entities.Invoice;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-30T11:35:04-0600",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231030-1524, environment: Java 17.0.9 (Eclipse Adoptium)"
)
@Component
public class InvoiceResposeMapperImpl implements InvoiceResposeMapper {

    @Override
    public InvoiceResponse InvoiceToInvoiceRespose(Invoice source) {
        if ( source == null ) {
            return null;
        }

        InvoiceResponse invoiceResponse = new InvoiceResponse();

        invoiceResponse.setInvoiceId( source.getId() );
        invoiceResponse.setCustomer( source.getCustomerId() );
        invoiceResponse.setNumber( source.getNumber() );
        invoiceResponse.setDetail( source.getDetail() );
        invoiceResponse.setAmount( source.getAmount() );

        return invoiceResponse;
    }

    @Override
    public List<InvoiceResponse> InvoiceListToInvoiceResposeList(List<Invoice> source) {
        if ( source == null ) {
            return null;
        }

        List<InvoiceResponse> list = new ArrayList<InvoiceResponse>( source.size() );
        for ( Invoice invoice : source ) {
            list.add( InvoiceToInvoiceRespose( invoice ) );
        }

        return list;
    }
}
