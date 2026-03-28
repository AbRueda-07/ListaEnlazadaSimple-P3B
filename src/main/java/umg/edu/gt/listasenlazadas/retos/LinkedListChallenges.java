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
        challenge3Reverse();
        challenge4RemoveDuplicates();
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

        int totalLogins = eventos.countOccurrences("LOGIN");
        System.out.println("Resultado esperado para LOGIN: 3");
        System.out.println("Resultado obtenido: " + totalLogins);
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

    private static void challenge3Reverse() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(6);

        System.out.println("Reto 3 - Invertir lista");
        System.out.println("Antes de reverse(): " + numeros);

        numeros.reverse();

        System.out.println("Despues de reverse(): " + numeros);
        System.out.println("Resultado esperado: [6, 5, 4, 2]");
        System.out.println();
    }

    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(2);
        numeros.addLast(5);
        numeros.addLast(4);
        numeros.addLast(6);

        System.out.println("Reto 4 - Eliminar duplicados");
        System.out.println("Antes de removeDuplicates(): " + numeros);

        numeros.removeDuplicates();

        System.out.println("Despues de removeDuplicates(): " + numeros);
        System.out.println("Resultado esperado: [2, 4, 5, 6]");
        System.out.println();
    }
}