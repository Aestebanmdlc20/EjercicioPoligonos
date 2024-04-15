
import java.io.File;
public class FUtil {
    public static boolean existe(String filename) throws IllegalArgumentException{
        if(filename.isBlank()){
            throw new IllegalArgumentException("Cadena vacia");
        }
        File file = new File(filename);
        if (file.exists()) {
            return true;
        }
        return false;
    }
}

