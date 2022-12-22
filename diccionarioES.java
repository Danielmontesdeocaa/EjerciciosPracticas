package Ejercicios;

	import java.util.HashMap;
	import java.util.Scanner;

	public class diccionarioES {

		public static void main(String[] args) {
			
			// Creamos el diccionario como un objeto HashMap
		    HashMap<String, String> diccionario = new HashMap<>();

		    // Agregamos algunas palabras al diccionario
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
		 // Creamos un escáner para leer la entrada del usuario
		    Scanner usuario = new Scanner(System.in);
		
		    System.out.println("Ingresa una palabra en español: ");
		    String palabra = usuario.nextLine();
		
		    // Revisamos si la palabra está en el diccionario
		    if (diccionario.containsKey(palabra)) {
		      // Si está, mostramos su traducción
		      System.out.println("La traducción es: " + diccionario.get(palabra));
		    } 
		    else {
		      // Si no está, mostramos un mensaje
		      System.out.println("Lo siento, no encontramos una traducción para esa palabra.");
		    }
		  }
		
		}
	
	
	

