//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.18 at 02:45:41 PM IST 
//


package com.task.schemas.corebank;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.task.schemas.corebank package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.task.schemas.corebank
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountBalanceByAccNoRequest }
     * 
     */
    public GetAccountBalanceByAccNoRequest createGetAccountBalanceByAccNoRequest() {
        return new GetAccountBalanceByAccNoRequest();
    }

    /**
     * Create an instance of {@link GetAccountBalanceByAccNoResponse }
     * 
     */
    public GetAccountBalanceByAccNoResponse createGetAccountBalanceByAccNoResponse() {
        return new GetAccountBalanceByAccNoResponse();
    }

    /**
     * Create an instance of {@link AccountInfo }
     * 
     */
    public AccountInfo createAccountInfo() {
        return new AccountInfo();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link GetTotalAccountBalanceRequest }
     * 
     */
    public GetTotalAccountBalanceRequest createGetTotalAccountBalanceRequest() {
        return new GetTotalAccountBalanceRequest();
    }

    /**
     * Create an instance of {@link GetTotalAccountBalanceResponse }
     * 
     */
    public GetTotalAccountBalanceResponse createGetTotalAccountBalanceResponse() {
        return new GetTotalAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link TotalUserAccountBalanceInfo }
     * 
     */
    public TotalUserAccountBalanceInfo createTotalUserAccountBalanceInfo() {
        return new TotalUserAccountBalanceInfo();
    }

    /**
     * Create an instance of {@link FundTransferRequest }
     * 
     */
    public FundTransferRequest createFundTransferRequest() {
        return new FundTransferRequest();
    }

    /**
     * Create an instance of {@link FundTransferResponse }
     * 
     */
    public FundTransferResponse createFundTransferResponse() {
        return new FundTransferResponse();
    }

    /**
     * Create an instance of {@link FundTransferInfo }
     * 
     */
    public FundTransferInfo createFundTransferInfo() {
        return new FundTransferInfo();
    }

}
