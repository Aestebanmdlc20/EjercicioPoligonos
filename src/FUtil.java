/**
 * @author Alejandro Esteban
 */

import java.io.File;
public class FUtil {

    /**
     * Este método verifica si un archivo existe en el sistema de archivos.
     *
     * @param filename El nombre del archivo que se va a verificar. No puede ser una cadena vacía.
     * @return true si el archivo existe, false en caso contrario.
     * @throws IllegalArgumentException si el nombre del archivo es una cadena vacía.
     */

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

