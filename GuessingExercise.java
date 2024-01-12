/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class GuessingExercise {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String option;
        String str = "Made by Leo de Torres Orellana & David Gutierrez";

        do {
            do {
                System.out.println("Write (1) to have the machine attempt to guess the number, Write (2) to attempt to guess it yourself");
                option = (sc.nextLine());
                switch (option) {
                    case "1":
                        machineGuess(sc);
                        break;
                    case "2":
                        playerGuess(sc);
                        break;
                    default:
                        //Invalid Answer
                        System.out.println("Invalid Answer");
                        break;
                }

            } while (!"1".equals(option) && !"2".equals(option));

            do {
                System.out.println("Do you want to keep playing? (Yes / No)");
                str = (sc.nextLine());
                if (!str.equalsIgnoreCase("Yes") && !str.equalsIgnoreCase("No")) {

                    System.out.println("Invalid Answer");
                }
            } while (!str.equalsIgnoreCase("Yes") && !str.equalsIgnoreCase("No"));

        } while (!str.equalsIgnoreCase("No"));
        System.out.println("Exiting Program");
    }

    public static void playerGuess(Scanner sc) {
        int max = 100;
        int min = 1;
        int chosen = (int) (Math.random() * (max - min + 1) + min);
        int attempts = 1;
        int answer = 0;
        
        do {
            System.out.println("Attempt to guess the number between 1 and 100, both included");
            answer = Integer.parseInt(sc.nextLine());
            if (answer <= 100 && answer >= 1) {

                if (chosen == answer) {
                    System.out.println("Correct");
                    System.out.println("Attempts Required: " + attempts);

                } else if (chosen < answer) {
                    if (answer > chosen && answer < chosen + 5) {
                        System.out.println("Incorrect: Chosen number is fairly close, but lower");
                        attempts += 1;
                    } else if (chosen <= answer - 30) {
                        System.out.println("Incorrect: Chosen number is much lower");
                        attempts += 1;
                    } else {
                        System.out.println("Incorrect: Chosen number is lower");
                        attempts += 1;
                    }

                } else if (chosen > answer) {
                    if (answer < chosen && answer > chosen - 5) {
                        System.out.println("Incorrect: Chosen number is fairly close, but higher");
                        attempts += 1;
                    } else if (chosen >= answer + 30) {
                        System.out.println("Incorrect: Chosen number is much higher");
                        attempts += 1;
                    } else {
                        System.out.println("Incorrect: Chosen number is higher");
                        attempts += 1;
                    }
                }

            } else {
                System.out.println("Invalid Answer (Not within range)");

            }

        } while (chosen != answer);
    }

    public static void machineGuess(Scanner sc) {
        int max = 101;
        int min = 0;
        int attempts = 1;
        String correct;
        do {
            int chosen = (int) (Math.random() * ((max) - (min) + 1) + min);
            if (chosen == max) {
                chosen = chosen - 1;
            } else if (chosen == min) {
                chosen = chosen + 1;
            }
            if (chosen > 100 || chosen < 1 || max == (min + 1) || min == (max - 1) || min == max) {

                System.out.println("Number does not exist");
                break;

            }

            System.out.println("Number: " + chosen);

            do {
                System.out.println("Write 'Higher' if the number is too low. Write 'Lower' if the number is too high. Write 'Perfect' if the result is correct");
                correct = (sc.nextLine());

                if (correct.equalsIgnoreCase("Higher")) {
                    min = chosen;
                    attempts += 1;
                    break;
                } else if (correct.equalsIgnoreCase("Lower")) {
                    max = chosen;
                    attempts += 1;
                    break;
                } else if (correct.equalsIgnoreCase("Perfect")) {
                    System.out.println("Attempts required: " + attempts);
                    break;
                } else {
                    System.out.println("Invalid Answer");
                }
            } while (!correct.equalsIgnoreCase("Perfect"));

        } while (!correct.equalsIgnoreCase("Perfect"));
    }
}

//Tecnicamente, este es un solo archivo Java enviado por una sola persona, por lo que esto es válido. Aquí existe la versión traducida.

