prosjekt7-uke14
===============
Denne øvingen handler om å få litt innsikt i JAX-WS api-et til JEE. Importer prosjektet som Maven prosjekt til IDEA (husk Auto-import flagget ved importering, ref oppslag på Its Learning). For gradle, bruk `gradle idea` kommando som genererer `IDEA` filene.

Bruk `F6_WS1` foiler som hjelpemidler.

Vi skal implementere enkel tjeneste som sjekker om kreditkortet er gyldig. To klasser er gitt: `CreditCard` og `CardValidator`. Disse to må havne i en war som skal deployes til glassfish.

Consumer mappe inneholder oppsett for klienten som kaller `CardValidator` tjenesten. Bruk kommandoen `mvn clean generate-sources` for å generere JAXB artifakter.

Hvis alt går bra, sjekk `http://localhost:8080/prosjekt7-uke14/CardValidatorService?wsdl`, og utforsk wsdl-en.


