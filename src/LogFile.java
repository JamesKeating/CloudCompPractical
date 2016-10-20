import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by siavj on 20/10/2016.
 */
public class LogFile {

    private ArrayList<Entry> logFile = new ArrayList<>();

    public LogFile(String filename){
        this.logFile = processFile(filename);
    }

    private ArrayList<Entry> processFile(String filename){

        ArrayList<Entry> fileLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileLines.add(new Entry(line));
            }
        }
        catch (Exception e){e.printStackTrace();}
        return fileLines;

    }

    public int getNumEntries(){
        int numEnt = 0;

        for (Entry ent : this.logFile)
            numEnt +=1;

        return numEnt;
    }


    public int instancesOfIP(String ip){
        int instancesOfIP = 0;
        for (Entry ent : logFile){
            if (ent.getEntIP() == ip);
                instancesOfIP +=1;
        }
        return instancesOfIP;
    }

    public int distinctIP(){
        ArrayList<String> distictIP = new ArrayList<>();
        for (Entry ent : this.logFile)
            if (!distictIP.contains(ent.getEntIP())){
                distictIP.add(ent.getEntIP());
            }
        return distictIP.size();
    }

    public HashMap<String, Integer> entriesPerIP(){
        HashMap<String, Integer> entriesPerIP = new HashMap<>();
        for(Entry ent: logFile){
            entriesPerIP.putIfAbsent(ent.getEntIP(), 0);
            entriesPerIP.put(ent.getEntIP(), entriesPerIP.get(ent.getEntIP()) +1);
        }
        return entriesPerIP;
    }

    public ArrayList<Entry> getLogFile() {
        return logFile;
    }
}
