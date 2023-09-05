package task2;

import java.io.*;


public class FileManager {

    public FileManager() {
    }

    public void reader(String fileName) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = fin.readLine())!=null){
            System.out.printf(line + "%n");
        }
        fin.close();
    }
}

