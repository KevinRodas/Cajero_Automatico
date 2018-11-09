/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author krodas
 */
public class Cajero_automatico {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        Login frame1= new Login();
        frame1.setVisible(true);
        
        int q = 0;
        Scanner teclado=new Scanner(System.in);
        
       DirectorBuilder director = new DirectorBuilder();
       Caja caja = new Caja() ;
       
       frame1.User();
       
       int op = 0;
       boolean salir=false;
           System.out.println("****************");
           System.out.println("*  Bienvenido  *");
           
       do{
           System.out.println("");
           System.out.println("****************");
           System.out.println("*     MENU     *");
           System.out.println("* 1-Abonar     *");
           System.out.println("* 2-Retiro     *");
           System.out.println("* 3-Consulta   *");
           System.out.println("* 4-Salir      *");
           System.out.println("****************");
           System.out.println("ingrese  una opcion");
           op=teclado.nextInt();
           caja.setSaldo(frame1.Saldo());
           switch(op){
               case 1:  
                   director.setCajaBuilder(new AbonoBuilder());
                   director.ConstructCaja(caja);
                   caja = director.getCaja();
                   System.out.println(caja.getOpe());
                   
                    Scanner entrada = null;
                    String linea;
                    int numeroDeLinea = 1;
                    boolean contiene = false;
                    Scanner sc = new Scanner(System.in);
                    
        
                    String texto = frame1.User();

                    try {
                        String ruta = "usuarios.txt";
                        File f = new File("usuarios.txt");
                        entrada = new Scanner(f);
                        
                        while (entrada.hasNext()) { 
                        linea = entrada.nextLine();  
                        if (linea.contains(texto)) 
                        {   

                            BufferedReader bfrd;
                            BufferedWriter bfwr;
                            numeroDeLinea++;

                            double saldof = caja.getOpe();
                            String escritura = Double.toString(saldof);

                            File archivotxt = new File("usuarios.txt");
                            if(archivotxt.exists()) {
                                String lineas;
                                String anterior;

                                bfrd = new BufferedReader(new FileReader(archivotxt));
                                lineas = bfrd.readLine();
                                if(lineas.contains(texto)){
                                anterior = texto+"\r\n"+escritura+"\r\n";
                                }
                                else{
                                anterior = lineas+"\r\n";
                                }
                                while((lineas = bfrd.readLine())!=null) {

                                    if(lineas.contains(texto)){
                                    anterior += texto+"\r\n"+escritura+"\r\n";
                                    }
                                    else{
                                    anterior += lineas +"\r\n";
                                    }
                                }
                                bfrd.close();
                                bfwr = new BufferedWriter(new FileWriter(archivotxt));
                                bfwr.write(anterior);
                                bfwr.close();
                                }
                                else{
                                System.out.println("el archivo debe existir almenos..");
                                }

                            contiene = true;

                        }
                            numeroDeLinea++; 
                        }

                    } catch (FileNotFoundException e) {

                    } catch (NullPointerException e) {

                    } catch (Exception e) {
                    System.out.println(e.toString());
                    } finally {      
                        if (entrada != null) {
                            entrada.close();
                        }
                    }
        
                   break;
               case 2:
                   director.setCajaBuilder(new RetiroBuilder());
                   director.ConstructCaja(caja);
                   caja =director.getCaja();
                   System.out.println(caja.getOpe());
                   
                   Scanner entrada2 = null;
                   String linea2;
                   int numeroDeLinea2 = 1;
                   boolean contiene2 = false;
                   Scanner sc2 = new Scanner(System.in);

                    String texto2 = frame1.User();

                    try {
                        String ruta2 = "usuarios.txt";
                        File f2 = new File("usuarios.txt");
                        entrada2 = new Scanner(f2);

                        while (entrada2.hasNext()) { 
                            linea2 = entrada2.nextLine();  
                            if (linea2.contains(texto2)) 
                            {   

                                BufferedReader bfrd2;
                                BufferedWriter bfwr2;
                                numeroDeLinea2++;

                                double saldof2 = caja.getOpe();
                                String escritura2 = Double.toString(saldof2);

                                File archivotxt2 = new File("usuarios.txt");
                                if(archivotxt2.exists()) {
                                    String lineas2;
                                    String anterior2;

                                    bfrd2 = new BufferedReader(new FileReader(archivotxt2));
                                    lineas2 = bfrd2.readLine();
                                if(lineas2.contains(texto2)){
                                    anterior2 = texto2+"\r\n"+escritura2+"\r\n";
                                }
                                else{
                                    anterior2 = lineas2+"\r\n";
                                }
                                while((lineas2 = bfrd2.readLine())!=null) {

                                if(lineas2.contains(texto2)){
                                    anterior2 += texto2+"\r\n"+escritura2+"\r\n";
                                }else{
                                    anterior2 += lineas2 +"\r\n";
                                }
                            }
                            bfrd2.close();
                            bfwr2 = new BufferedWriter(new FileWriter(archivotxt2));
                            bfwr2.write(anterior2);
                            bfwr2.close();
                        }
                        else{
                        System.out.println("el archivo debe existir almenos..");

                        }
                                contiene = true;                                        
                            }
                            numeroDeLinea2++; 
                        }

                    } catch (FileNotFoundException e) {
    
                    } catch (NullPointerException e) {
                        
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    } finally {

                            if (entrada2 != null) 
                            {
                                entrada2.close();
                            }
                       }
                    
                   break;
               case 3:
                   System.out.println("");
                   System.out.println("***********************");
                   System.out.println("*   Bienvenido        *");
                   System.out.println("***********************");
                   System.out.println("*  Saldo Disponible:  *");
                   System.out.println("*  "+caja.getSaldo()+"        *");
                   System.out.println("*                     *");
                   System.out.println("***********************");
                    break;
               case 4:
                   salir=true;
                   break;
                   
            }
       }while(!salir);
        System.out.println("Gracias por usar el sistema");
        System.exit(0);
    }
    
}

