
package utileria;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
        public static void crearArchivo(String nombreArchivo){
                File archivo = new File(nombreArchivo);
                try {
                        PrintWriter salida = new PrintWriter(archivo);
                        salida.close();
                        System.out.println("El archivo se ha creado correctamente");
                } catch (FileNotFoundException ex) {
                        ex.printStackTrace(System.out);
                }
        }
        
        public static void escribirArchivo(String nombreArchivo){
                File archivo = null;
                 PrintWriter salida = null;
                try {
                        archivo = new File(nombreArchivo);
                        salida = new PrintWriter(archivo);
                        String contenido = "Contenido a escribir en el archivo";
                        salida.println(contenido);
                        salida.println();
                        salida.println("Fin de escritura");
                        System.out.println("Se ha escrito correctamente al archivo");
                } catch (FileNotFoundException ex) {
                        ex.printStackTrace(System.out);
                }finally{
                        try{                    
                                 if( salida != null){   
                                        System.out.println("Cerrando archivo");
                                        salida.close();     
                                }                  
                        }catch (IOException ex){ 
                                ex.printStackTrace(System.out);
                        }
                }
        }
        
        public static void leerArchivo(String nombreArchivo){
                File archivo = null;
                BufferedReader entrada = null;
                
                try {
                        archivo = new File(nombreArchivo);
                        // Leer lineas completas
                        entrada = new BufferedReader(new FileReader(archivo));
                        String lectura = entrada.readLine();
                        
                        // Leer todo el archivo
                        while(lectura != null){
                                System.out.println(lectura);
                                lectura = entrada.readLine();
                        }
                     
                } catch (FileNotFoundException ex) {
                        ex.printStackTrace(System.out);
                } catch (IOException ex) {
                        ex.printStackTrace(System.out);
                }finally{
                        try{                    
                                 if( entrada != null){   
                                        System.out.println("Cerrando archivo");
                                        entrada.close();     
                                }                  
                        }catch (IOException ex){ 
                                ex.printStackTrace(System.out);
                        }
                }
                
        }
        
        public static void anexarArchivo(String nombreArchivo){
                File archivo = null;
                PrintWriter salida = null;
                try {
                        archivo = new File(nombreArchivo);
                        // Anexar datos al archivo
                        salida = new PrintWriter(new FileWriter(archivo,true));
                        String contenido = "Anexando informacion al archivo";
                        salida.println(contenido);
                        salida.println();
                        salida.println("Fin de anexar");
                        System.out.println("Se ha anexado la información al archivo");
                        
                } catch (FileNotFoundException ex) {
                        ex.printStackTrace(System.out);
                } catch (IOException ex) {
                        ex.printStackTrace(System.out);
                }finally{
                        try{                    
                                 if( salida != null){   
                                        System.out.println("Cerrando archivo");
                                        salida.close();     
                                }                  
                        }catch (IOException ex){ 
                                ex.printStackTrace(System.out);
                        }
                }
        }
}
