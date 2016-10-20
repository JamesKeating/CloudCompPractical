/**
 * Created by siavj on 20/10/2016.
 */
public class Mappings {
    private String key;
    private int value;

    public Mappings(String key, int value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
