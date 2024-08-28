package DIP.refactored;
import java.util.Base64;

public class Base64Encoder implements EncodingScheme {
    @Override
    public String encode(String content) {
        return Base64.getEncoder().encodeToString(content.getBytes());
    }
}

