import java.util.HashMap;

/**
 * Created by siavj on 20/10/2016.
 */
public class Main {


    public static void main(String args[]){
        LogFile logFile = new LogFile("access_log");
        System.out.println("Num of Connections: " + logFile.getNumEntries());
        System.out.println("Num of distinct IP: " + logFile.distinctIP());
        System.out.println("Num of times each ip occurs:\n" +logFile.entriesPerIP() + "\n");

        Map m = new Map();
        Reducer r = new Reducer();
        int numConnections = 0, numDistinct = 0;

        System.out.println("I am unable to run multiple mappers and reducers simultaneously in a standard IDE \n" +
                "so I just run them once but the data should be partitioned and run on multiple map/reducers in real world\n");

        HashMap<String, Integer> results= r.reduce(m.map(logFile));
        numDistinct = results.values().size();
        for(Integer i : results.values() ) {
            numConnections += i;
        }
        System.out.println("Num of Connections using Map/Reduce: " +numConnections);
        System.out.println("Num of distinct IP using Map/Reduce: " +numDistinct);
        System.out.println("Num of times each ip occurs using Map/Reduce:\n" +results);

    }
}
