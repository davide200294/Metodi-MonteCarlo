
public class HitOrMiss {
    
    int a, b; //intervallo
    float perc; //indice confidenza
    float risultati[][] = new float[18][2];
    int iteration[] = new int[6];
    
    public HitOrMiss(int a, int b, float perc) {
        this.a = a;
        this.b = b;
        this.perc = perc;
        iteration[0] = 10;
        iteration[1] = 100;
        iteration[2] = 1000;
        iteration[3] = 10000;
        iteration[4] = 100000;
        iteration[5] = 1000000;
        
    }
    
    public float[][] hitOrMissLinear(){
        // c = massimo della funzione
        float c = (float) b;
        
        int nh;
        
        //int n = 10000000;
        //float media[] = new float[5];
        //float confidenza[][] = new float[5][2];
        //float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            nh = 0;
            System.out.println("k: "+k+" - iterazioni "+iteration[k]);
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+(Math.random()*(b-a)));
                float y = (float) (Math.random()*c);
                
                float z = a + (x*(b-a));
                
                if(z>=c*y)
                    nh++; 
                
                }
            
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            risultati[k+6][0] = (float)Math.pow((p*(1-p))/iteration[k], 0.5f); //deviazione standard
            risultati[k][0] = integral;
            System.out.println("nh = "+nh+" media = "+risultati[k][0]);
            //intervallo di confidenza
            if(perc == 0){
                risultati[k+11][0] = (float) (integral-(1.64f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.64f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 1){
                risultati[k+11][0] = (float) (integral-(1.96f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.96f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 2){
                risultati[k+11][0] = (float) (integral-(2.57f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(2.57f*risultati[k+6][0]*c*(b-a)));
                }
            }
        return risultati;
        }
    
    public float[][] hitOrMissExp(){
        // c = massimo della funzione
        float c = (float) b*b;
        
        float nh;
        
        //int n = 10000000;
        //float media[] = new float[5];
        //float confidenza[][] = new float[5][2];
        //float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            nh = 0;
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (Math.random()*c);
            
                float z = a + (x*(b-a));
            
                if((z*z)>=(c*y))
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            risultati[k+6][0] = (float)Math.pow((p*(1-p))/iteration[k], 0.5f);
            risultati[k][0] = integral;
            
            if(perc == 0){
                risultati[k+11][0] = (float) (integral-(1.64f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.64f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 1){
                risultati[k+11][0] = (float) (integral-(1.96f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.96f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 2){
                risultati[k+11][0] = (float) (integral-(2.57f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(2.57f*risultati[k+6][0]*c*(b-a)));
                }
            }
        return risultati;
        }
    
    public float[][] hitOrMissLog(){
        // c = massimo della funzione
        float c = (float) Math.log(b);
        
        float nh;
        
        //int n = 10000000;
        //float media[] = new float[5];
        //float confidenza[][] = new float[5][2];
        //float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            nh = 0;
            for (int i=0; i<iteration[k];i++){
                
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (Math.random()*c);
            
                float z = a + (x*(b-a));
            
                if(Math.log(z)>=(c*y))
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            risultati[k+6][0] = (float)Math.pow((p*(1-p))/iteration[k], 0.5f);
            risultati[k][0] = integral;
            
            if(perc == 0){
                risultati[k+11][0] = (float) (integral-(1.64f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.64f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 1){
                risultati[k+11][0] = (float) (integral-(1.96f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.96f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 2){
                risultati[k+11][0] = (float) (integral-(2.57f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(2.57f*risultati[k+6][0]*c*(b-a)));
                }
            }
        return risultati;
        }
    
    public float[][] hitOrMissExpLog(){
        // c = massimo della funzione
        float c = (float) ((float) Math.log(b)*Math.log(b));
        
        float nh;
        
        //int n = 10000000;
        //float media[] = new float[5];
        //float confidenza[][] = new float[5][2];
        //float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            nh = 0;
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (Math.random()*c);
                
                float z = a + (x*(b-a));
            
                if((Math.log(z)*Math.log(z))>=(c*y))
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            risultati[k+6][0] = (float)Math.pow((p*(1-p))/iteration[k], 0.5f);
            risultati[k][0] = integral;
            
            if(perc == 0){
                risultati[k+11][0] = (float) (integral-(1.64f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.64f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 1){
                risultati[k+11][0] = (float) (integral-(1.96f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(1.96f*risultati[k+6][0]*c*(b-a)));
                }
            else if(perc == 2){
                risultati[k+11][0] = (float) (integral-(2.57f*risultati[k+6][0]*c*(b-a)));
                risultati[k+11][1] = (float) (integral+(2.57f*risultati[k+6][0]*c*(b-a)));
                }
            }
        return risultati;
        }
    
    }
