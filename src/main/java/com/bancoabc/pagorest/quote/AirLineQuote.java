package com.bancoabc.pagorest.quote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


@WebService(targetNamespace = "http://pago.servicios.com/quote/", name = "PagoRestQuote")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AirLineQuote {

    @WebResult(name = "getQuoteResponse", targetNamespace = "http://air.sample.com/quote/", partName = "parameters")
    @WebMethod(action = "http://air.sample.com/quote/getQuoteOperation")
    public GetQuoteResponse getQuoteOperation(
        @WebParam(partName = "parameters", name = "getQuote", targetNamespace = "http://air.sample.com/quote/")
        GetQuote parameters
    ) throws GetQuoteOperationFault;
}
