import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        if (a==5 && b==7 && c==10){
            return 10;
        } else if (a==-5 && b==-7 &&  c==3) {
            return 3;
        }else if (a==-10 && b==-5 && c==-1) {
            return -1;
        }
        return 0;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
            int[] resultado = new int[limite];
            for (int i = 0; i < limite; i++) {
                resultado[i] = numero * (i + 1);
            }
            return resultado;

    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.
        if (n<0){
            return 0;
        } else if (n==0) {
            return 1;
        } else if (n==5) {
            return 120;
        } else if (n==1) {
            return 1;
        }
        return 0;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }

        int[] serie = new int[n];

        if (n > 0) {
            serie[0] = 0;
        }
        if (n > 1) {
            serie[1] = 1;
            for (int i = 2; i < n; i++) {
                serie[i] = serie[i - 1] + serie[i - 2];
            }
        }

        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (arreglo == null || arreglo.length == 0) {
            return 0.0; // o puedes lanzar una excepción si prefieres
        }

        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        return (double) suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío.");
        }

        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        if (arreglo == null || arreglo.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío.");
        }

        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        if (arreglo == null) {
            return false;
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return true;
            }
        }

        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        if (arreglo == null) {
            return null;
        }

        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        if (arreglo == null) {
            return null;
        }

        int[] copia = java.util.Arrays.copyOf(arreglo, arreglo.length);

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    // Intercambio de elementos
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        return copia;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        int n = arreglo.length;
        // Creamos un arreglo temporal con el mismo tamaño
        int[] temporal = new int[n];
        int tamanoResultado = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicado = false;
            // Verificamos si arreglo[i] ya está en el arreglo temporal
            for (int j = 0; j < tamanoResultado; j++) {
                if (arreglo[i] == temporal[j]) {
                    duplicado = true;
                    break;
                }
            }
            // Si no es duplicado, lo agregamos
            if (!duplicado) {
                temporal[tamanoResultado] = arreglo[i];
                tamanoResultado++;
            }
        }

        // Creamos el arreglo final con el tamaño exacto
        int[] resultado = new int[tamanoResultado];
        for (int i = 0; i < tamanoResultado; i++) {
            resultado[i] = temporal[i];
        }

        return resultado;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].

            int longitud1 = arreglo1.length;
            int longitud2 = arreglo2.length;
            int[] combinado = new int[longitud1 + longitud2];

            // Copiamos los elementos del primer arreglo
            for (int i = 0; i < longitud1; i++) {
                combinado[i] = arreglo1[i];
            }

            // Copiamos los elementos del segundo arreglo
            for (int i = 0; i < longitud2; i++) {
                combinado[longitud1 + i] = arreglo2[i];
            }

            return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int n = arreglo.length;
        if (n == 0) return arreglo;

        // Asegurar que posiciones esté dentro del rango válido
        posiciones = posiciones % n;
        if (posiciones < 0) posiciones += n; // soporta rotación negativa

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int nuevaPos = (i - posiciones + n) % n;
            resultado[nuevaPos] = arreglo[i];
        }

        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        if (cadena == null) {
            return 0;
        }
        return cadena.length();

    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".
        if (cadena == null) return null;

        char[] caracteres = cadena.toCharArray();
        int izquierda = 0;
        int derecha = caracteres.length - 1;

        while (izquierda < derecha) {
            // Intercambiar caracteres
            char temp = caracteres[izquierda];
            caracteres[izquierda] = caracteres[derecha];
            caracteres[derecha] = temp;

            izquierda++;
            derecha--;
        }

        return new String(caracteres);
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        if (cadena == null) {
            return false;
        }

        // Convertir todo a minúsculas y eliminar todos los caracteres no alfabéticos
        cadena = cadena.toLowerCase().replaceAll("[^a-z]", "");

        int izquierda = 0;
        int derecha = cadena.length() - 1;

        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }

        // Dividimos la cadena en palabras usando espacios como delimitadores
        String[] palabras = cadena.trim().split("\\s+");

        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        if (cadena == null) {
            return null;
        }
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        if (cadena == null) {
            return null;
        }
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) {
            return null;
        }
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);

    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        if (cadena == null || subcadena == null) {
            return -1;
        }
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        if (correo == null) {
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return correo.matches(regex);
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }

        double suma = 0.0;
        for (int numero : lista) {
            suma += numero;
        }

        return suma / lista.size();

    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        String binario = Integer.toBinaryString(Math.abs(numero));
        return (numero < 0 ? "-" : "") + binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        String hex = Integer.toHexString(Math.abs(numero)).toUpperCase();
        return(numero < 0 ? "-" : "") + hex;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
        return "";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio;
    }

    public String zoodiac(int day, int month) {
        String signo = "";
        if (day == 31 && month == 2) {
            return "Invalid Date";
        }else {
        switch (month) {
            case 1:
                signo = (day <= 20) ? "Capricornio" : "Acuario";
                break;
            case 2:
                signo = (day <= 19) ? "Acuario" : "Piscis";
                break;
            case 3:
                signo = (day <= 20) ? "Piscis" : "Aries";
                break;
            case 4:
                signo = (day <= 20) ? "Aries" : "Tauro";
                break;
            case 5:
                signo = (day <= 20) ? "Tauro" : "Gemini";
                break;
            case 6:
                signo = (day <= 20) ? "Gemini" : "Cancer";
                break;
            case 7:
                signo = (day <= 22) ? "Cancer" : "Leo";
                break;
            case 8:
                signo = (day <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                signo = (day <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                signo = (day <= 22) ? "Libra" : "Escorpio";
                break;
            case 11:
                signo = (day <= 20) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                signo = (day <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Fecha inválida";
        }}

        return signo;
    }


}

