package rs.veselinromic.mtsstanjelib

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import java.util.ArrayList
import kotlin.browser.document

class StanjeHandler
{

    val stanjeUrl = "http://m.mojtelekom.telekom.rs/stanje";

    data class StanjeKeyValue(val key: String, val value: String)

    var stanjeKeyValues = ArrayList<StanjeKeyValue>();

//    fun main(args: Array<String>)
//    {
//        println("Pozdravljam");
//    }

    fun retrieveStanjeFromNetwork(): ArrayList<StanjeKeyValue>
    {

        var document = Jsoup.connect(stanjeUrl).get();

        var keyValueRows = document.select("tbody > tr");

        for (row in keyValueRows)
        {
            val key = row.select("td").get(0).text();
            val value = row.select("td").get(1).text();

            stanjeKeyValues.add(StanjeKeyValue(key, value));
        }

        return stanjeKeyValues;
    }
}