//import java.util.Scanner;
//
//
//public class GuessingExercise {
//
//	public static void main(String[] args) {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("""
//                      	 
//                       	*************************************
//                       	*********** JUEGO ADIVINA ***********
//                       	*************************************""");
//    	String respuestaUsuario = "";
//    	while (!respuestaUsuario.equalsIgnoreCase("No")) {
//        	menu(sc);
//        	respuestaUsuario = "";
//        	System.out.print("\n¿Quieres volver a jugar? (Si/No): ");
//        	while (!respuestaUsuario.equalsIgnoreCase("Si") && !respuestaUsuario.equalsIgnoreCase("No")) {
//            	if (!sc.hasNextInt()) {
//                	respuestaUsuario = sc.nextLine();
//                	if (!respuestaUsuario.equalsIgnoreCase("Si") && !respuestaUsuario.equalsIgnoreCase("No")) {
//                    	System.out.print("Ya sabes, responde Si o No: ");
//                	}
//            	} else {
//                	System.out.print("Recuerda introducir un texto!: ");
//                	sc.nextLine();
//            	}
//        	}
//    	}
//    	System.out.println("""
//                      	 
//                       	*************************************
//                       	********** HASTA PRONTO!!! **********
//                       	*************************************
//                       	""");
//	}
//    
//	public static void menu(Scanner sc){
//    	String numJuego = "";
//    	System.out.println("""
//                      	 
//                       	****************************************************************************
//                       	*********** INSTRUCCIONES **************************************************
//                       	****************************************************************************
//                       	- Introduce un 1 si quieres que la máquina adivine el número que tú pienses.
//                       	- Introduce un 2 si quieres ser tú quien adivine el número a la máquina.
//                       	**************************************************************************** x
//                       	****************************************************************************
//                       	""");
//    	System.out.print("¿Qué eliges?: ");
//    	while(!numJuego.equals("1") && !numJuego.equals("2")){
//        	if (sc.hasNextInt()) {
//            	numJuego = sc.nextLine();
//            	if (!numJuego.equals("1") && !numJuego.equals("2")) {
//                	System.out.print("Incorrecto, introduce 1 o 2: ");
//            	}
//        	} else {
//                	System.out.print("Eso no son números...: ");
//                	sc.nextLine();
//            	}
//    	}
//    	if (numJuego.equals("1")) {
//        	juego1(sc);
//    	} else if (numJuego.equals("2")) {
//        	juego2(sc);
//    	}
//	}
//    
//	public static void juego1(Scanner sc) {
//    	System.out.println("""
//                      	 
//                       	*************************************
//                       	************** JUEGO 1 **************
//                       	*************************************""");
//    	System.out.println("""
//                      	 
//                       	***************************************************************************
//                       	*********** INSTRUCCIONES *************************************************
//                       	***************************************************************************
//                       	- Piensa un número del 1 al 100.
//                       	- Responde Mayor/Menor/Correcto.
//                       	- Si el número mostrado está 5 unidades por encima o por debajo puedes dar
//                        	una pista añadiendo "pero cerca".
//                       	- Si el número mostrado está 20 unidades por encima o por debajo puedes dar
//                        	una pista añadiendo "pero lejos".
//                       	***************************************************************************
//                       	****** (Evita abusar de las pistas) ***************************************
//                       	***************************************************************************
//                       	""");
//    	int max = 100, min = 1, intentos = 0, numAleatorio = 1;
//    	String respuestaUsuario = "";
//    	int numAnterior = 0;
//    	while (!respuestaUsuario.equalsIgnoreCase("Correcto")) {
//        	numAleatorio = (int)(Math.random() * (max - min + 1) + min);
//        	System.out.print("¿Es " + numAleatorio + " el número que has pensado?: ");
//        	while (!respuestaUsuario.equalsIgnoreCase("Menor pero lejos") && !respuestaUsuario.equalsIgnoreCase("Menor pero cerca")
//                	&& !respuestaUsuario.equalsIgnoreCase("Mayor pero lejos") && !respuestaUsuario.equalsIgnoreCase("Mayor pero cerca")
//                	&& !respuestaUsuario.equalsIgnoreCase("Correcto") && !respuestaUsuario.equalsIgnoreCase("Mayor")
//                	&& !respuestaUsuario.equalsIgnoreCase("Menor")){
//            	if (!sc.hasNextInt()) {
//                	respuestaUsuario = sc.nextLine();
//                	if (!respuestaUsuario.equalsIgnoreCase("Menor pero lejos") && !respuestaUsuario.equalsIgnoreCase("Menor pero cerca")
//                        	&& !respuestaUsuario.equalsIgnoreCase("Mayor pero lejos") && !respuestaUsuario.equalsIgnoreCase("Mayor pero cerca")
//                        	&& !respuestaUsuario.equalsIgnoreCase("Correcto") && !respuestaUsuario.equalsIgnoreCase("Mayor")
//                        	&& !respuestaUsuario.equalsIgnoreCase("Menor")) {
//                    	System.out.print("Respuesta incorrecta! Escribe Mayor, Menor o Correcto: ");
//                	}
//            	} else {
//                	System.out.print("Recuerda introducir un texto!: ");
//                	sc.nextLine();
//            	}
//        	}
//        	if (respuestaUsuario.equalsIgnoreCase("Mayor")) {
//            	max = numAleatorio - 1;
//            	respuestaUsuario = "";
//        	} else if (respuestaUsuario.equalsIgnoreCase("Menor")) {
//            	min = numAleatorio + 1;
//            	respuestaUsuario = "";
//        	} else if (respuestaUsuario.equalsIgnoreCase("Mayor pero cerca")) {
//            	max = numAleatorio - 1;
//            	if (max >= 6) {
//                	min = max - 3;
//            	}
//            	respuestaUsuario = "";
//        	} else if (respuestaUsuario.equalsIgnoreCase("Mayor pero lejos")) {
//            	max = numAleatorio - 20;
//            	respuestaUsuario = "";
//        	} else if (respuestaUsuario.equalsIgnoreCase("Menor pero cerca")) {
//            	min = numAleatorio + 1;
//            	if (min <= 95) {
//                	max = min + 3;
//            	}
//            	respuestaUsuario = "";
//        	} else if (respuestaUsuario.equalsIgnoreCase("Menor pero lejos")) {
//            	min = numAleatorio + 20;
//            	respuestaUsuario = "";
//        	}
//        	numAnterior = numAleatorio;
//        	intentos++;
//    	}
//    	System.out.println("\nVaya! He tardado " + intentos + " intentos en acertar.");
//	}
//    
//	public static void juego2(Scanner sc) {
//    	System.out.println("""
//                      	 
//                       	*************************************
//                       	************** JUEGO 2 **************
//                       	*************************************""");
//    	System.out.println("""
//                      	 
//                       	*********** INSTRUCCIONES *******************************
//                       	- Pensaré un número del 1 al 100, tendrás que adivinarlo.
//                       	*********************************************************
//                       	""");
//    	int numAleatorio = (int)(Math.random() * 100 + 1), intentos = 0, numUsuario = 0;
//    	while (numUsuario != numAleatorio) {
//        	System.out.print("¿Qué número he pensado?:");
//        	while (!(numUsuario >= 1 && numUsuario <= 100)) {
//            	if (sc.hasNextInt()) {
//                	numUsuario = sc.nextInt();
//                	if (!(numUsuario >= 1 && numUsuario <= 100)) {
//                    	System.out.print("Recuerda que el número está entre el 1 y el 100: ");
//                	}
//            	} else {
//                	System.out.print("Recuerda introducir un número!: ");
//                	sc.next();
//            	}
//        	}
//        	if (numUsuario < numAleatorio) {
//            	System.out.println("Tu número es menor.");
//            	if (numUsuario > numAleatorio - 2) {
//                	System.out.println("Estas muy cerca!");
//            	} else if (numUsuario < numAleatorio - 30) {
//                	System.out.println("Estas muy lejos!");
//            	} else if (numUsuario > numAleatorio - 7) {
//                	System.out.println("Estas cerca!");
//            	} else if (numUsuario < numAleatorio - 20) {
//                	System.out.println("Estas lejos!");
//            	}
//            	numUsuario = 0;
//        	} else if (numUsuario > numAleatorio) {
//            	System.out.println("Tu número es mayor.");
//             	if (numUsuario < numAleatorio + 2) {
//                	System.out.println("Estas muy cerca!");
//            	} else if (numUsuario > numAleatorio + 30) {
//                	System.out.println("Estas muy lejos!");
//            	} else if (numUsuario < numAleatorio + 7) {
//                	System.out.println("Estas cerca!");
//            	} else if (numUsuario > numAleatorio + 20) {
//                	System.out.println("Estas lejos!");
//            	}
//            	numUsuario = 0;
//        	}
//        	intentos++;
//    	}
//    	System.out.println("\nCorrecto!!!\nHas tardado " + intentos + " intentos en acertar.");
//	}
//    
//}
//
