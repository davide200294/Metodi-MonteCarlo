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
    
    public double getCov(){
       
        double cov = 0;
        
        for(int i = 0; i<risultati1.length; i++)
            cov+=(risultati[i][0]-(getMeanHM()))*(risultati1[i]-(getMeanSM()));
        
        System.out.println("Covarianza.... : "+cov/risultati1.length);
        return cov/risultati1.length;
        
    }
    
    public double getVarSM(){
        double mean = getMeanSM();
        double sum = 0;
        for(int i = 0; i<risultati1.length; i++)
            sum+= Math.pow((risultati1[i]-mean),2);
        System.out.println("Varianza...: "+sum/(risultati1.length));
        
        return sum/(risultati1.length);   
    } 
    
    public double getVarHM(){
        
        double mean = getMeanHM();
        double sum = 0;
        for(int i = 0; i<risultati1.length; i++)
            sum+= Math.pow((risultati[i][0]-mean),2);
        
        return sum/risultati1.length;
    }
    
    public double getMeanSM(){
        
        double sumS = 0;
        
        for(int i = 0; i<risultati1.length; i++)
            sumS+=risultati1[i];
        
        
        return sumS/(risultati1.length);
    }
    
    public double getMeanHM(){
        double sumH = 0;
        
        for(int i = 0; i<risultati1.length; i++)
            sumH += risultati[i][0];
        
        
        return (sumH/risultati1.length);
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
