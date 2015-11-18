/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giovy
 */
public class AnthiteticVariates {
    private int a;
    private int b;
    private int perc;
    protected double[][] risultati2 = new double[18][2]; 
    protected int tentativi[] = new int [6];
    
    public AnthiteticVariates(int a1, int b1, int perc){
        a = a1;  b = b1;
        tentativi[0]=10;
        tentativi[1]=100;
        tentativi[2]=1000;
        tentativi[3]=10000;
        tentativi[4]=100000;
        tentativi[5]=1000000;
        this.perc = perc;  //intervallo di confidenza
    }
    
    private double calcoloVarianza(double x[], double media){
        double varianza = 0;
        double prob = 1d/(double)x.length;
        for(int i=0;i<x.length;i++)
            varianza+=(double)(((x[i]-media)*(x[i]-media))*prob);
        
        return varianza;
    }
    
    private double calcoloMedia(double x[]){
        double media=0d;
        
        double prob = 1d/(double)x.length;
        
        for(int i=0;i<x.length;i++)
            media+=x[i]*prob;
     
        return media; //media pesata
    }
    
        public double [][] genera(int n){
        for(int i = 0; i<tentativi.length; i++){
            double tmp = 0; //stima integrale
            //double c=0d; //massimo
            double x[] = new double[tentativi[i]]; //valori f(xi)
            for(int j = 0; j<tentativi[i]; j++){
                
                if(n == 0){
                    double[] tmp1 = expLog(); //valore f(xi)
                    tmp+= ((tmp1[0]+tmp1[1])/2);
                    //c = maximumExpLog();
                }
                else if(n==1){
                    double[] tmp1 = logarithmic();
                    tmp+= ((tmp1[0]+tmp1[1])/2);
                    //c = maximumLog();
                }
                else if(n==2){
                    double[] tmp1 = exponential();
                    tmp+= ((tmp1[0]+tmp1[1])/2);
                    //c = maximumExp();
                }
                else{
                    double[]tmp1 = linear();
                    tmp+= ((tmp1[0]+tmp1[1])/2);
                    //c = maximumLinear();
                }
                
            }
            
            risultati2[i][0]=(tmp*(b-a))/tentativi[i]; //theta
            double media = calcoloMedia(x);
            double varianza = calcoloVarianza(x,media);
            double ba_difference_square = (double)Math.pow(b-a, 2);
            double tentativi_square = (double)Math.pow(tentativi[i], 2);
            
            risultati2[i+6][0] = (double)Math.pow((ba_difference_square/tentativi_square)*varianza,0.5);
            if(perc == 0){
                risultati2[i+11][0] = (float) (media-(1.64f*risultati2[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                risultati2[i+11][1] = (float) (media+(1.64f*risultati2[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                }
            else if(perc == 1){
                risultati2[i+11][0] = (float) (media-(1.96f*risultati2[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                risultati2[i+11][1] = (float) (media+(1.96f*risultati2[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                }
            else if(perc == 2){
                risultati2[i+11][0] = (float) (media-(2.57f*risultati2[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                risultati2[i+11][1] = (float) (media+(2.57f*risultati2[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                }
        }
        return risultati2;
    }
    
    public double [] expLog(){
        double tmp[] = new double[2];
        double x = a+(Math.random()*(b-a));
        tmp[0] = flog2(x); tmp[1] = flog2(1-x); 
        return tmp;  
    }
    
    public double [] logarithmic(){
        double tmp[] = new double[2];
        double x = a+(Math.random()*(b-a));
        tmp[0]=flog(x); tmp[1]=flog(1-x);
        return tmp;
    }
    
    public double [] exponential(){
        double tmp[] = new double[2];
        double x = a+(Math.random()*(b-a));
        tmp[0] = fx2(x); tmp[1]=fx2(1-x);
        return tmp;
    }
    
    public double [] linear(){
        double tmp[] = new double[2];
        double x = a+(Math.random()*(b-a));
        tmp[0]=x; tmp[1]=1-x;
        return tmp;
    }
      
    private double flog2(double x){
        return Math.pow(Math.log(x),2);
    }
    private double flog(double x){
        return Math.log(x);
    }
    
    private double fx2(double x){
        return Math.pow(x,2);
    }
        
}
