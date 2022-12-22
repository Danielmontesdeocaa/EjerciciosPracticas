package Ejercicios;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
  public static void main(String[] args) {
    // Creamos el diccionario con algunas palabras y sus traducciones
    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("Hola", "Hello");
    diccionario.put("Adios", "Goodbye");
    diccionario.put("Por favor", "Please");
    diccionario.put("Gracias", "Thankyou");
    diccionario.put("Cansado", "Tired");
    diccionario.put("Libro", "Book");
    diccionario.put("Nuevo", "New");
    diccionario.put("Enfermo", "Sick");
    diccionario.put("Closed", "Cerrado");
    diccionario.put("Abierto", "Open");
    diccionario.put("Pesado", "Heavy");
    diccionario.put("Nombre", "Name");
    diccionario.put("Comida", "Food");
    diccionario.put("Apellido", "Last name");
    diccionario.put("Casa", "House");
    diccionario.put("Vaca", "Cow");
    diccionario.put("Pan", "Bread");
    diccionario.put("Carro", "Car");
    diccionario.put("Cuchara", "Spoon");
    diccionario.put("Trabajo", "Work");

    // Creamos un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Creamos un objeto Random para elegir palabras al azar
    Random random = new Random();

    // Contadores para llevar un registro de las respuestas correctas e incorrectas del usuario
    int correctas = 0;
    int incorrectas = 0;

    // Elegimos 5 palabras al azar del diccionario
    for (int i = 0; i < 5; i++) {
      // Obtenemos una palabra al azar del diccionario
      String palabra = (String) diccionario.keySet().toArray()[random.nextInt(diccionario.size())];

      // Pedimos al usuario que escriba la traducción al inglés de la palabra
      System.out.println("Traducción al inglés de la palabra '" + palabra + "':");
      String respuesta = scanner.nextLine();

      // Comprobamos si la respuesta del usuario es correcta
      if (respuesta.equals(diccionario.get(palabra))) {
        // Si la respuesta es correcta, aumentamos el contador de respuestas correctas
        correctas++;
      } else {
        // Si la respuesta es incorrecta, aumentamos el contador de respuestas incorrectas
        incorrectas++;
      }
    }

    // Mostramos al usuario cuántas respuestas correctas e incorrectas tiene
    System.out.println("Respuestas correctas: " + correctas);
    System.out.println("Respuestas incorrectas: " + incorrectas);
  }
}