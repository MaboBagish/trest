import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ConnectToDataBase implements Connectable {
    Dictionary[] dictionaries = readFile ("src/Key.json");


    public ConnectToDataBase() throws IOException, ParseException {






    }

    public ConnectToDataBase(Dictionary[] strings) throws IOException, ParseException {
        this.dictionaries = strings;
    }

    @Override
    public String[] reternSomeStrings(int index, int count) {

        String str = "";


        for (int i = index; i < index + count; i++) {
            str += dictionaries[i] + " ";
        }

        String[] newStrings = str.split (" ");

        return newStrings;
    }

    @Override
    public String[] reternSomeStringsNew(int startIndex, int endindex) {
        return new String[0];
    }

    @Override
    public String reternStringByKey(String key) {
        String result = "";
        for (Dictionary d : dictionaries) {
            if (d.getKey ( ).equals (key)) {
                result = d.getValue ( );
            }
        }
        return result;
    }

    @Override
    public void openConnection() {

    }

    @Override
    public void closeConnection() {

    }

    @Override
    public void connectBase() {

    }

    @Override
    public void read(int index) throws Exception {

    }

    @Override
    public void scan(int key) {

    }

    @Override
    public void readKey(int key) {

    }

    @Override
    public void readBaseGroup(int[] key) {

    }

    @Override
    public void scanValueBase() {

    }

    @Override
    public void recBase() {

    }

    @Override
    public void replaceIndex(int index) {

    }

    @Override
    public void replaceKey(int index) {

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
                        (String) fact.get ("value")) {
                };

                q = q + 1;
            }

            return dictionaries;
        }
    }
}
