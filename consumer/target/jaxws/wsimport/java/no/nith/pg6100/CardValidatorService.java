
package no.nith.pg6100;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CardValidatorService", targetNamespace = "http://pg6100.nith.no/", wsdlLocation = "http://localhost:8080/prosjekt7-uke14-0.1/CardValidatorService?wsdl")
public class CardValidatorService
    extends Service
{

    private final static URL CARDVALIDATORSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(no.nith.pg6100.CardValidatorService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = no.nith.pg6100.CardValidatorService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/prosjekt7-uke14-0.1/CardValidatorService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/prosjekt7-uke14-0.1/CardValidatorService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CARDVALIDATORSERVICE_WSDL_LOCATION = url;
    }

    public CardValidatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardValidatorService() {
        super(CARDVALIDATORSERVICE_WSDL_LOCATION, new QName("http://pg6100.nith.no/", "CardValidatorService"));
    }

    /**
     * 
     * @return
     *     returns CardValidator
     */
    @WebEndpoint(name = "CardValidatorPort")
    public CardValidator getCardValidatorPort() {
        return super.getPort(new QName("http://pg6100.nith.no/", "CardValidatorPort"), CardValidator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardValidator
     */
    @WebEndpoint(name = "CardValidatorPort")
    public CardValidator getCardValidatorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pg6100.nith.no/", "CardValidatorPort"), CardValidator.class, features);
    }

}