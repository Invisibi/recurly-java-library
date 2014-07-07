package com.ning.billing.recurly.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class that represents the Concept of a Coupon within the Recurly API.
 */
@XmlRootElement(name = "discount_in_cents")
public class DiscountInCents {


    @XmlElement(name = "USD")
    private int USD;

    public int getUSD(){
        return USD;
    }

    public void setUSD(int usd){
        this.USD = usd;
    }

}
