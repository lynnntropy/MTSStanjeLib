# MTSStanjeLib
Java/Kotlin biblioteka za preuzimanje stanja računa za korisnike Mobilne Telefonije Srbije.

##Napomena
Važno je razumeti da se ova biblioteka bazira na web stranici koja je dostupna samo kada ste povezani na MT:S internet
preko broja za koji želite da proverite stanje. Prema tome, biblioteka je korisna samo kada se koristi na samom telefonu
(npr. u Android aplikaciji), ili na računaru koji na internet izlazi preko telefona ili 3G modema.  

##Korišćenje
Kotlin:

    fun main(args: Array<String>)
    {
        var handler = StanjeHandler();
    
        var keyValuePairs = handler.retrieveStanjeFromNetwork();
    
        for (pair in keyValuePairs)
        {
            println(pair.toString());
        }
    }
    
Java:

    public static void main()
    {
        StanjeHandler handler = new StanjeHandler();
    
        ArrayList<StanjeKeyValue> keyValuePairs = handler.retrieveStanjeFromNetwork();
    
        for (StanjeKeyValue pair : keyValuePairs)
        {
            System.out.println(pair.toString());
        }
    }
    
##Licenca
Biblioteka je zaštićena pod MIT licencom. Za više detalja pogledate fajl LICENSE.
