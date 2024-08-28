package DIP.refactored;

import java.io.BufferedWriter;

public class FileWriter implements Writer{
    BufferedWriter writer ;
    FileWriter(String OpPath)
    {
        try{
     this.writer= new BufferedWriter(new java.io.FileWriter(OpPath));}
        catch (Exception e)
        {
            ;
        }
    }
    @Override
    public void write(String line) {
        System.out.println("Writer");
        try{
        this.writer.write(line);}
        catch (Exception e){
            System.out.println(e);
        }
    }
}
