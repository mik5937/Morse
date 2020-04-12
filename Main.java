package TmpPack;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Coder coder = null;
        File Source = null;
        File Out = null;
        Scanner person = new Scanner(System.in);
      //  person.nextInt();
        if(person.nextInt() == 1){
            coder = new En2Morse();
            Source = new File("C:\\Users\\User\\FileMorse\\EnglishInput.txt");
            Out = new File   ("C:\\Users\\User\\FileMorse\\MorzeOutput.txt");
        } else {
            coder = new Morse2En();
            Source = new File("C:\\Users\\User\\FileMorse\\MorzeInput.txt");
            Out = new File("C:\\Users\\User\\FileMorse\\EnglishOutput.txt");
        }
        StringBuilder CodedString = coder.handle(Source);
        FileOutputStream WriteToFile = new FileOutputStream(Out);
        WriteToFile.write(CodedString.toString().getBytes());
    }
}