import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Dictionary[] dictionaries = readFile("src/Key.json");

        System.out.println ("\nId|      key       | value      ");
        System.out.println ("--+-----------------+--------------+-------");
        for (Dictionary dictionary: dictionaries){
            printDictionary (dictionary);
        }



ConnectToDataBase c = new ConnectToDataBase (  );
String[] strings = c.reternSomeStrings (0,3);
for (String s : strings){
    System.out.println (s);
}
String result = c.reternStringByKey ("");
        System.out.println (result );

    }
    private static void printDictionary(Dictionary dictionary){
        String frm = "%-2d| %-12s | %-12s ";
        String toPrint = String.format (frm,dictionary.getIndex(), dictionary.getKey ( ), dictionary.getValue ( ));
        System.out.println (toPrint );
    }

    private static Dictionary[] readFile(String fileName) throws IOException, ParseException {

        JSONParser parser = new JSONParser ( );

        try (Reader reader = new FileReader (fileName)) {
            JSONArray jsonArray = (JSONArray) parser.parse (reader);
            Dictionary[] dictionaries = new Dictionary[jsonArray.size ( )];
            Integer q = 0;
            for (Object o : jsonArray) {
                JSONObject fact = (JSONObject) o;

                dictionaries[q] = new Dictionary ((Long) fact.get ("id"),
                        (String) fact.get ("key"),
                        (String) fact.get ("value"))
                {};

                q = q + 1;
            }

            return dictionaries;
        }
    }

}
