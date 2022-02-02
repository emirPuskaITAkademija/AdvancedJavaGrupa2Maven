package one.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class Reader implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Ispisujem neki tekst");
    }
}
