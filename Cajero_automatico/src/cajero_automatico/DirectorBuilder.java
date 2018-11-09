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
public class DirectorBuilder {
    private CajaBuilder cajaBuilder;
    
    public void ConstructCaja(Caja ret){
        cajaBuilder.CrearCaja();
        cajaBuilder.builCantidad(ret);
        cajaBuilder.builSaldo(ret);
        cajaBuilder.builOpe();
        
    }
    
    public void setCajaBuilder(CajaBuilder cajaBuilder){
        this.cajaBuilder=cajaBuilder;
    }
    public Caja getCaja(){
        return cajaBuilder.getCaja();
    }
    
}
