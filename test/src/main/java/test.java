/**
 * Created by jin on 16. 7. 14.
 */
public class test {

    public static void main(String args[]){
        String result = directoryNames.replaceName("C:\\word\\directory5", "txt");
        System.out.println("result : " + result);
        directoryNames directoryNames = new directoryNames();
        result = directoryNames.replaceNames("C:\\word\\directory3", "txt");
        System.out.println("result2 : " + result);
    }

}
