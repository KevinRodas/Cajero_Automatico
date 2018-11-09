/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;

import java.io.BufferedReader;
import java.util.Scanner;


/**
 *
 * @author krodas
 */
public class RetiroBuilder extends CajaBuilder{
    double sald;
    double cant;
    double oper;
    
    Scanner teclado= new Scanner(System.in);

    public void RetiroBuilder(){
        double sald1 = this.sald;
    }
    @Override
    public void builSaldo(Caja ret) {
       this.sald=ret.getSaldo()-ret.getCantidad();
        //System.out.println(ret.getSaldo()+" "+ret.getCantidad()+" "+this.sald);
       ret.setSaldo(this.sald);
       ret.setCantidad(0);
       caja = ret;
       
    }

    @Override
    public void builCantidad(Caja ret) {
        do{
        System.out.println("ingrese la cantidad a retirar");
        ret.setCantidad(teclado.nextDouble());
         }while(ret.getCantidad()<=0||ret.getCantidad()>=ret.getSaldo());       
        caja = ret;
 
    }

    @Override
    public void builOpe() {
        
        oper=caja.getSaldo();
        
    }

}
