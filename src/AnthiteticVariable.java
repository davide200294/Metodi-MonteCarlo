/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giovy
 */
public class AnthiteticVariable {
    protected double[] risultati1 = new double[5];
    protected float [][] risultati = new float[15][2];
    
    public double Cov(){
        double meanH = 0, meanS = 0;
        
        double sumH = 0;
        double sumS = 0;
        //calcolo somma
        for(int i = 0; i<risultati1.length; i++){
            sumH+=risultati[i][0];
            sumS+=risultati1[i];
        }
        //calcolo valore medio
        meanH = sumH/risultati1.length;
        meanS = sumS/risultati1.length;
        double cov = 0;
        
        for(int i = 0; i<risultati1.length; i++){
            cov+=(risultati[i][0]-meanH)*(risultati1[i]-meanS);
        }
        System.out.println("Covarianza.... : "+cov/risultati1.length);
        return cov/risultati1.length;
        
    }
    
    public void stampa(){
        System.out.println("HM      SM");
        for(int i = 0; i<risultati1.length; i++){
            System.out.println(risultati[i][0]+"      "+risultati1[i]);
       }
    }
    
    public void setRisultati1(double [] risultati){
        this.risultati1 = risultati;
    }
    
    public void setRisultati(float [][] risultati){
        this.risultati = risultati;
    }
}
