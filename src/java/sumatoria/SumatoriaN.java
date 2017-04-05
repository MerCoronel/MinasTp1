/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

/**
 *
 * @author merco_000
 */
public class SumatoriaN {
    private int num;
    private int suma;
    public SumatoriaN() {
    }

    public SumatoriaN(int num) {
        this.num = num;
    }
   public void asignarValor(int n){
        setNum(n);
   }
   public int obtenerSumatoria(){
       int i;
       for(i=1;i<=getNum();i++)
            setSuma(getSuma() + (2*i-4));
       return getSuma();
   }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the suma
     */
    public int getSuma() {
        return suma;
    }

    /**
     * @param suma the suma to set
     */
    public void setSuma(int suma) {
        this.suma = suma;
    }
              
   }

