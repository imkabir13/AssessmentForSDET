package dictionary;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class WordFactory
{
    Map<String,String> dictionary = new TreeMap<>();
    FileWriter writer;

    //Before creating object clearText() will clear the file.txt file
    //to avoid multi writing in each program execution.
    WordFactory(String file) throws FileNotFoundException
    {
        clearText(file);
    }

    //Question 1 - a.
    protected void doesFileExist(String path) throws FileNotFoundException
    {
        File file = new File(path);

        if (file.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File is not exist");
        }
    }

    //Question 1 - b.
    protected void readWordFile(String path) throws FileNotFoundException, IOException
    {
        File file = new File(path);
        String wordList;

        BufferedReader br = new BufferedReader(new FileReader(file));

        while ((wordList = br.readLine()) != null){
            System.out.println(wordList);
        }
    }

    //Generate a dictionary using Map data structure.
    protected void generateDictionary()
    {
        dictionary.put("Apple","a fruit, a tech firm");
        dictionary.put("Table","an object, contains rows and columns when used in context of computers");
        dictionary.put("Orange","a fruit");
    }

    //Push dictionary words and meanings into the file.txt and write the file dynamically.
    protected void writeDictionary(String filePath)
    {
        try {
            writer = new FileWriter(filePath,true);
            for (Map.Entry dic:dictionary.entrySet()){
                writer.write(dic.getKey().toString()+"\n");
                writer.write("- "+dic.getValue().toString()+"\n");
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try{
                writer.close();
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
    }

    //After populating string into the File.txt, I need to clear all string before the new execution
    //to avoid re-writing into the File.txt file.
    protected void clearText(String fileName) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter(fileName);
        writer.print("");
        writer.close();
    }

    //disabled method
    protected void printDictionary()
    {
        for (Map.Entry dic:dictionary.entrySet()){
            System.out.println(dic.getKey()+"\n- "+dic.getValue());
        }
    }


}
