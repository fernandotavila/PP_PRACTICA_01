import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // https://github.com/fernandotavila/PP_PRACTICA_01.git
    static void main(String[] args) {
        List<Integer> numeros = List.of(10, 5, 8, 3, 15, 20, 7, 12, 4, 9);

        System.out.println("=== 9.1 PROGRAMACION ESTRUCTURADA ===");
        // Ejercicio 1: Mostrar todos
        System.out.println("Ejercicio 1: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Ejercicio 2: Mayores que 10
        System.out.println("\nEjercicio 2: ");
        for (int n: numeros) {
            if(n>10) System.out.println(n);
        }

        // Ejercicio 3: Pares
        System.out.println("\nEjercicio 3: ");
        for (int n: numeros) {
            if(n % 2 == 0) System.out.println(n);
        }

        // Ejercicio 4: Impares
        System.out.println("\nEjercicio 4: ");
        for (int n: numeros) {
            if(n % 2 != 0) System.out.println(n);
        }

        // Ejercicio 5: Multiplicar por 2
        System.out.println("\nEjercicio 5: ");
        for (int n: numeros) {
            System.out.println(n*2);
        }

        System.out.println("\n=== 10. LAMBDAS Y STREAMS ===");

        // Ejercicio 6: Mayores o iguales a 8
        List<Integer> eje6 = numeros.stream().filter(n->n>= 8). collect(Collectors.toList());
        System.out.println("\nEjercicio 6: "+eje6);

        // Ejercicio 7: Numeros Pares
        List<Integer> eje7 = numeros.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Ejercicio 7: "+eje7);

        // Ejercicio 8: Ordenar de menor a mayor
        List<Integer> eje8 = numeros.stream().sorted().collect(Collectors.toList());
        System.out.println("Ejercicio 8: "+eje8);

        // Ejercicio 9: Ordenar de mayor a menor
        List<Integer> eje9 = numeros.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Ejercicio 9: "+eje9);

        // Ejercicio 10: Valor maximo
        int eje10 = numeros.stream().max(Integer::compare).orElse(0);
        System.out.println("Ejercicio 10: "+eje10);

        // Ejercicio 11: Valor minimo
        int eje11 = numeros.stream().min(Integer::compare).orElse(0);
        System.out.println("Ejercicio 11: "+eje11);

        // Ejercicio 12: Suma de todos
        int eje12 = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Ejercicio 12: "+eje12);

        // Ejercicio 13: Promedio
        double eje13 = numeros.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Ejercicio 13: "+eje13);

        // Ejercicio 14: Contar cuantos son mayores que 10
        long eje14 = numeros.stream().filter(n->n > 10).count();
        System.out.println("Ejercicio 14: "+eje14);

        // Ejercicio 15: Impares ordenados de menor a mayor
        List<Integer> eje15 = numeros.stream().filter(n->n % 2 !=0).sorted().collect(Collectors.toList());
        System.out.println("Ejercicio 15: "+eje15);
    }

}
