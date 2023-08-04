/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package top10canciones;
import java.util.Arrays;
import java.util.Scanner;

public class Top10Canciones {

private static final int MAX_CANCIONES = 10;

    public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);

    
    Cancion[] canciones = new Cancion[MAX_CANCIONES];

    
    for (int i = 0; i < MAX_CANCIONES; i++) {
      System.out.println("Ingrese el titulo de la cancion " + (i + 1) + ":");
      String titulo = scanner.nextLine();
      System.out.println("Ingrese el autor de la cancion " + (i + 1) + ":");
      String artista = scanner.nextLine();
      System.out.println("Ingrese el ano de la cancion " + (i + 1) + ":");
      int año = scanner.nextInt();
      System.out.println("Ingrese la duracion de la cancion " + (i + 1) + ":");
      int duracion = scanner.nextInt();

      canciones[i] = new Cancion(titulo, artista, año, duracion);
    }

    Arrays.sort(canciones, (cancion1, cancion2) -> cancion1.getDuracion() - cancion2.getDuracion());

   
    for (Cancion cancion : canciones) {
      System.out.println(cancion);
    }
  }
}
    
