public class Dictionary implements Connectable {
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
    public void openConnection() {
        isConnect = true;
    }

    @Override
    public void closeConnection() {
        isConnect = false;
    }

    @Override
    public void read(int index) throws Exception {
        if(isConnect == false){
            throw  new Exception (  );
        }else {
            System.out.println ( );
        }
    }
}
