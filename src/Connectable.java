public interface Connectable {

    void openConnection();
    void closeConnection();
    void read(int index) throws Exception;


}
