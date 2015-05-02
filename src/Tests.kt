import org.jetbrains.spek.api.Spek
import rs.veselinromic.mtsstanjelib.StanjeHandler
import kotlin.test.assertTrue

class Tests: Spek()
{{
    given("An instance of the handler")
    {
        val handler = StanjeHandler();

        on("retrieving the page and extracting the data")
        {
            val stanje = handler.retrieveStanjeFromNetwork();

            it("should return a non-empty ArrayList")
            {
                assertTrue(stanje.count() > 0);
            }

            it("should return an ArrayList with text inside the first element")
            {
                assertTrue(stanje.get(0).key != null && stanje.get(0).key is String && stanje.get(0).key.length() > 0);
            }
        }
    }
}}
