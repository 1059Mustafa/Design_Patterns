//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        this is the data we want to write into the word processor.
        Total=58 characters
        t=7 times
        h=3 times
        a=3 times and so on...
        */

        ILetter obj1=LetterFactory.createLetter('t');
        obj1.display(0,0);

        ILetter obj2=LetterFactory.createLetter('t');
        obj2.display(0,6);
    }
}