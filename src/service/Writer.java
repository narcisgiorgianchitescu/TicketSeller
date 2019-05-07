package service;


import java.io.*;

public class Writer {
    public void writeContentToFile (String content, String filePath) throws FileNotFoundException {
        BufferedWriter bw = null;
        FileWriter fw = null;

        content += "\n";
        try {

            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(content);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }

    }
}
