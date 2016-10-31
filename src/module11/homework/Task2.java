package module11.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static module11.homework.Task1.readFile;
import static module11.homework.Task1.replacer;

public class Task2 {

    //Task 2
    //You should create method which replace words in the File and rewrite File content with new values

    public static void main (String[] args) {

        String fileName = "D:/file.txt";
        Map<String, String> map = new HashMap<>();
        map.put("lesson", "topic");
        map.put("Lesson", "Topic");
        File file;
        String result;

        file = fileContentReplacer(fileName, map);
        if (file != null) System.out.println("\nResult file after replacement:\n" + readFile(file.getPath()));
        /* System output:
        Read from file:
        Lesson: Basic I/O

        This lesson covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The lesson also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the lesson looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.

        Result file after replacement:
        Topic: Basic I/O

        This topic covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The topic also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the topic looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.
        */
    }

    static File fileContentReplacer (String fileName, Map<String, String> map) {
        File file = null;
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        String replaced = replacer(fileName, map);

        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(replaced);
            file = new File(fileName);
        } catch (IOException e) {
            System.err.format("IOException in fileContentReplacer() method: %s%n", e);
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                System.err.format("IOException while closing resources: %s%n", e);
            }
        }

        return file;
    }

}
