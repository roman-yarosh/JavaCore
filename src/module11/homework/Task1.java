package module11.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    //Task 1
    //You should create method which replace words in the File and returns String with replaced values

    public static void main (String[] args) {

        String fileName = "D:/file.txt";
        Map<String, String> map = new HashMap<>();
        map.put("lesson", "topic");
        map.put("Lesson", "Topic");
        String result;

        result = replacer(fileName, map);
        if (!result.equals("")) System.out.println("\nResult string after replacement:\n" + result);
        /* System output:
        Read from file:
        Lesson: Basic I/O

        This lesson covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The lesson also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the lesson looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.

        Result string after replacement:
        Topic: Basic I/O

        This topic covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The topic also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the topic looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.
        */
    }

    static String replacer (String fileName, Map<String, String> map) {
        String resultString;

        resultString = readFile(fileName);
        if (resultString != null) {
            System.out.println("Read from file:\n" + resultString);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                resultString = resultString.replaceAll(entry.getKey(), entry.getValue());
            } catch (NullPointerException e){
                System.err.println("NullPointerException exception in foreach map!");
            }
        }

        return resultString;
    }

    static String readFile (String fileName) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception!");
            return null;
        }

        try {
            stringBuilder = new StringBuilder();
            String lineFromFile = bufferedReader.readLine();
            while (lineFromFile != null) {
                stringBuilder.append(lineFromFile);
                stringBuilder.append(System.lineSeparator());
                lineFromFile = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.format("IOException in readFile() method: %s%n", e);
            return null;
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                System.err.format("IOException while closing resources: %s%n", e);
            }
        }

        return stringBuilder.toString();
    }

}
