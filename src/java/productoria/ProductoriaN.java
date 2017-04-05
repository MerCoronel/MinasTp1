/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoria;

/**
 *
 * @author merco_000
 */
public class ProductoriaN {
    private int nu;

    public ProductoriaN() {
    }

    public ProductoriaN(int nu) {
        this.nu = nu;
    }
    public void asignarValor(int num){
        nu=num;
    }
    public int obtenerProductoria(){
        int VProductoria=1;
        int aux=nu;
        while(nu>=1){
            VProductoria=VProductoria*nu;
            nu=nu-1;  
        }
        nu=aux;
        return VProductoria;
}
}
