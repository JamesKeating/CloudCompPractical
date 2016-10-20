/**
 * Created by siavj on 20/10/2016.
 */
public class Main {


    public static void main(String args[]){
        LogFile logFile = new LogFile("access_log");
        System.out.println("Num of Connections: " + logFile.getNumEntries());
        System.out.println("Num of distinct IP: " + logFile.distinctIP());
        System.out.println(logFile.entriesPerIP());
    }
}
