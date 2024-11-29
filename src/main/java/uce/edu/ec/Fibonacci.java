package uce.edu.ec;

public class Fibonacci {


public static void main(String[] args) {
    // Prueba de la serie de Fibonacci
    int n = 10;
    System.out.println("Fibonacci Recursivo de " + n + " es: " + fibonaccirecursivo(n));
    System.out.println("Fibonacci Iterativo de " + n + " es: " + fibonaccirecursivo(n));
}


    // Método recursivo para calcular el n-ésimo número de Fibonacci

    public static int fibonaccirecursivo(int n) {
        // Condiciones base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonaccirecursivo(n - 1) + fibonaccirecursivo(n - 2); // Llamadas recursivas
        }
    }


    // Método iterativo para calcular el n-ésimo número de Fibonacci
    public static int fibonaciiterativo(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }

        int a = 0, b = 1, resultado =0;

        for (int i=2; i<=n; i++){
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
    }

}


