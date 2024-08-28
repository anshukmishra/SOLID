package DIP.refactored;

public class FileEncoder implements Encoder{
    Reader reader;
    Writer writer;
    EncodingScheme encoder;
    FileEncoder(Reader reader,Writer writer,EncodingScheme encoder) {
        this.reader=reader;
        this.writer=writer;
        this.encoder=encoder;
    }
    @Override
    public void encode() {
        String line;
        while ((line = this.reader.read()) != "")
        {
            String res=this.encoder.encode(line);
            this.writer.write(res);
        }
    }
}
