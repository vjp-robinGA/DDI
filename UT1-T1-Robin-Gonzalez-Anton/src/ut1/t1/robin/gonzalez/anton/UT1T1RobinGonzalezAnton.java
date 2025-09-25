package ut1.t1.robin.gonzalez.anton;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Robin
 */
public class UT1T1RobinGonzalezAnton {

    public static char pedirLetra(Scanner entrada, char[] letras) {
        while (true) {
            System.out.print("Introduzca una letra: ");
            String letraIntroducida = entrada.next().toUpperCase();

            char letra = letraIntroducida.charAt(0);
            int pos = letra - 'A';

            if (pos < 0 || pos >= 26) {

                System.out.println("Introduzca una letra de la A a la Z");

            }

            letras[pos] = '/';
            
            System.out.println("");
            
            return letra;
        }
    }

    public static List<Palabras> cargarDatos(){

        List<Palabras> palabras = new ArrayList<>();

        File archivo = new File("listaPalabras.txt");

        try (BufferedReader buffer = new BufferedReader(new FileReader(archivo))){

            String linea;

            while ((linea = buffer.readLine()) != null){

                String[] leido = linea.split(";");
                String palabra = leido[0].toUpperCase();
                String pista = leido[1];
                Palabras pal = new Palabras(palabra, pista);
                palabras.add(pal);

            }

        } catch (IOException e1){
            e1.printStackTrace();
        }

        return palabras;

    }

    //Método para procesar la letra introducida y actualizar tanto el progreso como los fallos
    public static boolean comprobarLetra(char letra, Palabras palabraAleatoria, StringBuilder progreso){

        boolean acertado = false;
        String palabra = palabraAleatoria.getPalabra();

        for (int i = 0; i < palabra.length(); i++){

            if (palabra.charAt(i) == letra) {

                progreso.setCharAt(i, letra);
                acertado = true;

            }

        }
        return acertado;
    }

    public static void victoria(int fallos, Palabras palabraAleatoria, String abecedarioLista, String progreso){

        dibujarAhorcado(fallos, palabraAleatoria, abecedarioLista, progreso);

        System.out.println("\n[[[Has Ganado]]]\nLa palabra es: " + palabraAleatoria.getPalabra());

    }

    public static void derrota(int fallos, Palabras palabraAleatoria, String abecedarioLista, String progreso){

        dibujarAhorcado(fallos, palabraAleatoria, abecedarioLista, progreso);

        System.out.println("\n[[[Has Muerto]]]\nLa palabra es: " + palabraAleatoria.getPalabra());

    }

    public static void dibujarAhorcado(int fallos, Palabras pal, String letrasLista, String palabraOculta){

        switch(fallos){

            case 0:
                System.out.println("                          " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|"
                        + "\n|"
                        + "\n|                                " + palabraOculta
                        + "\n|"
                        + "\n|                                Pista: " + pal.getPista()
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            case 1:
                System.out.println("                       " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|              .---."
                        + "\n|             ( o o )"
                        + "\n|              *---*             " + palabraOculta
                        + "\n|"
                        + "\n|                                Pista: " + pal.getPista()
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            case 2:
                System.out.println("                       " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|              .---."
                        + "\n|             ( o o )"
                        + "\n|              *---*             " + palabraOculta
                        + "\n|                |"
                        + "\n|                |               Pista: " + pal.getPista()
                        + "\n|                |"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            case 3:
                System.out.println("                       " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|              .---."
                        + "\n|             ( o o )"
                        + "\n|              *---*             " + palabraOculta
                        + "\n|               /|"
                        + "\n|              / |               Pista: " + pal.getPista()
                        + "\n|                |"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            case 4:
                System.out.println("                       " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|              .---."
                        + "\n|             ( o o )"
                        + "\n|              *---*             " + palabraOculta
                        + "\n|               /|\\"
                        + "\n|              / | \\            Pista: " + pal.getPista()
                        + "\n|                |"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            case 5:
                System.out.println("                       " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|              .---."
                        + "\n|             ( o o )"
                        + "\n|              *---*             " + palabraOculta
                        + "\n|               /|\\"
                        + "\n|              / | \\            Pista: " + pal.getPista()
                        + "\n|                |"
                        + "\n|               /"
                        + "\n|              /"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            case 6:
                System.out.println("                          " + letrasLista
                        + "\n|----------------|"
                        + "\n|                |"
                        + "\n|              .---."
                        + "\n|             ( x x )"
                        + "\n|              *---*             " + palabraOculta
                        + "\n|               /|\\"
                        + "\n|              / | \\"
                        + "\n|                |"
                        + "\n|               / \\"
                        + "\n|              /   \\"
                        + "\n|"
                        + "\n|"
                        + "\n|"
                        + "\n--------------------------");

                break;

            default:
                System.out.println("Ha ocurrido un error inesperado.");
                ;
                break;
        }
    }

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
        List<Palabras> listaPalabras = cargarDatos();

        if (!listaPalabras.isEmpty()){

            int indice = (int)(Math.random() * listaPalabras.size());
            int fallos = 0;
            boolean fin = false;

            char[] letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

            Palabras palabraAleatoria = listaPalabras.get(indice);
            StringBuilder ocultarPalabra = new StringBuilder("-".repeat(palabraAleatoria.getPalabra().length()));

            while (!fin){

                String listaLetras = "";
                for (int i = 0; i < letras.length; i++){

                    listaLetras += letras[i] + " ";

                }

                dibujarAhorcado(fallos, palabraAleatoria, listaLetras, ocultarPalabra.toString());
                char letra = pedirLetra(entrada, letras);

                boolean letraCorrecta = comprobarLetra(letra, palabraAleatoria, ocultarPalabra);

                if (!letraCorrecta){
                    
                    fallos++;
                    
                }

                if (!ocultarPalabra.toString().contains("-")){
                    
                    victoria(fallos, palabraAleatoria, listaLetras, ocultarPalabra.toString());
                    
                    fin = true;
                    
                }else if (fallos == 6){
                    
                    derrota(fallos, palabraAleatoria, listaLetras, ocultarPalabra.toString());
                    
                    fin = true;
                    
                }

            }

        }else{
            System.out.println("No se han encontrado palabras en el archivo");
        }

    }

}