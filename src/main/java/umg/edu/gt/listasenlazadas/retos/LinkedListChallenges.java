package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Laboratorio de retos para obligar a extender el codigo base de las estructuras.
 *
 * Cada reto depende de un metodo nuevo que debe implementarse directamente
 * en la clase de estructura correspondiente.
 */
public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        challenge2Clear();
        System.out.println();
    }


    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        try {
            int totalLogins = eventos.countOccurrences("LOGIN");
            System.out.println("Resultado esperado para LOGIN: 3");
            System.out.println("Resultado obtenido: " + totalLogins);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }

    private static void challenge2Clear() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(10);
        numeros.addLast(20);
        numeros.addLast(30);

        System.out.println("Reto 2 - Limpiar lista");
        System.out.println("Antes de clear(): " + numeros);

        numeros.clear();

        System.out.println("Despues de clear(): " + numeros);
        System.out.println("Size esperado: 0");
        System.out.println("Size obtenido: " + numeros.size());
        System.out.println();
    }
}
