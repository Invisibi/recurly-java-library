package com.ning.billing.recurly.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class that represents the Concept of a Coupon within the Recurly API.
 */
@XmlRootElement(name = "discount_in_cents")
public class DiscountInCents {


    @XmlElement(name = "USD")
    private Integer USD;

    public Integer getUSD(){
        return USD;
    }

    public void setUSD(Integer usd){
        this.USD = usd;
    }

}
