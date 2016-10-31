package module11.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static module11.homework.Task1.readFile;

public class Task4 {

    //Task 4
    //Check if file contains particular word. Print 0 if no. Print number n which equals number of times it is contained in the file
    //Write this task with usual try and try with resources (two versions)

    public static void main (String[] args) {

        String fileName = "D:/file.txt";
        String searchWord = "lesson";
        int wordCounter;

        wordCounter = checkWord1(fileName, searchWord);
        System.out.println("Word '" + searchWord + "' found " + wordCounter + " times in the file with method checkWord1().");

        wordCounter = checkWord2(fileName, searchWord);
        System.out.println("Word '" + searchWord + "' found " + wordCounter + " times in the file with method checkWord2().");

        /* System output:
        Source file:
        Lesson: Basic I/O

        This lesson covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The lesson also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the lesson looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.

        Word 'lesson' found 4 times in the file with method checkWord1().
        Source file:
        Lesson: Basic I/O

        This lesson covers the Java platform classes used for basic I/O. It first focuses on I/O Streams, a powerful concept that greatly simplifies I/O operations. The lesson also looks at serialization, which lets a program write whole objects out to streams and read them back again. Then the lesson looks at file I/O and file system operations, including random access files.

        Most of the classes covered in the I/O Streams section are in the java.io package. Most of the classes covered in the File I/O section are in the java.nio.file package.

        Word 'lesson' found 4 times in the file with method checkWord2().
        */
    }

    static int checkWord1 (String fileName, String word) {

        int wordCounter = 0;
        String tempString;
        Scanner scanner = null;
        String replaced = readFile(fileName);
        System.out.println("Source file:\n" + replaced);

        try {
            scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                tempString = scanner.next();
                if (tempString.toUpperCase().contains(word.toUpperCase())){
                    wordCounter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception!");
            return 0;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return wordCounter;
    }

    static int checkWord2 (String fileName, String word) {

        int wordCounter = 0;
        String tempString;
        String replaced = readFile(fileName);
        System.out.println("Source file:\n" + replaced);

        try (Scanner scanner = new Scanner(new File(fileName))){

            while (scanner.hasNext()) {
                tempString = scanner.next();
                if (tempString.toUpperCase().contains(word.toUpperCase())){
                    wordCounter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found exception!");
            return 0;
        }

        return wordCounter;
    }
}

