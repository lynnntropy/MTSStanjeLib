# MTSStanjeLib
Java/Kotlin biblioteka za preuzimanje stanja računa za korisnike Mobilne Telefonije Srbije.

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
