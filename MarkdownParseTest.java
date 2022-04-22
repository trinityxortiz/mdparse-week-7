import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;

public class MarkdownParseTest {
    
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }


    public String readString(String path) throws IOException {
        Path fileName = Path.of(path);
        return Files.readString(fileName);
    }

    @Test
    public void testFiletest() {
        try {
            assertEquals(MarkdownParse.getLinks(readString("test-file.md")), 
            List.of("https://something.com", "some-thing.html"));
        } catch (IOException e) {
            fail();
        }
        
    }
}
