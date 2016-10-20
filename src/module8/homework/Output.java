package module8.homework;

public class Output {
    public static void main (String[] args) {
        genericstack <String> gs = new genericstack<String>();
        gs.push("Hello");
        System.out.print(gs.pop() + " ");
        genericstack <Integer> gs1 = new genericstack<Integer>();
        gs1.push(36);
        System.out.println(gs1.pop());
    }
}
