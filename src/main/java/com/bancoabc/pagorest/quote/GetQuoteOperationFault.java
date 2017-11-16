
package com.bancoabc.pagorest.quote;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2013-09-25T14:45:52.883+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "getQuoteFault", targetNamespace = "http://air.sample.com/quote/")
public class GetQuoteOperationFault extends Exception {
    
    private com.bancoabc.pagorest.quote.GetQuoteFault getQuoteFault;

    public GetQuoteOperationFault() {
        super();
    }
    
    public GetQuoteOperationFault(String message) {
        super(message);
    }
    
    public GetQuoteOperationFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetQuoteOperationFault(String message, com.bancoabc.pagorest.quote.GetQuoteFault getQuoteFault) {
        super(message);
        this.getQuoteFault = getQuoteFault;
    }

    public GetQuoteOperationFault(String message, com.bancoabc.pagorest.quote.GetQuoteFault getQuoteFault, Throwable cause) {
        super(message, cause);
        this.getQuoteFault = getQuoteFault;
    }

    public com.bancoabc.pagorest.quote.GetQuoteFault getFaultInfo() {
        return this.getQuoteFault;
    }
}
