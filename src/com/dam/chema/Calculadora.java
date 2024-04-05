package com.dam.chema;

import LibreriaES.EntradaSalida;

/**
 * Clase com.dam.chema.Calculadora la cual va a servir para realizar las operaciones básicas
 */
public class Calculadora {


    public class Operacion {
        public static final int SUMA = 0;
        public static final int RESTA = 1;
        public static final int MULTIPLICACION = 2;
        public static final int DIVISION = 3;
        public static final int RAIZ = 4;

        /**
         * Constructor en el cual mediante un switch vamos a decidir que operación queremos realizar
         * @param operacion este valor va a ayudar a decidir que tipo de operación queremos realizar, ya sea una suma, resta, multiplicación, división y en este caso la raíz de un número
         * @param es1    valor que van a tener los diferentes numeros
         * @param mensaje   mensaje que se va a mostrar por pantalla para que se introduzcan los datos
         * @return devuelve el valor del resultado
         */
        public static Float operar(int operacion, int es1,int es2, String mensaje){
            Float num1 = (float) es1;
            Float num2 = (float) es2;
            Float resultado = null;

            switch (operacion){
                case SUMA :
                    resultado = num1 + num2;
                    break;
                case RESTA:
                    resultado = num1 - num2;
                    break;
                case MULTIPLICACION:
                    resultado = num1 * num2;
                    break;
                case DIVISION:
                    resultado = num1 + num2;
                    break;
                case RAIZ:
                    resultado = (float) Math.pow(num1,1/num2);
                    break;
                default:
                    break;
            }
            return resultado;
        }
    }
}
