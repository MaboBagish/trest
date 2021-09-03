public interface Connectable {

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
