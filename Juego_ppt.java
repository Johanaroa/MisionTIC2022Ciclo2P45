import java.util.Scanner;

public class Juego_ppt {
    /* Realizar un programa que permita controlar el juego de piedra, papel, tijera
    introduciendo P para piedra, L para papel y T para tijera por cada jugador.
    El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
    de cada ronda preguntar si desea volver a jugar.
    
    1. Mostrar al jugador1 que valor desea ingresar P para piedra, L para papel y T para tijera por cada jugador**
    2. Recibir el valor ingresado por el jugador1**
    3. Mostrar al jugador2 que valor desea ingresar P para piedra, L para papel y T para tijera por cada jugador**
    4. Recibir el valor ingresado por el jugador2**
    5. Si j1 utiliza L y j2 utiliza P, entonces j1 gana
    6. Si j1 utiliza P y j2 utiliza T, entonces j1 gana
    7. Si j1 utiliza T y j2 utiliza L, entonces j1 gana
    8. Si j1 utiliza P y j2 utiliza L, entonces j2 gana
    9. Si j1 utiliza T y j2 utiliza P, entonces j2 gana
    10. Si j1 utiliza L y j2 utiliza T, entonces j2 gana
    11. Si j1 utiliza P y j2 utiliza P, entonces hay empate
    12. Si j1 utiliza T y j2 utiliza T, entonces hay empate
    13. Si j1 utiliza L y j2 utiliza L, entonces hay empate
    14. Preguntar al jugador si desea volver a jugar
    */

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Jugador 1 elige entre "+"*P*"+" para piedra, "+"*L*"+" para papel y "+"*T*"+" para tijera ");
        String jugador1 = entrada.nextLine();
        System.out.println("Jugador 2 elige entre "+"*P*"+" para piedra, "+"*L*"+" para papel y "+"*T*"+" para tijera ");
        String jugador2 = entrada.nextLine();
        System.out.println("Jugador 1 eligio " + jugador1);
        System.out.println("Jugador 2 eligio " + jugador2);
        if (jugador1.equalsIgnoreCase("l") && jugador2.equalsIgnoreCase("p")){
            System.out.println("Jugador 1 gana");
        }else if (jugador1.equalsIgnoreCase("p") && jugador2.equalsIgnoreCase("t")){
            System.out.println("Jugador 1 gana");
        }else if (jugador1.equalsIgnoreCase("t") && jugador2.equalsIgnoreCase("l")){
            System.out.println("Jugador 1 gana");
        }else if (jugador1.equalsIgnoreCase("p") && jugador2.equalsIgnoreCase("l")){
            System.out.println("Jugador 2 gana");
        }else if (jugador1.equalsIgnoreCase("t") && jugador2.equalsIgnoreCase("p")){
            System.out.println("Jugador 2 gana");
        }else if (jugador1.equalsIgnoreCase("l") && jugador2.equalsIgnoreCase("t")){
            System.out.println("Jugador 2 gana");
        }else {
            if (jugador1.equalsIgnoreCase("p") && jugador2.equalsIgnoreCase("p")){
                System.out.println("Los jugadores empatan");
            }else if (jugador1.equalsIgnoreCase("l") && jugador2.equalsIgnoreCase("l")){
                System.out.println("Los jugadores empatan");
            }else if (jugador1.equalsIgnoreCase("t") && jugador2.equalsIgnoreCase("t")){
                System.out.println("Los jugadores empatan");
            }
        }
    }

    //public static String evaluador(String jugador1, String jugador2){
        //String resultado = "";
        
    }


