package softwaredesign.demo.test.system.design;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Eris
 * @Date 2022/12/11 20:05
 */
public class BufferReaderText {
    public static void main(String[] args) {
        String path = "D:/texts/reader.txt";
        String content = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while((content = bufferedReader.readLine()) != null){
                System.out.println(content);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
