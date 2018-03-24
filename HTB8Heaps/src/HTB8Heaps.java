
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *Esta es la clase main donde correrá el programa
 * @author Jose Tejada 17584
 * @author David Soto 17551
 */
public class HTB8Heaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int decision = 0; 
        int decision2 = 0;
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        
        VectorHeap<Paciente> vectorheap = new VectorHeap<>();
        
        System.out.println("Bienvenido Doc\nIngrese el numero de implementacion que desea utilizar \n1.HeapVector\n2.Framework Priority Queue\n3.Salir\n");
        decision = teclado2.nextInt();
        
        while(decision != 3){
            if(decision == 1){
                System.out.println("Ingrese el nombre del archivo .txt de los pacientes a atender (Ej. pacientes.txt): ");
                String file = teclado1.nextLine();
                try {
                //Se lee el archivo de texto
                BufferedReader archivo = new BufferedReader(new FileReader(file));   

                String line;
                while ((line = archivo.readLine()) != null) {
                    String[] temp = line.split(", ");
                    String nombre = temp[0];
                    String descrip = temp[1];
                    String code = temp[2];
                    vectorheap.add(new Paciente(nombre, descrip, code));
                }
                archivo.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Archivo Incorrecto!!");
                }
                //Opciones aqui
                System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                decision2 = teclado3.nextInt();
                while(decision2 != 3){
                    if(decision2 == 1){
                        if(!vectorheap.isEmpty()){
                            System.out.println("El siguiente paciente con mayor prioridad de ser atendida es:");
                            System.out.println(vectorheap.getFirst().toString());
                            System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                            decision2 = teclado3.nextInt();}
                        else{
                           System.out.println("Ya no hay pacientes que atender");
                           System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                           decision2 = teclado3.nextInt();
                        }
                    }else if(decision2 == 2){
                        if(!vectorheap.isEmpty()){
                            System.out.println("Se atendio a:");
                            System.out.println(vectorheap.remove().toString()); 
                            System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                            decision2 = teclado3.nextInt();}
                        else{
                            System.out.println("Ya no hay pacientes que atender");
                            System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                            decision2 = teclado3.nextInt();
                        }
                    }else{
                        System.out.println("La opcion no es valida");
                        System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                        decision2 = teclado3.nextInt();
                    }
                }
                //System.out.println("El orden para atender a los pacientes es:");
                //while (!vectorheap.isEmpty()) {
                //    System.out.println(vectorheap.remove().toString());
                //}
                System.out.println("\n");
                System.out.println("Si desea utilizar otra implementacion ingrese el numero de la opcion correspondiente\n1.HeapVector\n2.Framework Priority Queue\n3.Salir\n");
                decision = teclado2.nextInt();
            }else if(decision == 2){
                System.out.println("Ingrese el nombre del archivo .txt de los pacientes a atender (Ej. pacientes.txt): ");
                String file = teclado1.nextLine();
                try {
                //Se lee el archivo de texto
                BufferedReader archivo = new BufferedReader(new FileReader(file));   

                String line;
                while ((line = archivo.readLine()) != null) {
                    String[] temp = line.split(", ");
                    String nombre = temp[0];
                    String descrip = temp[1];
                    String code = temp[2];
                    vectorheap.add(new Paciente(nombre, descrip, code));
                }
                archivo.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Archivo Incorrecto!!");
                }
                //Opciones aqui
                System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                decision2 = teclado3.nextInt();
                while(decision2 != 3){
                    if(decision2 == 1){
                        if(!vectorheap.isEmpty()){
                            System.out.println("El siguiente paciente con mayor prioridad de ser atendida es:");
                            System.out.println(vectorheap.getFirst().toString());
                            System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                            decision2 = teclado3.nextInt();}
                        else{
                           System.out.println("Ya no hay pacientes que atender");
                           System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                           decision2 = teclado3.nextInt();
                        }
                    }else if(decision2 == 2){
                        if(!vectorheap.isEmpty()){
                            System.out.println("Se atendio a:");
                            System.out.println(vectorheap.remove().toString()); 
                            System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                            decision2 = teclado3.nextInt();}
                        else{
                            System.out.println("Ya no hay pacientes que atender");
                            System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                            decision2 = teclado3.nextInt();
                        }
                    }else{
                        System.out.println("La opcion no es valida");
                        System.out.println("Ingrese el numero de la opcion que desea realizar\n1.Revisar cual es el siguiente paciente\n2.Pedir al siguiente paciente\n3.Salir\n");
                        decision2 = teclado3.nextInt();
                    }
                }
                //System.out.println("El orden para atender a los pacientes es:");
                //while (!vectorheap.isEmpty()) {
                //    System.out.println(vectorheap.remove().toString());
                //}
                System.out.println("\n");
                System.out.println("Si desea utilizar otra implementacion ingrese el numero de la opcion correspondiente\n1.HeapVector\n2.Framework Priority Queue\n3.Salir\n");
                decision = teclado2.nextInt();
            }else{
                System.out.println("La opcion no es valida");
                System.out.println("Ingrese el numero de implementacion que desea utilizar \n1.HeapVector\n2.Framework Priority Queue\n3.Salir\n");
                decision = teclado2.nextInt();
            }
        }
        System.out.println("Hasta Pronto\n");
    }
}

       
    

    


