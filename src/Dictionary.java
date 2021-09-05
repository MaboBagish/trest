public class Dictionary implements Connectable {

    public Dictionary(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;
    private boolean isConnect;

    @Override
    public String[] reternSomeStrings(int index, int count) {
        return new String[0];
    }

    @Override
    public String[] reternSomeStringsNew(int startIndex, int endindex) {
        return new String[0];
    }

    @Override
    public String reternStringByKey(String key) {
        return null;
    }

    @Override
    public void openConnection() {
        isConnect = true;
    }

    @Override
    public void closeConnection() {
        isConnect = false;
    }

    @Override
    public void connectBase() {

    }

    @Override
    public void read(int index) throws Exception {
        if(isConnect == false){
            throw  new Exception (  );
        }else {
            System.out.println ( );
        }
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
