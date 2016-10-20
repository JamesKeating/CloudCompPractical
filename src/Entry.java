/**
 * Created by siavj on 20/10/2016.
 */
public class Entry {

    private String entIP;

    public Entry(String line){
        String arr[] = line.split(" ", 2);
        entIP = arr[0];

    }

    public String getEntIP() {
        return entIP;

    }

}
