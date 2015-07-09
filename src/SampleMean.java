/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SampleMean {
    //private int n;
    private int a;
    private int b;
    protected double[] risultati1 = new double[5]; 
    protected int tentativi[] = new int [5];
    
    public SampleMean(int a1, int b1){
        a = a1;  b = b1;
        tentativi[0]=10;
        tentativi[1]=100;
        tentativi[2]=1000;
        tentativi[3]=10000;
        tentativi[4]=100000;
       
    }
    
    
    
    public double [] genera(int n){
        for(int i = 0; i<tentativi.length; i++){
            double tmp = 0;
            for(int j = 0; j<tentativi[i]; j++){
                if(n == 0)
                    tmp+= expLog();
                else if(n==1)
                    tmp+= logarithmic();
                else if(n==2)
                    tmp+= exponential();
                else
                    tmp+= linear();
            }
            
            risultati1[i]+=(tmp*(b-a))/tentativi[i];
        }
        return risultati1;
    }
    
    
    
    public void setRisultati1(double [] risultati){
        this.risultati1 = risultati;
    }
    
    
    public double expLog(){
        double x = a+(Math.random()*(b-a));
        return flog2(x);   
    }
    
    public double logarithmic(){
        double x = a+(Math.random()*(b-a));
        return flog(x);
    }
    
    public double exponential(){
        
        double x = a+(Math.random()*(b-a));
        return fx2(x);
    }
    
    public double linear(){
        return a+(Math.random()*(b-a));
    }
      
    public double flog2(double x){
        return Math.pow(Math.log(x),2);
    }
    private double flog(double x){
        return Math.log(x);
    }
    
    private double fx2(double x){
        return Math.pow(x,2);
    }
}



