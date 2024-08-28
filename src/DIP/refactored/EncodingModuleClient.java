package DIP.refactored;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {

        Reader fileReader=new FileReader("./beforeEncryption.txt");
        Writer fileWriter=new FileWriter("./afterEncryption.txt");
        EncodingScheme base64Encoder=new Base64Encoder();

        URL url = null;
        try {
            url = new URL("http", "google.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Reader dataBaseReader=new DataBaseReader(url);
        Writer dataBaseWriter=new DatabaseWriter();

        Encoder fileEncoder  = new FileEncoder(fileReader,fileWriter,base64Encoder);
        fileEncoder.encode();

        Encoder dbEncoder  = new DataBaseEncoder(dataBaseReader,dataBaseWriter,base64Encoder);
        dbEncoder.encode();

    }
}
