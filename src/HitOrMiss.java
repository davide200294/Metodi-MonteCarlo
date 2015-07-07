
public class HitOrMiss {
    
    int a, b; //intervallo
    float perc; //indice confidenza
    int iteration[] = new int[5];
    
    public HitOrMiss(int a, int b, float perc) {
        this.a = a;
        this.b = b;
        this.perc = perc;
        int [] iteration = {10,100,1000,10000,100000};
        
    }
    
    public float hitOrMissLinear(){
        //ricerca massimo della funzione
        float c = (float) a;
        for (int i=a+1;i<=b;i++){
            if(i>c) 
                c = (float) i;
            }
        float nh = 0;
        
        //int n = 10000000;
        float media[] = new float[5];
        float confidenza[][] = new float[5][2];
        float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (a+Math.random()*c);
            
                float z = a + x*(b-a);
            
                if(z>=c*y)
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            dev_stand[k] = (float)Math.pow((p*(1-p))/iteration[k], 2);
            media[k] = (float) 4*p;
            if(perc == 0){
                confidenza[k][0] = (float) (p-(1.64f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.64f*dev_stand[k]));
                }
            else if(perc == 1){
                confidenza[k][0] = (float) (p-(1.96f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.96f*dev_stand[k]));
                }
            else if(perc == 2){
                confidenza[k][0] = (float) (p-(2.57f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(2.57f*dev_stand[k]));
                }
            }
        return 0f;
        }
    
    public float hitOrMissExp(){
         //ricerca massimo della funzione
        float c = (float) a*a;
        for (int i=a+1;i<=b;i++){
            if(i*i>c) 
                c = (float) i*i;
            }
        float nh = 0;
        
        //int n = 10000000;
        float media[] = new float[5];
        float confidenza[][] = new float[5][2];
        float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (a+Math.random()*c);
            
                float z = a + x*(b-a);
            
                if((z*z)>=c*y)
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            dev_stand[k] = (float)Math.pow((p*(1-p))/iteration[k], 2);
            media[k] = (float) 4*p;
            if(perc == 0){
                confidenza[k][0] = (float) (p-(1.64f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.64f*dev_stand[k]));
                }
            else if(perc == 1){
                confidenza[k][0] = (float) (p-(1.96f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.96f*dev_stand[k]));
                }
            else if(perc == 2){
                confidenza[k][0] = (float) (p-(2.57f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(2.57f*dev_stand[k]));
                }
            }
        return 0f;
        }
    
    public float hitOrMissLog(){
         //ricerca massimo della funzione
        float c = (float) Math.log(a);
        for (int i=a+1;i<=b;i++){
            if(Math.log(i)>c) 
                c = (float) Math.log(i);
            }
        float nh = 0;
        
        //int n = 10000000;
        float media[] = new float[5];
        float confidenza[][] = new float[5][2];
        float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (a+Math.random()*c);
            
                float z = a + x*(b-a);
            
                if(Math.log(z)>=c*y)
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            dev_stand[k] = (float)Math.pow((p*(1-p))/iteration[k], 2);
            media[k] = (float) 4*p;
            if(perc == 0){
                confidenza[k][0] = (float) (p-(1.64f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.64f*dev_stand[k]));
                }
            else if(perc == 1){
                confidenza[k][0] = (float) (p-(1.96f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.96f*dev_stand[k]));
                }
            else if(perc == 2){
                confidenza[k][0] = (float) (p-(2.57f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(2.57f*dev_stand[k]));
                }
            }
        return 0f;
        }
    
    public float hitOrMissExpLog(){
         //ricerca massimo della funzione
        float c = (float) ((float) Math.log(a)*Math.log(a));
        for (int i=a+1;i<=b;i++){
            if(Math.log(i)*Math.log(i)>c) 
                c = (float) i;
            }
        float nh = 0;
        
        //int n = 10000000;
        float media[] = new float[5];
        float confidenza[][] = new float[5][2];
        float dev_stand[] = new float[5];
        //inizio algoritmo vero e proprio
        for(int k=0;k<iteration.length;k++){
            for (int i=0; i<iteration[k];i++){
                float x = (float) (a+Math.random()*(b-a));
                float y = (float) (a+Math.random()*c);
            
                float z = a + x*(b-a);
            
                if(Math.log(z)*Math.log(z)>=c*y)
                    nh++;
                }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            dev_stand[k] = (float)Math.pow((p*(1-p))/iteration[k], 2);
            media[k] = (float) 4*p;
            if(perc == 0){
                confidenza[k][0] = (float) (p-(1.64f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.64f*dev_stand[k]));
                }
            else if(perc == 1){
                confidenza[k][0] = (float) (p-(1.96f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(1.96f*dev_stand[k]));
                }
            else if(perc == 2){
                confidenza[k][0] = (float) (p-(2.57f*dev_stand[k]));
                confidenza[k][1] = (float) (p+(2.57f*dev_stand[k]));
                }
            }
        return 0f;
        }
    }
