//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);
        ArrayList<perro> listPerro = new ArrayList<>();
        perro.add (new perro ("1","terry","pincher",false));





        int opc;
        do {
            System.out.println("MENU PRINCIPAL ");
            System.out.println("1.QUIERE AGREGAR PERRO");
            System.out.println("2.QUIERE BUSCAR PERRO POR ID ");
            System.out.println("3.QUIERE REGISTRA ADOPCION");
            System.out.println("4.QUIERE VACUNAR AL PERRO ");
            System.out.println("5.QUIERE ESTERILIZAR EL PERRO ");
            System.out.println("6.QUIERE LISTAR PERROS DISPONIBLES ");
            System.out.println("7.QUIERE ELIMINAR PERRO POR ID ");
            System.out.println("8.QUIERE LISTAR TODOS LOS PERROS ");
            System.out.println("9.QUIERE SALIR O TERMINAR ");

            switch (opc){
                case 1:
                perro est1 = new perro();
                    System.out.println("ingrese el nombre del perro ");
                    String nombre = animal.nextLine();

                    System.out.println("ingrese la raza del perro");
                    String raza = animal.nextLine();

                    System.out.println("ingrese la edad en meses ");
                    int edadmeses =  animal.nextInt();

                    System.out.println("ingrese el tamaño (Grande,Mediano,Pequeño");
                    String tamaño = animal.nextLine();

                    System.out.println("esta vacunado el perro ");
                    Boolean vacunado = animal.nextBoolean();

                    System.out.println("esta esterilizado el perro ");
                    boolean esterilizado = animal.nextBoolean();


                    break;

                case 2 :
                    System.out.println("Digite porfavor el ID del perro ");
                    int id = animal.nextInt();
                    return toString();


                    break;
                case 3 :
                    System.out.println("cual es el id del perro ");
                    int id = animal.nextInt();
                    System.out.println("cual es el nombre del adoptante ");
                    String nombre = animal.nextLine();


                    break;

                case 4 :
                    System.out.println(" cual es el ID del perro ");
                    int id = animal.nextInt();

                    perro.vacunar();


                    break;

                case 5 :

                    System.out.println(" cual es el ID del perro ");
                    int id = animal.nextInt();

                    perro.esterilizar();

                    break;
                case 6 :

                    break;

                case 7:
                    System.out.println("cual es el ID que quiere eliminar ");

                    break;

                case 8:

                    break;

                case 9:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("numero invalido");
            }

        } while (opc != 9);


    }
}