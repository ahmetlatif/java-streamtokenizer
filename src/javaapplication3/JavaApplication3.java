package javaapplication3;
 
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
 
/**
 * 
 * @author anirudh
 *
 */
public class JavaApplication3 {
 
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("Nesnel Programlama Dersi");
        StreamTokenizer tokenizer = new StreamTokenizer(reader);
        while(tokenizer.nextToken()!=StreamTokenizer.TT_EOF){
            System.out.println(tokenizer.sval);
        }
         
    }
}