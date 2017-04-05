/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import productoria.ProductoriaN;

/**
 *
 * @author merco_000
 */
@ManagedBean
@RequestScoped
public class ProductorialFormBean {
    private int nu;
    /**
     * Creates a new instance of ProductorialFormBean
     */
    public ProductorialFormBean() {
    }
     public int calcularProductoria(){
        ProductoriaN productoria = new ProductoriaN();
        productoria.asignarValor(getNu());
        return productoria.obtenerProductoria();
    }

    /**
     * @return the nu
     */
    public int getNu() {
        return nu;
    }

    /**
     * @param nu the nu to set
     */
    public void setNu(int nu) {
        this.nu = nu;
    }
}
