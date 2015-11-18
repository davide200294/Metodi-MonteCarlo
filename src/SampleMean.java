/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SampleMean {
    private int a;
    private int b;
    private int perc;
    protected float[][] risultati1 = new float[18][2]; 
    protected int tentativi[] = new int [6];
    
    public SampleMean(int a1, int b1, int perc){
        a = a1;  b = b1;
        tentativi[0]=10;
        tentativi[1]=100;
        tentativi[2]=1000;
        tentativi[3]=10000;
        tentativi[4]=100000;
        tentativi[5]=1000000;
        this.perc = perc;  //intervallo di confidenza
    }
    
    private float calcoloVarianza(float x[], float media){
        float varianza = 0;
        float prob = 1f/(float)x.length;
        for(int i=0;i<x.length;i++)
            varianza+=(float)(((x[i]-media)*(x[i]-media))*prob);
        
        return varianza;
    }
    
    private float calcoloMedia(float x[]){
        float media=0f;
        
        float prob = 1f/(float)x.length;
        
        for(int i=0;i<x.length;i++)
            media+=x[i]*prob;
     
        return media; //media pesata
    }
    
    public float [][] genera(int n){
        for(int i = 0; i<tentativi.length; i++){
            float tmp = 0; //stima integrale
            //double c=0d; //massimo
            float x[] = new float[tentativi[i]]; //valori f(xi)
            for(int j = 0; j<tentativi[i]; j++){
                
                if(n == 0){
                    x[j] = expLog(); //valore f(xi)
                    tmp+= x[j];
                    //c = maximumExpLog();
                }
                else if(n==1){
                    x[j] = logarithmic();
                    tmp+= x[j];
                    //c = maximumLog();
                }
                else if(n==2){
                    x[j] = exponential();
                    tmp+= x[j];
                    //c = maximumExp();
                }
                else{
                    x[j] = linear();
                    tmp+= x[j];
                    //c = maximumLinear();
                }
                
            }
            
            risultati1[i][0]=(tmp*(b-a))/tentativi[i]; //theta
            float media = calcoloMedia(x);
            float varianza = calcoloVarianza(x,media);
            float ba_difference_square = (float)Math.pow(b-a, 2);
            float tentativi_square = (float)Math.pow(tentativi[i], 2);
            
            risultati1[i+6][0] = (float)Math.pow((ba_difference_square/tentativi_square)*varianza,0.5);
            if(perc == 0){
                risultati1[i+11][0] = (float) (media-(1.64f*risultati1[i+6][0]*(Math.pow((float)tentativi[i],0.5))));
                risultati1[i+11][1] = (float) (media+(1.64f*risultati1[i+6][0]*(Math.pow((float)tentativi[i],0.5))));
                }
            else if(perc == 1){
                risultati1[i+11][0] = (float) (media-(1.96f*risultati1[i+6][0]*(Math.pow((float)tentativi[i],0.5))));
                risultati1[i+11][1] = (float) (media+(1.96f*risultati1[i+6][0]*(Math.pow((float)tentativi[i],0.5))));
                }
            else if(perc == 2){
                risultati1[i+11][0] = (float) (media-(2.57f*risultati1[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                risultati1[i+11][1] = (float) (media+(2.57f*risultati1[i+6][0]*(Math.pow((double)tentativi[i],0.5))));
                }
        }
        return risultati1;
    }
    
    
    
    public void setRisultati1(float [][] risultati){
        this.risultati1 = risultati;
    }
    
    
    public float expLog(){
        float x = (float)(a+(Math.random()*(b-a)));
        return (float)flog2(x);   
    }
    
    public float logarithmic(){
        float x = (float)(a+(Math.random()*(b-a)));
        return (float)flog(x);
    }
    
    public float exponential(){
        
        float x = (float)(a+(Math.random()*(b-a)));
        return (float)fx2(x);
    }
    
    private float linear(){
        return (float)(a+(Math.random()*(b-a)));
    }
      
    private float flog2(double x){
        return (float)(Math.pow(Math.log(x),2));
    }
    private float flog(float x){
        return (float)(Math.log(x));
    }
    
    private float fx2(float x){
        return (float)(Math.pow(x,2));
    }
    
    /*public double maximumLinear(){
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
            if(Math.pow(i, 2)>c) 
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
    }*/
}



