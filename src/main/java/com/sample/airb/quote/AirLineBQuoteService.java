package com.sample.airb.quote;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2013-09-25T14:45:53.430+05:30
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "AirLineBQuoteService", 
                  wsdlLocation = "file:/D:/javaEx3/ReservationService/src/main/resources/wsdl/ReservationServiceAirlineB.wsdl",
                  targetNamespace = "http://airb.sample.com/quote/") 
public class AirLineBQuoteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://airb.sample.com/quote/", "AirLineBQuoteService");
    public final static QName AirLineQuoteSOAP = new QName("http://airb.sample.com/quote/", "AirLineQuoteSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/javaEx3/ReservationService/src/main/resources/wsdl/ReservationServiceAirlineB.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AirLineBQuoteService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/javaEx3/ReservationService/src/main/resources/wsdl/ReservationServiceAirlineB.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AirLineBQuoteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AirLineBQuoteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AirLineBQuoteService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AirLineBQuote
     */
    @WebEndpoint(name = "AirLineQuoteSOAP")
    public AirLineBQuote getAirLineQuoteSOAP() {
        return super.getPort(AirLineQuoteSOAP, AirLineBQuote.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AirLineBQuote
     */
    @WebEndpoint(name = "AirLineQuoteSOAP")
    public AirLineBQuote getAirLineQuoteSOAP(WebServiceFeature... features) {
        return super.getPort(AirLineQuoteSOAP, AirLineBQuote.class, features);
    }

}
