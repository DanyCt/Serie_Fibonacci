# FIBONACCI
![image](https://github.com/user-attachments/assets/85f5eb00-a179-4b61-8a2d-be1bbd5431aa)
![image](https://github.com/user-attachments/assets/bbe6e6bb-274b-42d1-b05d-45534e838bed)




# FIBONACCI RECURSIVIDAD 
![image](https://github.com/user-attachments/assets/caafbb2b-0d3c-44fb-9739-7c797c4627d0)
# Explicación:
El método fibonacci(int n) usa recursión para calcular el número de Fibonacci en la posición n.
Si n es 0 o 1, retorna los valores base 0 y 1 respectivamente.
En otros casos, hace dos llamadas recursivas: fibonacci(n - 1) y fibonacci(n - 2), y devuelve la suma de estos resultados.

# Resumen de la ejecución recursiva:
La ejecución de fibonacci(n) se descompone en dos llamadas recursivas: fibonacci(n-1) y fibonacci(n-2).
Cada una de esas llamadas sigue el mismo proceso recursivo hasta que se alcanzan los casos base (cuando n es 0 o 1).
Una vez que se resuelven los casos base, las llamadas recursivas empiezan a regresar y sumar los resultados hasta que obtenemos el valor final de fibonacci(n).

# Conclusión:
La recursividad es una forma elegante de resolver problemas donde el problema se puede dividir en subproblemas más pequeños, como en el caso de la serie de Fibonacci. Sin embargo,
esta solución no es muy eficiente para valores grandes de n debido a la repetición de cálculos (por ejemplo, fibonacci(5) se calcula varias veces). Para números grandes, 
sería más eficiente usar una solución iterativa o una memorización para evitar estos cálculos repetidos.



# FIBONACCI ITERATIVO  / SIN RECURSIVIDAD


![image](https://github.com/user-attachments/assets/3e53f932-e0b3-405c-ad55-7b93612c125c)

# Conclusión
Este código implementa un enfoque iterativo para calcular el n-ésimo número de Fibonacci. Es más eficiente que la solución recursiva porque no tiene problemas de recursión excesiva y 
no recalcula valores que ya han sido calculados en iteraciones anteriores. En este caso, se utilizan solo tres variables (a, b, resultado)
para mantener los valores previos de Fibonacci y calcular el siguiente número en la secuencia.


# Comparación entre las soluciones:

# Recursiva: 
La solución recursiva es más intuitiva y sencilla de entender, pero puede ser ineficiente para valores grandes de n debido a la repetición de cálculos (llamadas repetidas con los mismos valores de n). Esto puede llevar a problemas de rendimiento (como un desbordamiento de pila en algunos lenguajes, aunque no en Java directamente).

# Iterativa:
La solución iterativa es más eficiente en términos de rendimiento porque calcula cada número solo una vez y usa un bucle simple. Es más adecuada para valores grandes de n.

Ambas soluciones funcionan bien para valores pequeños de n, pero para valores grandes, la versión iterativa es más eficiente.
