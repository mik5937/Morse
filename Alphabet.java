package TmpPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

abstract class Alphabet
{
    static String terminator = " ";
    static Properties E2M = new Properties();
    static Properties M2E = new Properties();
    static {
        FileInputStream in_d = null;
        FileInputStream in_c = null;
        try {
            in_d = new FileInputStream("C:\\Users\\User\\IdeaProjects\\Morse\\out\\production\\Morse\\TmpPack\\Decode_properties.properties");
            in_c = new FileInputStream("C:\\Users\\User\\IdeaProjects\\Morse\\out\\production\\Morse\\TmpPack\\Code_properties.properties");
            E2M.load(in_c);
            M2E.load(in_d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}