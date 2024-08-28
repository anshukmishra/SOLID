package DIP.refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class DataBaseReader implements Reader{

    InputStreamReader reader;
    DataBaseReader(URL url)
    {
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        this.reader=reader;
    }
    @Override
    public String read() {
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = this.reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputString = inputString1.toString();
        return inputString;
    }
}
