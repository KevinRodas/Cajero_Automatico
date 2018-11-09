/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;

import java.util.Scanner;

/**
 *
 * @author krodas
 */
public class AbonoBuilder extends CajaBuilder{
    double sald;
    double cant;
    double oper;
    Scanner teclado= new Scanner(System.in);
    public void AbonoBuilder(){
        double sald1 = this.sald;
    }
    @Override
    public void builSaldo(Caja ret) {
       this.sald=ret.getSaldo()+ret.getCantidad();
       ret.setSaldo(this.sald);
       ret.setCantidad(0);
        caja = ret;
        
    }

    @Override
    public void builCantidad(Caja ret) {
       do{
        System.out.println("ingrese la cantidad a abonar");
        ret.setCantidad(teclado.nextDouble());
       }while(ret.getCantidad()<=0);
        caja = ret;  
       
    }

    @Override
    public void builOpe() {
       oper=caja.getSaldo();
    }
    
}
