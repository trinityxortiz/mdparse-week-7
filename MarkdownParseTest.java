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
    public void testFile1atest() {
        try {
            assertEquals(List.of("https://something.com", "some-thing.html"), 
            MarkdownParse.getLinks(readString("test-file1a.md")));
        } catch (IOException e) {
            fail();
        }
        
    }

    @Test
    public void testFile2atest() {
        try {
            assertEquals(List.of("https://github.com/dmontefalcon/markdown-parser", 
            "https://youtube.com"), MarkdownParse.getLinks(readString("test-file2a.md")));
        } catch (IOException e) {
            fail();
        }
        
    }

    @Test
    public void testFile3atest() {
        try {
            assertEquals(List.of("https://youtube.com"), 
            MarkdownParse.getLinks(readString("test-file3a.md")));
        } catch (IOException e) {
            fail();
        }
        
    }

    @Test
    public void testFile4atest() {
        try {
            assertEquals(List.of("https://gmail.com"), 
            MarkdownParse.getLinks(readString("test-file4a.md")));
        } catch (IOException e) {
            fail();
        }
        
    }

    // @Test
    // public void testFile5test() {
    //     try {
    //         assertEquals(MarkdownParse.getLinks(readString("test-file5.md")), 
    //         List.of(""));
    //     } catch (IOException e) {
    //         fail();
    //     }
        
    // }

    
    @Test
    public void testFiletest() {
        try {
            assertEquals(List.of("https://something.com" ,
            "some-thing.html"), 
            MarkdownParse.getLinks(readString("test-file.md")));
        } catch (IOException e) {
            fail();
        }
        
    }

    @Test
    public void testFile2test() {
        try {
            assertEquals(List.of("https://something.com" ,
            "some-page.html"), 
            MarkdownParse.getLinks(readString("test-file2.md")));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testFile3test() {
        try {
            assertEquals(List.of(),
            MarkdownParse.getLinks(readString("test-file3.md")));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testFile4test() {
        try {
            assertEquals(List.of(),
            MarkdownParse.getLinks(readString("test-file4.md")));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testFile5test() {
        try {
            assertEquals(List.of(),
            MarkdownParse.getLinks(readString("test-file5.md")));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testFile6test() {
        try {
            assertEquals(List.of(),
            MarkdownParse.getLinks(readString("test-file6.md")));
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void testFile7test() {
       try {
           assertEquals(List.of(),
                   MarkdownParse.getLinks(readString("test-file7.md")));
       } catch (IOException e) {
           fail();
       }
    }
     
    @Test
    public void testFile8test() {
       try {
           assertEquals(List.of(),
                   MarkdownParse.getLinks(readString("test-file8.md")));
       } catch (IOException e) {
           fail();
       }
    }
    
}


