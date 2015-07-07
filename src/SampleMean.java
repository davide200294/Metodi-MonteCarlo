/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SampleMean {
    private int n;
    private int a;
    private int b;
    
    public SampleMean(int n1, int a1, int b1){
        n = n1;    a = a1;  b = b1;
    }
    
    public double expLog(){
        double [] vet = new double [n];
        for(int i = 0; i<vet.length; i++)
            vet[i] = a+(Math.random()*(b-a));
        
        return (sum(vet,0)*(b-a))/n;
        
         
    }
    
    public double logarithmic(){
        double [] vet = new double [n];
        for(int i = 0; i<vet.length; i++)
            vet[i] = a+(Math.random()*(b-a));
            //System.out.println("x"+i+": "+ vet[i]);
        return (sum(vet,1)*(b-a))/n;
         
    }
    
    public double exponential(){
        double [] vet = new double [n];
        for(int i = 0; i<vet.length; i++)
            vet[i] = a+(Math.random()*(b-a));
            //System.out.println("x"+i+": "+ vet[i]);
        return (sum(vet,2)*(b-a))/n;
         
    }
    
    public double linear(){
        double [] vet = new double [n];
        for(int i = 0; i<vet.length; i++)
            vet[i] = a+(Math.random()*(b-a));
            //System.out.println("x"+i+": "+ vet[i]);
        return (sum(vet,3)*(b-a))/n;
         
    }
    
    
    
    private double sum(double [] vet, int n){ 
        double somma = 0;
        if(n == 0){ // funzione log2
            for(int i = 0; i<vet.length; i++)
                somma+=flog2(vet[i]);
        }
        else if(n==1){ //funzione log
            for(int i = 0; i<vet.length; i++)
                somma+=flog(vet[i]);
        }
        else if (n == 2){ //funzione x^2
            for(int i = 0; i<vet.length; i++)
                somma+=fx2(vet[i]);
        }
        else{ //funzione lineare
            for(int i = 0; i<vet.length; i++)
                somma+=vet[i];
        }
        System.out.println("Somma : "+ somma);
        return somma;
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



