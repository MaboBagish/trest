public interface Connectable {

String[] reternSomeStrings(int index, int count) throws Exception;
String[] reternSomeStringsNew(int startIndex, int endindex);
String reternStringByKey(String key);

    void openConnection();
    void closeConnection();
    void connectBase();
    void read(int index) throws Exception;
    void scan(int key);
    void readKey(int key);
    void readBaseGroup(int key[]);
    void scanValueBase();
    void recBase();
    void replaceIndex(int index);
    void replaceKey(int index);


}
