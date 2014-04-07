package no.nith.pg6100;

import no.nith.pg6100.domain.CreditCard;

import javax.xml.ws.WebServiceRef;

public class ClientApp {
    @WebServiceRef
    private static CardValidatorService cardValidatorService;

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        creditCard.setNumber("12341234");
        creditCard.setExpiryDate("10/10");
        creditCard.setType("VISA");
        creditCard.setControlNumber(1234);
        CardValidator cardValidator = cardValidatorService.getCardValidatorPort();
        System.out.println(cardValidator.validate(creditCard));
    }
}

