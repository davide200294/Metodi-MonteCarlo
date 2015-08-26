/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SampleMean {
    //private int n;
    private int a;
    private int b;
    private int perc;
    protected double[][] risultati1 = new double[18][2]; 
    protected int tentativi[] = new int [6];
    
    public SampleMean(int a1, int b1, int perc){
        a = a1;  b = b1;
        tentativi[0]=10;
        tentativi[1]=100;
        tentativi[2]=1000;
        tentativi[3]=10000;
        tentativi[4]=100000;
        tentativi[5]=1000000;
        this.perc = perc;
    }
    
    
    
    public double [][] genera(int n){
        for(int i = 0; i<tentativi.length; i++){
            double tmp = 0;
            double c=0d;
            for(int j = 0; j<tentativi[i]; j++){
                if(n == 0){
                    tmp+= expLog();
                    c = maximumExpLog();
                }
                else if(n==1){
                    tmp+= logarithmic();
                    c = maximumLog();
                }
                else if(n==2){
                    tmp+= exponential();
                    c = maximumExp();
                }
                else{
                    tmp+= linear();
                    c = maximumLinear();
                }
            }
            
            risultati1[i][0]+=(tmp*(b-a))/tentativi[i];
            if(perc == 0){
                risultati1[i+11][0] = (float) (risultati1[i][0]-(1.64f*risultati1[i+6][0]*c*(b-a)));
                risultati1[i+11][1] = (float) (risultati1[i][0]+(1.64f*risultati1[i+6][0]*c*(b-a)));
                }
            else if(perc == 1){
                risultati1[i+11][0] = (float) (risultati1[i][0]-(1.96f*risultati1[i+6][0]*c*(b-a)));
                risultati1[i+11][1] = (float) (risultati1[i][0]+(1.96f*risultati1[i+6][0]*c*(b-a)));
                }
            else if(perc == 2){
                risultati1[i+11][0] = (float) (risultati1[i][0]-(2.57f*risultati1[i+6][0]*c*(b-a)));
                risultati1[i+11][1] = (float) (risultati1[i][0]+(2.57f*risultati1[i+6][0]*c*(b-a)));
                }
        }
        return risultati1;
    }
    
    
    
    public void setRisultati1(double [][] risultati){
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
    
    public double maximumLinear(){
        double c = (float) a;
        for (int i=a+1;i<=b;i++){
            if(i>c) 
                c = (float) i;
            }
        return c;
    }
    public double maximumExp(){
        double c = (float) a;
        for (int i=a+1;i<=b;i++){
            if(i*i>c) 
                c = (float) i;
            }
        return c;
    }
    public double maximumLog(){
        double c = (float) a;
        for (int i=a+1;i<=b;i++){
            if(Math.log(i)>c) 
                c = (float) i;
            }
        return c;
    }
    public double maximumExpLog(){
        double c = (float) a;
        for (int i=a+1;i<=b;i++){
            if(Math.log(i)*Math.log(i)>c) 
                c = (float) i;
            }
        return c;
    }
}



