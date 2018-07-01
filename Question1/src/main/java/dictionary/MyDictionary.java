package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MyDictionary {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String filePath = "Question1/src/main/resources/file.txt";

        WordFactory wf = new WordFactory(filePath);
        //Question 1 - a.
        System.out.print("Question 1 - (a) : ");
        wf.doesFileExist(filePath);
        //Question 1 - b.
        System.out.println("Question 1 - (b) : ");
        wf.generateDictionary();
        wf.writeDictionary(filePath);
        wf.readWordFile(filePath);
    }
}