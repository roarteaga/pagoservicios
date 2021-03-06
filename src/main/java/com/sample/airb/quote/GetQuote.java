
package com.sample.airb.quote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getQuote" type="{http://airb.sample.com/quote/}getQuoteRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getQuote"
})
@XmlRootElement(name = "getQuote")
public class GetQuote {

    @XmlElement(required = true)
    protected GetQuoteRequest getQuote;

    /**
     * Gets the value of the getQuote property.
     * 
     * @return
     *     possible object is
     *     {@link GetQuoteRequest }
     *     
     */
    public GetQuoteRequest getGetQuote() {
        return getQuote;
    }

    /**
     * Sets the value of the getQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetQuoteRequest }
     *     
     */
    public void setGetQuote(GetQuoteRequest value) {
        this.getQuote = value;
    }

}
