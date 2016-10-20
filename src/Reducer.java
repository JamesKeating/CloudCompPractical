import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by siavj on 20/10/2016.
 */
public class Reducer {

    public HashMap<String, Integer> reduce(ArrayList<Mappings> maps){
        HashMap<String, Integer> r = new HashMap<>();
        for(Mappings m : maps){

            r.putIfAbsent(m.getKey(), 0);
            r.put(m.getKey(), r.get(m.getKey()) +1);
        }
        return r;

    }
}
