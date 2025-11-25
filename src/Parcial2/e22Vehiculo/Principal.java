package Parcial2.e22Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        char opcion;
        Scanner leer = new Scanner(System.in);
        //creamos el objeto vehiuculo
        Vehiculo vehiculo = new Vehiculo();

        ArrayList<Vehiculo> ListaVehiculos = new ArrayList<>();

        //Menu
        do {
            System.out.println("****** MENU CRUD *******");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.println("Eliga una opcion");
            opcion = leer.next().charAt(0);
            switch (opcion) {
                case '1':
                    //Creamos el objeto
                    Vehiculo agregarVehiculo = new Vehiculo();
                    //mostamos datos
                    agregarVehiculo.ingresarDatos();
                    //se guarda en el arrayslits
                    ListaVehiculos.add(agregarVehiculo);
                    break;
                case '2':
                    if (ListaVehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        for (Vehiculo vehiculos : ListaVehiculos) {
                            System.out.println(vehiculos);
                            System.out.println("--------------------");
                        }
                    }
                    break;
                case '3':
                    // ACTUALIZAR VEHÍCULO
                    System.out.print("Ingrese el número de chasis a actualizar: ");
                    leer.nextLine(); // limpiar buffer
                    String chasisAct = leer.nextLine();
                    boolean encontradoAct = false;
                    for (Vehiculo v : ListaVehiculos) {
                        if (v.getNumeroChasis().equals(chasisAct)) {
                            System.out.println("Vehículo encontrado. Ingrese nuevos datos:");
                            v.ingresarDatos(); // reutilizamos el método
                            encontradoAct = true;
                            System.out.println("Vehículo actualizado correctamente.");
                            break;
                        }
                    }
                    if (!encontradoAct) {
                        System.out.println("No existe un vehículo con ese número de chasis.");
                    }
                    break;
                case '4':
                    // ELIMINAR VEHÍCULO
                    System.out.print("Ingrese el número de chasis a eliminar: ");
                    leer.nextLine(); // limpiar buffer
                    String chasisElim = leer.nextLine();

                    boolean eliminado = false;

                    for (int i = 0; i < ListaVehiculos.size(); i++) {
                        if (ListaVehiculos.get(i).getNumeroChasis().equals(chasisElim)) {
                            ListaVehiculos.remove(i);
                            eliminado = true;
                            System.out.println("Vehículo eliminado correctamente.");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("No existe un vehículo con ese número de chasis.");
                    }
                    break;
                case '5':
                    System.out.println("Gracias por usar el programa ");
                    break;
                default:
                    System.err.println(" Seleccione una opcion correcta ");
                    break;
            }
        } while (opcion != '5');
    }
}
