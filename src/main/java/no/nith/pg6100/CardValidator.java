package no.nith.pg6100;

import no.nith.pg6100.domain.CreditCard;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CardValidator {

    @WebMethod
    public boolean validate(CreditCard creditCard) {
        return false;
    }
}
