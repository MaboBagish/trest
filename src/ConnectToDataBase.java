

public class ConnectToDataBase implements Connectable {
    private Dictionary[] strings;


    public ConnectToDataBase() {

//        strings = new Dictionary[]{
//                new Dictionary (strings, "key", "value"),
//                new Dictionary ((Long) fact.get ("id"), "key", "value"),
//                new Dictionary ((Long) fact.get ("id"), "key", "value")
//        };
//        strings = new String[]{
//                "Ivan",
//                "Petya",
//                "Denis",
//                "Vasya",
//                "Sergey"
//        };
    }

    public ConnectToDataBase(Dictionary[] strings) {
        this.strings = strings;
    }

    @Override
    public String[] reternSomeStrings(int index, int count) {

        String str = "";



            for (int i = index; i < index + count; i++) {
                str += strings[i] + " ";
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
        for (Dictionary d : strings){
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
