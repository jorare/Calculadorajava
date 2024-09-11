package calculadora;

import java.util.Scanner;

public class menu_Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("------------------------------------------");
            System.out.println("-             CALCULADORA JAVA           -");
            System.out.println("-                 JMONDR1                -");
            System.out.println("------------------------------------------");
            System.out.println("Ingrese el primer valor (V1)");
            double valor1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo valor (V2");
            double valor2 = scanner.nextDouble();


            int menu_Calculadora = 0;

            do {
                System.out.println("------------------------------------------");
                System.out.println("*** Seleccione la operación a realizar ***");
                System.out.println("-                                        -");
                System.out.println("- 1. Suma +                              -");
                System.out.println("- 2. Resta -                             -");
                System.out.println("- 3. Multiplicación *                    -");
                System.out.println("- 4. Divisiòn /                          -");
                System.out.println("- 5. Salir                               -");
                System.out.println("------------------------------------------");

                System.out.println("Seleccione una opcion: ");



                switch (menu_Calculadora) {


                    case 1:

                        //Creacion de los objeto con el valor
                        Operaciones llevarSuma = new Operaciones(valor1, valor2);
                        //Llamada al metodo para calcular la suma
                        llevarSuma.calcularSuma();

                        System.out.println("                                   ");
                        System.out.println("                ||                 ");
                        System.out.println("              ||||||               ");
                        System.out.println("                ||                 ");
                        System.out.println("                                   ");
                        System.out.println("Usted seleccionó la opción Sumar");
                        System.out.println("La operación de la suma es " + valor1 + " + " + valor2 + " = " + llevarSuma.getResultadoOperacion());
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("-----------------------------------");
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("                                   ");

                        break;

                    case 2:

                        //Creacion de los objeto con el valor
                        Operaciones llevarResta = new Operaciones(valor1, valor2);
                        //Llamada al metodo para calcular la resta
                        llevarResta.calcularResta();

                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("              ||||||               ");
                        System.out.println("                                   ");
                        System.out.println("Usted seleccionó la opción Restar");
                        System.out.println("La operación de la Resta es " + valor1 + " - " + valor2 + " = " + llevarResta.getResultadoOperacion());
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("-----------------------------------");
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("                                   ");

                        break;

                    case 3:
                        //Creacion de los objeto con el valor
                        Operaciones llevarMultiplicacion = new Operaciones(valor1, valor2);
                        //Llamada al metodo para calcular la multiplicacion
                        llevarMultiplicacion.calcularMultiplicacion();

                        System.out.println("                                  ");
                        System.out.println("             ||   ||              ");
                        System.out.println("              |||||               ");
                        System.out.println("             ||   ||              ");
                        System.out.println("                                  ");
                        System.out.println("Usted seleccionó la opción Multiplicación");
                        System.out.println("La operación de la Multiplicación es " + valor1 + " X " + valor2 + " = " + llevarMultiplicacion.getResultadoOperacion());
                        System.out.println("                                  ");
                        System.out.println("                                  ");
                        System.out.println("----------------------------------");
                        System.out.println("                                  ");
                        System.out.println("                                  ");
                        System.out.println("                                  ");

                        break;

                    case 4:
                        //Creacion de los objeto con el valor
                        Operaciones llevarDivision = new Operaciones(valor1, valor2);
                        //Llamada al metodo para calcular la Divisiòn
                        llevarDivision.calcularDivision();
                        System.out.println("                                   ");
                        System.out.println("                ||                 ");
                        System.out.println("             ||||||||              ");
                        System.out.println("                ||                 ");
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("Usted seleccionó la opción División");
                        System.out.println("La operación de la Divisiòn es " + valor1 + " / " + valor2 + " = " + llevarDivision.getResultadoOperacion());
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("-----------------------------------");
                        System.out.println("                                   ");
                        System.out.println("                                   ");
                        System.out.println("                                   ");

                        break;

                    case 5:
                        if (menu_Calculadora == 5) {
                            continuar = false;
                            System.out.println("                                        ");
                            System.out.println("                   /||||                ");
                            System.out.println("                   (o o)	          	");
                            System.out.println("          ------ooO-(_)-Ooo------	    ");
                            System.out.println("                		            	");
                            System.out.println("    ha oprimido la opción 5 Salir...    ");
                            System.out.println("                		              	");
                            break;
                        }

                        break;

                    default:

                        System.out.println("Opción no válida");
                        menu_Calculadora = scanner.nextInt();
                        scanner.nextLine();
                }

            } while (menu_Calculadora != 5);

            scanner.close();
        }
    }

}
