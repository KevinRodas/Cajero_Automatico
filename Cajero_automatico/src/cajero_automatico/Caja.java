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
public class Caja {
    private double saldo;
    private double cantidad;
    private double ope;

    public double getSaldo() {
        return saldo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getOpe() {
        ope=saldo-cantidad;
        return ope;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setOpe(double ope) {
        this.ope = ope;
    }
    
}
