

public class ConnectToDataBase implements Connectable {
    private Dictionary[] dictionaries;


    public ConnectToDataBase() {

        dictionaries = new Dictionary[]{

        };

    }

    public ConnectToDataBase(Dictionary[] strings) {
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
        for (Dictionary d : dictionaries){
if (d.getKey ().equals (key)){
    result = d.getValue ();
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
}
