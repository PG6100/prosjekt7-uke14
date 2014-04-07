
package no.nith.pg6100;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CardValidator", targetNamespace = "http://pg6100.nith.no/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CardValidator {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validate", targetNamespace = "http://pg6100.nith.no/", className = "no.nith.pg6100.Validate")
    @ResponseWrapper(localName = "validateResponse", targetNamespace = "http://pg6100.nith.no/", className = "no.nith.pg6100.ValidateResponse")
    public boolean validate(
        @WebParam(name = "arg0", targetNamespace = "")
        CreditCard arg0);

}