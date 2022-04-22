//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            if (openBracket == -1) {
                break;
            }
            int closeBracket = markdown.indexOf("]", openBracket);
            if (closeBracket == -1) {
                break;
            }
            int openParen = markdown.indexOf("(", closeBracket);
            if (openParen == -1) {
                break;
            }
            int closeParen = markdown.indexOf(")", openParen);
            if (closeParen == -1) {
                break;
            }
            // if (markdown.indexOf("!", currentIndex) ==  (openBracket - 1)) {
                
            // }
            if (closeBracket == openParen - 1 && closeBracket > openBracket &&
            closeBracket > openBracket + 1 && (openBracket == 0 ||
            markdown.charAt(openBracket - 1) != '!')) {
                toReturn.add(markdown.substring(openParen + 1, closeParen));
                currentIndex = closeParen + 1;
            } else {
                currentIndex = closeBracket + 1;
            }            
        }

        return toReturn;
    }

// javac MarkdownParse.java && java MarkdownParse test-file3.md

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
    }
}
        // System.out.println("HELLO REMEMBER TO REMOVE ME!");

