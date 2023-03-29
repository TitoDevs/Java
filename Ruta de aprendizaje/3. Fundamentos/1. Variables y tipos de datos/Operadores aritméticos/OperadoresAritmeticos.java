package VariablesYTiposDeDatos;

/**
 * Variables y tipos de datos: Operadores aritméticos
 * @author TitoDev
 */

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        /* Suma (+): se utiliza para sumar dos valores. */
        int resSuma = 2 + 3; // resSuma será igual a 5

        /* Resta (-): se utiliza para restar un valor de otro valor. */
        int resResta = 5 - 2; // resResta será igual a 3

        /* Multiplicación (*): se utiliza para multiplicar dos valores. */
        int resMult = 2 * 3; // resultado será igual a 6

        /* División (/): se utiliza para dividir un valor entre otro valor. Si los valores son enteros,
        el resultado será también entero. Si uno o ambos valores son decimales, el resultado será decimal. */
        int resDiv1 = 10 / 2; // resultado1 será igual a 5
        double resDiv2 = 10.0 / 3.0; // resultado2 será igual a 3.3333333333333335

        /* Módulo (%): se utiliza para obtener el resto de la división de un valor entre otro valor. */
        int resMod = 10 % 3; // resultado será igual a 1

        /* Incremento (++): se utiliza para aumentar el valor de una variable en 1. */
        int valorInc = 5;
        valorInc++; // valor ahora será igual a 6

        /* Decremento (--): se utiliza para disminuir el valor de una variable en 1. */
        int valorDec = 5;
        valorDec--; // valor ahora será igual a 4

        /* Los operadores aritméticos pueden ser combinados con el operador de asignación (=) para realizar cálculos y
        asignar el resultado a una variable. Por ejemplo:*/
        int x = 5;
        int y = 10;

        x += y; // equivalente a x = x + y; x ahora será igual a 15
        y *= 2; // equivalente a y = y * 2; y ahora será igual a 20
    }
}
