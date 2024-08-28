package DIP.refactored;

import java.util.Hashtable;
import java.util.Map;

public class MyDatabase {
    private static Map<Integer, String> data = new Hashtable<Integer, String>();
    private static int count = 0;

    public int write(String inputString) {
        data.put(++count, inputString);
        return count;
    }
}
