package test;

import static utileria.Archivos.*;

public class ManejoArchivos {
        public static void main(String[] args) {
                String nombreArchivo = "direccion_del_archivo";
                
                // Creamos el archivo
                crearArchivo(nombreArchivo);
                // Escribir en el archivo
                escribirArchivo(nombreArchivo);
                // Leer el archivo
                leerArchivo(nombreArchivo);
                // anexar informacion al archivo
                anexarArchivo(nombreArchivo);
                leerArchivo(nombreArchivo);
        }
}
