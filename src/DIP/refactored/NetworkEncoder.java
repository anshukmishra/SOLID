package DIP.refactored;

public class NetworkEncoder implements Encoder{
    Reader reader;
    Writer writer;
    EncodingScheme encoder;
    NetworkEncoder(Reader reader,Writer writer,EncodingScheme encoder){
        this.reader=reader;
        this.writer=writer;
        this.encoder=encoder;
    }
    @Override
    public void encode() {
        String line=this.reader.read();
        String res=this.encoder.encode(line);
        this.writer.write(res);
    }
}
