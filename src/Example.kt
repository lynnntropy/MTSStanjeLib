import rs.veselinromic.mtsstanjelib.StanjeHandler

/**
 * Created by Veselin on 5/2/2015.
 */

fun main(args: Array<String>)
{
    var handler = StanjeHandler();

    var keyValuePairs = handler.retrieveStanjeFromNetwork();

    for (pair in keyValuePairs)
    {
        println(pair.toString());
    }
}