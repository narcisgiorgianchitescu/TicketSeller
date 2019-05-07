package service;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public String getFileContent (String filePath) throws FileNotFoundException {
        String content = "";
        try(BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            String line = bf.readLine();
            while (line != null) {
                content += line;
                content += "\n";
                line = bf.readLine();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return content;
    }
}
