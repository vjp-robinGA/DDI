package ut1.t1.robin.gonzalez.anton;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Robin
 */
public class UT1T1RobinGonzalezAnton {

    // Metodo para mostrar array de letras
    public static String mostrarLetras(String[] letras) {

        String lineaLetras = "";

        for (int i = 0; i < letras.length; i++) {
            lineaLetras += " " + letras[i];
        }

        return lineaLetras;

    }

    // Metodo para mostrar el dibujo
    public static void mostrarHorca(int indice, List<Palabras> palabras, String[] letras) {

        int fallos = 0;
        String letraActual = "";
        boolean completado = false;

        do {

            switch (fallos) {

                case 0:
                    System.out.println("                          " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|"
                            + "\n|"
                            + "\n|                                " + palabras.get(indice).getPalabra()
                            + "\n|"
                            + "\n|                                  Pista: " + palabras.get(indice).getPista()
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    
                    break;

                case 1:
                    System.out.println("                       " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|              .---."
                            + "\n|             ( o o )"
                            + "\n|              *---*             " + palabras.get(indice).getPalabra()
                            + "\n|"
                            + "\n|                                  Pista: " + palabras.get(indice).getPista()
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    break;

                case 2:
                    System.out.println("                       " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|              .---."
                            + "\n|             ( o o )"
                            + "\n|              *---*             " + palabras.get(indice).getPalabra()
                            + "\n|                |"
                            + "\n|                |                 Pista: " + palabras.get(indice).getPista()
                            + "\n|                |"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    break;

                case 3:
                    System.out.println("                       " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|              .---."
                            + "\n|             ( o o )"
                            + "\n|              *---*             " + palabras.get(indice).getPalabra()
                            + "\n|               /|"
                            + "\n|              / |                 Pista: " + palabras.get(indice).getPista()
                            + "\n|                |"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    break;

                case 4:
                    System.out.println("                       " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|              .---."
                            + "\n|             ( o o )"
                            + "\n|              *---*             " + palabras.get(indice).getPalabra()
                            + "\n|               /|\\"
                            + "\n|              / | \\              Pista: " + palabras.get(indice).getPista()
                            + "\n|                |"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    break;

                case 5:
                    System.out.println("                       " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|              .---."
                            + "\n|             ( o o )"
                            + "\n|              *---*             " + palabras.get(indice).getPalabra()
                            + "\n|               /|\\"
                            + "\n|              / | \\              Pista: " + palabras.get(indice).getPista()
                            + "\n|                |"
                            + "\n|               /"
                            + "\n|              /"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    break;

                case 6:
                    System.out.println("                          " + mostrarLetras(letras)
                            + "\n|----------------|"
                            + "\n|                |"
                            + "\n|              .---."
                            + "\n|             ( x x )"
                            + "\n|              *---*             " + palabras.get(indice).getPalabra()
                            + "\n|               /|\\"
                            + "\n|              / | \\              Has Perdido."
                            + "\n|                |"
                            + "\n|               / \\"
                            + "\n|              /   \\"
                            + "\n|"
                            + "\n|"
                            + "\n|"
                            + "\n--------------------------");

                    break;

            }
            
            letraActual = pedirLetra();
            
            System.out.println(comprobarRango(letraActual, letras));

        } while (completado != false || fallos < 6);

    }

    // Metodo para pedir letras
    public static String pedirLetra() {

        Scanner entrada = new Scanner(System.in);

        String letraIntroducida = "";

        System.out.print("Inserte una Letra: ");
        letraIntroducida = entrada.next().toUpperCase();

        return letraIntroducida;

    }
    
    // Metodo para comprobar letras
    public static boolean comprobarRango(String letraIntroducida, String[] letras){
        
        boolean correcto = false;
        
        for(int i = 0; i < letras.length; i++){
            
            if(letraIntroducida.equalsIgnoreCase(letras[i])){
                
                correcto = true;
                
            }
            
        }
        
        return correcto;
        
    }
    
//    // Metodo para ocultar palabra con asteriscos
//    public static String ocultarPalabra(String palabra) {
//
//        String palabraOculta = "";
//
//        for (int i = 0; i < palabra.length(); i++) {
//
//            palabraOculta += " _ ";
//
//        }
//
//        return palabraOculta;
//
//    }

    // Metodo para elegir palabra al azar
    public static int indiceAleatorio(List<Palabras> palabras) {

        int indice;

        indice = (int) (Math.floor(Math.random() * (palabras.size())));

        return indice;

    }

    // Metodo para cargar datos
    public static List<Palabras> cargarDatos() {

        // Lector de Ficheros
        File archivoTexto = null;
        FileReader lector = null;
        BufferedReader buffer = null;

        List<Palabras> arrayPalabras = new ArrayList<>();

        Palabras palabras[] = new Palabras[10];

        try {

            archivoTexto = new File("listaPalabras.txt");
            lector = new FileReader(archivoTexto);
            buffer = new BufferedReader(lector);

            String lineaActual;

            while ((lineaActual = buffer.readLine()) != null) {

                String leido[] = new String[2];
                leido = lineaActual.split(";");

                String palabra = leido[0];
                String pista = leido[1];

                Palabras pal = new Palabras(palabra, pista);

                arrayPalabras.add(pal);

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            try {
                if (null != lector) {
                    lector.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return arrayPalabras;

    }

    public static void main(String[] args) {

        List<Palabras> palabras = cargarDatos();

        String[] letras = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        int indice = indiceAleatorio(palabras);

        mostrarHorca(indice, palabras, letras);

    }

}
