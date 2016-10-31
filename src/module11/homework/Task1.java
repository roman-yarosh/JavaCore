package module11.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    //Task 1
    //You should create method which replace words in the File and returns String with replaced values

    public static void main (String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("lesson", "topic");
        map.put("Lesson", "Topic");
        String result;

        result = replacer(map);
        if (!result.equals("")) System.out.println("\nResult string after replacement:\n" + result);
        /* System output:
        Source file:
        Lesson: Basic I/O

        This lesson covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The lesson also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the lesson looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.

        Result string after replacement:
        Topic: Basic I/O

        This topic covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The topic also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the topic looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.
        */
    }

    static String replacer(Map<String, String> map) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        StringBuilder stringBuilder;

        try {
            fileReader = new FileReader("D:/file.txt");
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception!");
            return "";
        }

        try {
            stringBuilder = new StringBuilder();
            String lineFromFile = bufferedReader.readLine();
            if (lineFromFile != null) System.out.println("Source file:");
            while (lineFromFile != null) {
                System.out.println(lineFromFile);
                for (Map.Entry<String, String> entry : map.entrySet()){
                    lineFromFile = lineFromFile.replaceAll(entry.getKey(), entry.getValue());
                }
                stringBuilder.append(lineFromFile);
                stringBuilder.append(System.lineSeparator());
                lineFromFile = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            return "";
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Can't close bufferedReader!");
            }
        }
        return stringBuilder.toString();
    }
}
