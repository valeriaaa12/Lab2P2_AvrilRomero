/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_avrilromero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodge
 */
public class Lab2P2_AvrilRomero {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static Scanner leerInt = new Scanner(System.in);
    static ArrayList<Chefs> chef = new ArrayList();
    static ArrayList<Meseros> mesero = new ArrayList();
    static ArrayList<Bartenders> bartender = new ArrayList();
    static ArrayList<Mesas> mesa = new ArrayList();
    static int contMatutino = 1;
    static int contDespertino = 1;
    static int cont = 0;
    static int contM = 0;
    static int contMatutino2 = 1;
    static int contDespertino2 = 1;
    static int contB = 0;
    static int contMatutino3 = 1;
    static int contDespertino3 = 1;
    static int preciomesas = 0;
    static int contMesa = 0;

    public static void main(String[] args) {
        boolean seguir = true;
        while (seguir) {
            System.out.println("-MENU-");
            System.out.println("1.Ingresar sesion");
            System.out.println("2.Salir");
            System.out.println("Ingrese una opcion: ");
            int opcion = leerInt.nextInt();
            switch (opcion) {
                case 1: {
                    //g3r$nt0
                    //gerente
                    boolean valido = true;
                    while (valido) {
                        System.out.println("Ingrese su usuario: ");
                        String usuario = leer.nextLine();
                        System.out.println("Ingrese su contrasena: ");
                        String contra = leer.nextLine();
                        if (usuario.equals("gerente") && contra.equals("g3r$nt0")) {
                            valido = false;
                        }
                    }
                    boolean seguir2 = true;
                    while (seguir2) {

                        System.out.println("");
                        System.out.println("""
                                       -Submenu-
                                       1.Chefs
                                       2.Meseros
                                       3.Bartenders
                                       4.Mesas
                                       5.Regresar al menu principal""");
                        int opcion2 = leerInt.nextInt();
                        switch (opcion2) {
                            case 1: {

                                boolean seguir3 = true;
                                while (seguir3) {
                                    System.out.println("");
                                    System.out.println("""
                                       -Submenu-
                                       1.Crear Chef
                                       2.Modificar Chef
                                       3.Eliminar Chef
                                       4.Listar Chefs
                                       5.Regresar al submenu""");
                                    int opcion3 = leerInt.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            if (cont < 14) {
                                                System.out.println("Ingrese el nombre: ");
                                                String nombre = leer.nextLine();
                                                System.out.println("Ingrese la edad: ");
                                                int edad = leerInt.nextInt();
                                                while (edad <= 0) {
                                                    System.out.println("Edad no valida");
                                                    System.out.println("Ingrese la edad: ");
                                                    edad = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese el turno: ");
                                                String turno = leer.nextLine();
                                                boolean validTurno = true;
                                                while (validTurno) {
                                                    if (turno.equalsIgnoreCase("matutino")) {
                                                        cont++;
                                                        contMatutino++;
                                                        if (contMatutino > 7) {
                                                            System.out.println("No es posible agregar mas chefs");
                                                            System.out.println("Ingrese otro turno: ");
                                                            turno = leer.nextLine();
                                                            if (turno.equalsIgnoreCase("vespertino")) {
                                                                contDespertino++;
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            validTurno = false;
                                                        }
                                                    } else if (turno.equalsIgnoreCase("vespertino")) {
                                                        cont++;
                                                        contDespertino++;
                                                        if (contMatutino > 7) {
                                                            System.out.println("No es posible agregar mas chefs");
                                                            if (turno.equalsIgnoreCase("matutino")) {
                                                                contMatutino++;
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            validTurno = false;
                                                        }
                                                    } else {
                                                        System.out.println("Turno no valido");
                                                        System.out.println("Ingrese otro turno: ");
                                                        turno = leer.nextLine();

                                                    }
                                                }

                                                System.out.println("Ingrese el numero de estrellas michelin: ");
                                                int estrellas = leerInt.nextInt();
                                                while (estrellas < 0) {
                                                    System.out.println("Estrellas no valida");
                                                    System.out.println("Ingrese el numero de estrellas michelin: ");
                                                    estrellas = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese el sueldo: ");
                                                int sueldo = leerInt.nextInt();
                                                while (sueldo < 0) {
                                                    System.out.println("Sueldo no valido");
                                                    System.out.println("Ingrese el sueldo: ");
                                                    sueldo = leerInt.nextInt();
                                                }
                                                Chefs clasechef = new Chefs(nombre, edad, turno, estrellas, sueldo);
                                                chef.add(clasechef);
                                            } else {
                                                System.out.println("Limite de chefs excedido");
                                            }
                                        }
                                        break;
                                        case 2: {
                                            if (cont <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarChef(chef);
                                                System.out.println("Ingrese el numero del chef a modificar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < chef.size()) {
                                                    System.out.println("Ingrese el nombre: ");
                                                    String nombren = leer.nextLine();
                                                    chef.get(num).setNombre(nombren);
                                                    System.out.println("Ingrese la edad: ");
                                                    int edad = leerInt.nextInt();
                                                    while (edad <= 0) {
                                                        System.out.println("Edad no valida");
                                                        System.out.println("Ingrese la edad: ");
                                                        edad = leerInt.nextInt();
                                                    }
                                                    chef.get(num).setEdad(edad);
                                                    System.out.println("Ingrese el turno: ");
                                                    String turno = leer.nextLine();
                                                    if (chef.get(num).getTurno().equalsIgnoreCase("matutino")) {
                                                        contMatutino--;
                                                    } else {
                                                        contDespertino--;
                                                    }
                                                    boolean validTurno = true;
                                                    while (validTurno) {
                                                        if (turno.equalsIgnoreCase("matutino")) {
                                                            cont++;
                                                            contMatutino++;
                                                            if (contMatutino > 7) {
                                                                System.out.println("No es posible agregar mas chefs");
                                                                System.out.println("Ingrese otro turno: ");
                                                                turno = leer.nextLine();
                                                                if (turno.equalsIgnoreCase("vespertino")) {
                                                                    contDespertino++;
                                                                    chef.get(num).setTurno(turno);
                                                                    validTurno = false;
                                                                }
                                                            } else {
                                                                chef.get(num).setTurno(turno);
                                                                validTurno = false;

                                                            }
                                                        } else if (turno.equalsIgnoreCase("vespertino")) {
                                                            cont++;
                                                            contDespertino++;
                                                            if (contDespertino > 7) {
                                                                System.out.println("No es posible agregar mas chefs");
                                                                if (turno.equalsIgnoreCase("matutino")) {
                                                                    contMatutino++;
                                                                    chef.get(num).setTurno(turno);
                                                                    validTurno = false;
                                                                }
                                                            } else {
                                                                chef.get(num).setTurno(turno);
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            System.out.println("Turno no valido");
                                                            System.out.println("Ingrese otro turno: ");
                                                            turno = leer.nextLine();
                                                            chef.get(num).setTurno(turno);
                                                        }
                                                    }
                                                    System.out.println("Ingrese el numero de estrellas michelin: ");
                                                    int estrellas = leerInt.nextInt();
                                                    chef.get(num).setEstrellas(estrellas);
                                                    while (estrellas < 0) {
                                                        System.out.println("Estrellas no valida");
                                                        System.out.println("Ingrese el numero de estrellas michelin: ");
                                                        estrellas = leerInt.nextInt();
                                                        chef.get(num).setEstrellas(estrellas);
                                                    }
                                                    System.out.println("Ingrese el sueldo: ");
                                                    int sueldo = leerInt.nextInt();
                                                    chef.get(num).setSueldo(sueldo);
                                                    while (sueldo < 0) {
                                                        System.out.println("Sueldo no valido");
                                                        System.out.println("Ingrese el sueldo: ");
                                                        sueldo = leerInt.nextInt();
                                                        chef.get(num).setSueldo(sueldo);
                                                    }

                                                } else {
                                                    System.out.println("Chef no existe");
                                                }

                                            }
                                        }
                                        break;
                                        case 3: {
                                            if (cont <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarChef(chef);
                                                System.out.println("Ingrese el numero del chef a eliminar: ");
                                                int num = leerInt.nextInt();
                                                if (num >= 0|| num < chef.size()-1) {
                                                    chef.remove(num);
                                                    cont--;
                                                    if (chef.get(num).getTurno().equalsIgnoreCase("matutino")) {
                                                        contMatutino--;
                                                    } else {
                                                        contDespertino--;
                                                    }
                                                }
                                            }
                                        }
                                        break;

                                        case 4: {
                                            if (cont <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarChef(chef);
                                            }

                                        }
                                        break;
                                        case 5: {
                                            seguir3 = false;
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion Incorrecta");
                                        }
                                        break;
                                    }//fin switch
                                }
                            }
                            break;

                            case 2: {
                                int cont2 = 0;
                                boolean seguir3 = true;
                                while (seguir3) {
                                    System.out.println("");
                                    System.out.println("""
                                       -Submenu-
                                       1.Crear Mesero
                                       2.Modificar Mesero
                                       3.Eliminar Mesero
                                       4.Listar Meseros
                                       5.Regresar al submenu""");
                                    int opcion3 = leerInt.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            cont2++;
                                            if (contM < 8) {
                                                System.out.println("Ingrese el nombre: ");
                                                String nombre = leer.nextLine();
                                                System.out.println("Ingrese la edad: ");
                                                int edad = leerInt.nextInt();
                                                while (edad <= 0) {
                                                    System.out.println("Edad no valida");
                                                    System.out.println("Ingrese la edad: ");
                                                    edad = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese el turno: ");
                                                String turno = leer.nextLine();
                                                boolean validTurno = true;
                                                while (validTurno) {
                                                    if (turno.equalsIgnoreCase("matutino")) {
                                                        contM++;
                                                        contMatutino2++;
                                                        if (contMatutino2 > 4) {
                                                            System.out.println("No es posible agregar mas meseros");
                                                            System.out.println("Ingrese otro turno: ");
                                                            turno = leer.nextLine();
                                                            if (turno.equalsIgnoreCase("vespertino")) {
                                                                contDespertino2++;
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            validTurno = false;
                                                        }
                                                    } else if (turno.equalsIgnoreCase("vespertino")) {
                                                        contM++;
                                                        contDespertino2++;
                                                        if (contDespertino2 > 4) {
                                                            System.out.println("No es posible agregar mas meseros");
                                                            if (turno.equalsIgnoreCase("matutino")) {
                                                                contMatutino2++;
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            validTurno = false;
                                                        }
                                                    } else {
                                                        System.out.println("Turno no valido");
                                                        System.out.println("Ingrese otro turno: ");
                                                        turno = leer.nextLine();

                                                    }
                                                }

                                                System.out.println("Ingrese el sueldo: ");
                                                int sueldo = leerInt.nextInt();
                                                while (sueldo < 0) {
                                                    System.out.println("Sueldo no valido");
                                                    System.out.println("Ingrese el sueldo: ");
                                                    sueldo = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese la propina: ");
                                                int propina = leerInt.nextInt();
                                                while (propina < 0) {
                                                    System.out.println("Propina no valida");
                                                    System.out.println("Ingrese la propina: ");
                                                    propina = leerInt.nextInt();
                                                }
                                                Meseros listamesero = new Meseros(nombre, edad, turno, sueldo, propina);
                                                mesero.add(listamesero);
                                            } else {
                                                System.out.println("Numeros de meseros excedidos");
                                            }
                                        }//fin case 1 crear meseros
                                        break;
                                        case 2: {
                                            if (cont2 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarMeseros(mesero);
                                                System.out.println("Ingrese el numero del mesero a modificar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < mesero.size()) {
                                                    System.out.println("Ingrese el nombre: ");
                                                    String nombren = leer.nextLine();
                                                    mesero.get(num).setNombre(nombren);
                                                    System.out.println("Ingrese la edad: ");
                                                    int edad = leerInt.nextInt();
                                                    while (edad <= 0) {
                                                        System.out.println("Edad no valida");
                                                        System.out.println("Ingrese la edad: ");
                                                        edad = leerInt.nextInt();
                                                    }
                                                    mesero.get(num).setEdad(edad);
                                                    System.out.println("Ingrese el turno: ");
                                                    String turno = leer.nextLine();
                                                    if (mesero.get(num).getTurno().equalsIgnoreCase("matutino")) {
                                                        contMatutino2--;
                                                    } else {
                                                        contDespertino2--;
                                                    }
                                                    boolean validTurno = true;
                                                    while (validTurno) {
                                                        if (turno.equalsIgnoreCase("matutino")) {
                                                            contM++;
                                                            contMatutino2++;
                                                            if (contMatutino2 > 4) {
                                                                System.out.println("No es posible agregar mas meseros");
                                                                System.out.println("Ingrese otro turno: ");
                                                                turno = leer.nextLine();
                                                                if (turno.equalsIgnoreCase("vespertino")) {
                                                                    contDespertino2++;
                                                                    mesero.get(num).setTurno(turno);
                                                                    validTurno = false;
                                                                }
                                                            } else {
                                                                mesero.get(num).setTurno(turno);
                                                                validTurno = false;

                                                            }
                                                        } else if (turno.equalsIgnoreCase("vespertino")) {
                                                            contM++;
                                                            contDespertino2++;
                                                            if (contDespertino2 > 4) {
                                                                System.out.println("No es posible agregar mas meseros");
                                                                if (turno.equalsIgnoreCase("matutino")) {
                                                                    contMatutino2++;
                                                                    mesero.get(num).setTurno(turno);
                                                                    validTurno = false;
                                                                }
                                                            } else {
                                                                mesero.get(num).setTurno(turno);
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            System.out.println("Turno no valido");
                                                            System.out.println("Ingrese otro turno: ");
                                                            turno = leer.nextLine();
                                                            mesero.get(num).setTurno(turno);
                                                        }
                                                    }

                                                    System.out.println("Ingrese el sueldo: ");
                                                    int sueldo = leerInt.nextInt();
                                                    mesero.get(num).setSueldo(sueldo);
                                                    while (sueldo < 0) {
                                                        System.out.println("Sueldo no valido");
                                                        System.out.println("Ingrese el sueldo: ");
                                                        sueldo = leerInt.nextInt();
                                                        mesero.get(num).setSueldo(sueldo);
                                                    }
                                                    System.out.println("Ingrese la propina: ");
                                                    int propina = leerInt.nextInt();
                                                    mesero.get(num).setPropina(propina);
                                                    while (propina < 0) {
                                                        System.out.println("Propina no valida");
                                                        System.out.println("Ingrese la propina: ");
                                                        propina = leerInt.nextInt();
                                                        mesero.get(num).setPropina(propina);
                                                    }
                                                } else {
                                                    System.out.println("El mesero no existe");
                                                }
                                            }
                                        }
                                        break;
                                        case 3: {
                                            if (cont2 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarMeseros(mesero);

                                                System.out.println("Ingrese el numero del mesero a eliminar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < mesero.size()) {
                                                    mesero.remove(num);
                                                    contM--;
                                                    if (mesero.get(num).getTurno().equalsIgnoreCase("matutino")) {
                                                        contMatutino2--;
                                                    } else {
                                                        contDespertino2--;
                                                    }
                                                } else {
                                                    System.out.println("EL mesero no existe");
                                                }
                                            }

                                        }
                                        break;
                                        case 4: {
                                            if (cont2 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarMeseros(mesero);
                                            }

                                        }
                                        break;
                                        case 5: {
                                            seguir3 = false;
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion Incorrecta");
                                        }
                                        break;
                                    }//fin switch
                                }
                            }
                            break;
                            case 3: {
                                int cont3 = 0;
                                boolean seguir3 = true;
                                while (seguir3) {
                                    System.out.println("");
                                    System.out.println("""
                                       -Submenu-
                                       1.Crear Bartender
                                       2.Modificar Bartender
                                       3.Eliminar Bartender
                                       4.Listar Bartenders
                                       5.Regresar al submenu""");
                                    int opcion3 = leerInt.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            cont3++;
                                            if (contB < 4) {
                                                System.out.println("Ingrese el nombre: ");
                                                String nombre = leer.nextLine();
                                                System.out.println("Ingrese la edad: ");
                                                int edad = leerInt.nextInt();
                                                while (edad <= 0) {
                                                    System.out.println("Edad no valida");
                                                    System.out.println("Ingrese la edad: ");
                                                    edad = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese el turno: ");
                                                String turno = leer.nextLine();
                                                boolean validTurno = true;
                                                while (validTurno) {
                                                    if (turno.equalsIgnoreCase("matutino")) {
                                                        contB++;
                                                        contMatutino3++;
                                                        if (contMatutino3 > 2) {
                                                            System.out.println("No es posible agregar mas bartenders");
                                                            System.out.println("Ingrese otro turno: ");
                                                            turno = leer.nextLine();
                                                            if (turno.equalsIgnoreCase("vespertino")) {
                                                                contDespertino3++;
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            validTurno = false;
                                                        }
                                                    } else if (turno.equalsIgnoreCase("vespertino")) {
                                                        contB++;
                                                        contDespertino3++;
                                                        if (contDespertino3 > 2) {
                                                            System.out.println("No es posible agregar mas bartenders");
                                                            if (turno.equalsIgnoreCase("matutino")) {
                                                                contMatutino3++;
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            validTurno = false;
                                                        }
                                                    } else {
                                                        System.out.println("Turno no valido");
                                                        System.out.println("Ingrese otro turno: ");
                                                        turno = leer.nextLine();

                                                    }
                                                }

                                                System.out.println("Ingrese el sueldo: ");
                                                int sueldo = leerInt.nextInt();
                                                while (sueldo < 0) {
                                                    System.out.println("Sueldo no valido");
                                                    System.out.println("Ingrese el sueldo: ");
                                                    sueldo = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese la cantidad de licores disponibles: ");
                                                int licor = leerInt.nextInt();
                                                while (licor < 0) {
                                                    System.out.println("Cantidad no valida ");
                                                    System.out.println("Ingrese la cantidad de licores disponibles: ");
                                                    licor = leerInt.nextInt();
                                                }
                                                Bartenders listabar = new Bartenders(nombre, edad, turno, sueldo, licor);
                                                bartender.add(listabar);
                                            } else {
                                                System.out.println("Ha excedido el limite de bartender");
                                            }
                                        }
                                        break;

                                        case 2: {
                                            if (cont3 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarBartender(bartender);
                                                System.out.println("Ingrese el numero del bartender a modificar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < bartender.size()) {
                                                    System.out.println("Ingrese el nombre: ");
                                                    String nombren = leer.nextLine();
                                                    bartender.get(num).setNombre(nombren);
                                                    System.out.println("Ingrese la edad: ");
                                                    int edad = leerInt.nextInt();
                                                    while (edad <= 0) {
                                                        System.out.println("Edad no valida");
                                                        System.out.println("Ingrese la edad: ");
                                                        edad = leerInt.nextInt();
                                                    }
                                                    bartender.get(num).setEdad(edad);
                                                    System.out.println("Ingrese el turno: ");
                                                    String turno = leer.nextLine();
                                                    if (bartender.get(num).getTurno().equalsIgnoreCase("matutino")) {
                                                        contMatutino3--;
                                                    } else {
                                                        contDespertino3--;
                                                    }
                                                    boolean validTurno = true;
                                                    while (validTurno) {
                                                        if (turno.equalsIgnoreCase("matutino")) {
                                                            contB++;
                                                            contMatutino3++;
                                                            if (contMatutino3 > 2) {
                                                                System.out.println("No es posible agregar mas bartenders");
                                                                System.out.println("Ingrese otro turno: ");
                                                                turno = leer.nextLine();
                                                                if (turno.equalsIgnoreCase("vespertino")) {
                                                                    contDespertino3++;
                                                                    bartender.get(num).setTurno(turno);
                                                                    validTurno = false;
                                                                }
                                                            } else {
                                                                bartender.get(num).setTurno(turno);
                                                                validTurno = false;

                                                            }
                                                        } else if (turno.equalsIgnoreCase("vespertino")) {
                                                            contB++;
                                                            contDespertino3++;
                                                            if (contDespertino3 > 2) {
                                                                System.out.println("No es posible agregar mas bartenders");
                                                                if (turno.equalsIgnoreCase("matutino")) {
                                                                    contMatutino3++;
                                                                    bartender.get(num).setTurno(turno);
                                                                    validTurno = false;
                                                                }
                                                            } else {
                                                                bartender.get(num).setTurno(turno);
                                                                validTurno = false;
                                                            }
                                                        } else {
                                                            System.out.println("Turno no valido");
                                                            System.out.println("Ingrese otro turno: ");
                                                            turno = leer.nextLine();
                                                            bartender.get(num).setTurno(turno);
                                                        }
                                                    }

                                                    System.out.println("Ingrese el sueldo: ");
                                                    int sueldo = leerInt.nextInt();
                                                    bartender.get(num).setSueldo(sueldo);
                                                    while (sueldo < 0) {
                                                        System.out.println("Sueldo no valido");
                                                        System.out.println("Ingrese el sueldo: ");
                                                        sueldo = leerInt.nextInt();
                                                        bartender.get(num).setSueldo(sueldo);
                                                    }
                                                    System.out.println("Ingrese la cantidad de licores disponibles: ");
                                                    int licor = leerInt.nextInt();
                                                    bartender.get(num).setLicor(licor);
                                                    while (licor < 0) {
                                                        System.out.println("Cantidad no valida ");
                                                        System.out.println("Ingrese la cantidad de licores disponibles: ");
                                                        licor = leerInt.nextInt();
                                                        bartender.get(num).setLicor(licor);
                                                    }
                                                } else {
                                                    System.out.println("Bartender no existe");
                                                }
                                            }

                                        }
                                        break;

                                        case 3: {
                                            if (cont3 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarBartender(bartender);
                                                System.out.println("Ingrese el numero del bartender a eliminar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < bartender.size()) {
                                                    bartender.remove(num);
                                                    contB--;
                                                    if (bartender.get(num).getTurno().equalsIgnoreCase("matutino")) {
                                                        contMatutino3--;
                                                    } else {
                                                        contDespertino3--;
                                                    }
                                                } else {
                                                    System.out.println("Ese bartender no existe");
                                                }
                                            }

                                        }
                                        break;
                                        case 4: {
                                            if (cont3 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarBartender(bartender);
                                            }

                                        }
                                        break;
                                        case 5: {
                                            seguir3 = false;
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion Incorrecta");
                                        }
                                        break;
                                    }//fin switch
                                }

                            }
                            break;

                            case 4: {
                                int cont4 = 0;
                                boolean seguir3 = true;
                                while (seguir3) {
                                    System.out.println("");
                                    System.out.println("""
                                       -Submenu-
                                       1.Crear Mesa
                                       2.Modificar Mesa
                                       3.Eliminar Mesa
                                       4.Listar Mesas
                                       5.Regresar al submenu""");
                                    int opcion3 = leerInt.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            cont4++;
                                            if (contMesa < 10) {
                                                System.out.println("Ingrese la cantidad de platos: ");
                                                int platos = leerInt.nextInt();
                                                while (platos < 0) {
                                                    System.out.println("Cantidad no valida ");
                                                    System.out.println("Ingrese la cantidad de platos: ");
                                                    platos = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese la cantidad de utensilios: ");
                                                int utensilios = leerInt.nextInt();
                                                while (utensilios < 0) {
                                                    System.out.println("Cantidad no valida ");
                                                    System.out.println("Ingrese la cantidad de utensilios: ");
                                                    utensilios = leerInt.nextInt();
                                                }
                                                System.out.println("Ingrese el precio total de la mesa: ");
                                                int total = leerInt.nextInt();
                                                while (total < 0) {
                                                    System.out.println("Cantidad no valida ");
                                                    System.out.println("Ingrese el precio total de la mesa: ");
                                                    total = leerInt.nextInt();
                                                }
                                                preciomesas += total;
                                                Mesas listamesa = new Mesas(platos, utensilios, total);
                                                mesa.add(listamesa);
                                                contMesa++;
                                            } else {
                                                System.out.println("Ha excedido el numero de mesas");
                                            }

                                        }
                                        break;
                                        case 2: {
                                            if (cont4 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarMesas(mesa);
                                                System.out.println("Ingrese el numero de la mesa a modificar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < mesa.size()) {
                                                    System.out.println("Ingrese el numero de la mesa a modificar: ");
                                                    System.out.println("Ingrese la cantidad de platos: ");
                                                    int platos = leerInt.nextInt();
                                                    mesa.get(num).setPlatos(platos);
                                                    while (platos < 0) {
                                                        System.out.println("Cantidad no valida ");
                                                        System.out.println("Ingrese la cantidad de platos: ");
                                                        platos = leerInt.nextInt();
                                                        mesa.get(num).setPlatos(platos);
                                                    }
                                                    System.out.println("Ingrese la cantidad de utensilios: ");
                                                    int utensilios = leerInt.nextInt();
                                                    mesa.get(num).setUtensilios(utensilios);
                                                    while (utensilios < 0) {
                                                        System.out.println("Cantidad no valida ");
                                                        System.out.println("Ingrese la cantidad de utensilios: ");
                                                        utensilios = leerInt.nextInt();
                                                        mesa.get(num).setUtensilios(utensilios);
                                                    }
                                                    System.out.println("Ingrese el precio total de la mesa: ");
                                                    int total = leerInt.nextInt();
                                                    mesa.get(num).setTotal(total);
                                                    while (total < 0) {
                                                        System.out.println("Cantidad no valida ");
                                                        System.out.println("Ingrese el precio total de la mesa: ");
                                                        total = leerInt.nextInt();
                                                        mesa.get(num).setTotal(total);
                                                    }
                                                } else {
                                                    System.out.println("Esa mesa no existe");
                                                }
                                            }

                                        }
                                        break;
                                        case 3: {
                                            if (cont4 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarMesas(mesa);
                                                System.out.println("Ingrese el indice de la mesa a eliminar: ");
                                                int num1 = leerInt.nextInt();
                                                int num = num1 - 1;
                                                if (num >= 0 && num < mesa.size()) {
                                                    mesa.remove(num);
                                                    contMesa--;

                                                } else {
                                                    System.out.println("Esa mesa no existe");
                                                }
                                            }

                                        }
                                        break;
                                        case 4: {
                                            if (cont4 <= 0) {
                                                System.out.println("Debe crear primero");
                                            } else {
                                                ListarMesas(mesa);
                                            }

                                        }
                                        break;
                                        case 5: {
                                            seguir3 = false;
                                        }
                                        break;
                                        default: {
                                            System.out.println("Opcion Incorrecta");
                                        }
                                        break;
                                    }//fin switch
                                }

                            }
                            break;
                            case 5: {
                                seguir2 = false;
                            }
                            break;
                            default: {
                                System.out.println("Opcion incorrecta");
                            }
                            break;
                        }
                    }//fin while submenu
                }//fin case 1
                break;

                case 2: {
                    seguir = false;
                }
                break;
                default: {

                }
                break;
            }
        }

    }//fin main

    public static void ListarChef(ArrayList<Chefs> chef) {
        for (int i = 0; i < chef.size(); i++) {
            System.out.println("Chef " + (i + 1));
            System.out.println("Nombre: " + chef.get(i).getNombre());
            System.out.println("Edad: " + chef.get(i).getEdad());
            System.out.println("Turno: " + chef.get(i).getTurno());
            System.out.println("Estrellas: " + chef.get(i).getEstrellas());
            System.out.println("Sueldo: " + chef.get(i).getSueldo());
            System.out.println("");
        }
    }

    public static void ListarMeseros(ArrayList<Meseros> mesero) {
        for (int i = 0; i < mesero.size(); i++) {
            System.out.println("Mesero " + (i + 1));
            System.out.println("Nombre: " + mesero.get(i).getNombre());
            System.out.println("Edad: " + mesero.get(i).getEdad());
            System.out.println("Turno: " + mesero.get(i).getTurno());
            System.out.println("Sueldo: " + mesero.get(i).getSueldo());
            System.out.println("Propina: " + mesero.get(i).getPropina());
            System.out.println("");
        }
    }

    public static void ListarBartender(ArrayList<Bartenders> bartender) {
        for (int i = 0; i < bartender.size(); i++) {
            System.out.println("Bartender " + (i + 1));
            System.out.println("Nombre: " + bartender.get(i).getNombre());
            System.out.println("Edad: " + bartender.get(i).getEdad());
            System.out.println("Turno: " + bartender.get(i).getTurno());
            System.out.println("Sueldo: " + bartender.get(i).getSueldo());
            System.out.println("Numero de licores: " + bartender.get(i).getLicor());
            System.out.println("");
        }
    }

    public static void ListarMesas(ArrayList<Mesas> mesa) {
        for (int i = 0; i < mesa.size(); i++) {
            System.out.println("Mesa " + (i + 1));
            System.out.println("Cantidad de platos: " + mesa.get(i).getPlatos());
            System.out.println("Cantidad de utensilios: " + mesa.get(i).getUtensilios());
            System.out.println("Precio total: " + preciomesas);
        }
    }

}
