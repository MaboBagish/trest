public class Main {
    public static void main(String[] args){

ConnectToDataBase c = new ConnectToDataBase (  );
//String[] strings = c.reternSomeStrings (0,3);
//for (String s : strings){
//    System.out.println (s);
//}
String result = c.reternStringByKey ("key1" );
        System.out.println (result );

    }
}
