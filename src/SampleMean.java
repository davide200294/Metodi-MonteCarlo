/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SampleMean {
    private int n;
    private double a;
    private double b;
    public SampleMean(int n1, double a1, double b1){
        n = n1;    a = a1;  b = b1;
        double [] vet = new double [n];
        for(int i = 0; i<vet.length; i++){
            vet[i] = Math.random();
            vet[i] = a+(vet[i]*(b-a));
            System.out.println("x"+i+": "+ vet[i]);
        }
        double risultato = sum(vet)*((b-a)/n);
        System.out.println("risultato: "+risultato);

    }
    
    private double sum(double [] vet){ 
        double somma = 0;
        for(int i = 0; i<vet.length; i++)
            somma+=f(vet[i]);
        return somma;
    }
    
    private double f(double x){
        return Math.pow(Math.log(x),2);
    }
    
}



