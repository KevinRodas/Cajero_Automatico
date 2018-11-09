/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automatico;

/**
 *
 * @author krodas
 */
public abstract class CajaBuilder {
   protected Caja caja;
   
   public Caja getCaja(){
       return caja;
   }
   public void CrearCaja(){
       caja= new Caja();
   }
   
   public abstract void builSaldo(Caja ret);
   public abstract void builCantidad(Caja ret); 
   public abstract void builOpe(); 
   
    
}
