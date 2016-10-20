import java.util.ArrayList;

public class Map {

    public ArrayList<Mappings> map( LogFile subsetOfLog){
        ArrayList<Mappings> mapperOutput = new ArrayList<>();
        for (Entry ent: subsetOfLog.getLogFile()) {
                mapperOutput.add(new Mappings(ent.getEntIP(), 1));
        }
        return mapperOutput;
    }


}
