package DIP.refactored;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements Reader {
    BufferedReader reader;
    int c=0;
    List<String> lines=new ArrayList<String>();
    FileReader(String IpPath)
    {
        try {
        this.reader= new BufferedReader(new java.io.FileReader(IpPath));
        String aLine;
        while ((aLine = this.reader.readLine()) != null)
        {
            lines.add(aLine);
        }}
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String read() {
        try{
            if(this.c>=this.lines.size())
                return "";
        String ans=this.lines.get(this.c);
        this.c++;
        return ans;}
        catch (Exception e)
        {
            System.out.println(e);
        }
        return "";
    }
}
