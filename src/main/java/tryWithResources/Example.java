package tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example  {

    //try-finally - No longer the best way to close resources
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    static String firstLineOfFile2(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

}
