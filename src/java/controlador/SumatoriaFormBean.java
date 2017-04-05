/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import sumatoria.SumatoriaN;

/**
 *
 * @author merco_000
 */
@ManagedBean
@RequestScoped
public class SumatoriaFormBean {
    private int numero;

    public SumatoriaFormBean(int numero) {
        this.numero = numero;
    }
    /**
     * Creates a new instance of SumatoriaFormBean
     */
    public SumatoriaFormBean() {
    }
    public int calcularSumatoria(){
        SumatoriaN usumatoria = new SumatoriaN();
        usumatoria.asignarValor(getNumero());
        return usumatoria.obtenerSumatoria();
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
            
}
