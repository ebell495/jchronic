import java.io.*;
import com.mdimension.jchronic.*;

public class JChronicFuzz {
    public static void fuzzerInitialize() {

    }

    public static void fuzzerTestOneInput(byte[] data) {
        String inString = new String(data);
        Chronic.parse(inString, new Options());
    }
}
