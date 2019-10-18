//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.18 at 03:09:59 PM IST 
//


package com.dummy_core_bank.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for totalUserAccountBalanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="totalUserAccountBalanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalBalanceForUser" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalUserAccountBalanceInfo", propOrder = {
    "userId",
    "accountDetails",
    "totalBalanceForUser"
})
public class TotalUserAccountBalanceInfo {

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String accountDetails;
    @XmlElement(required = true)
    protected BigDecimal totalBalanceForUser;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountDetails(String value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the totalBalanceForUser property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBalanceForUser() {
        return totalBalanceForUser;
    }

    /**
     * Sets the value of the totalBalanceForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBalanceForUser(BigDecimal value) {
        this.totalBalanceForUser = value;
    }

}
