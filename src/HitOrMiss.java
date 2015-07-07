
public class HitOrMiss {
    
    int a, b;

    public HitOrMiss(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public float hitOrMissLinear(){
        //ricerca massimo della funzione
        float c = (float) a;
        for (int i=a+1;i<=b;i++){
            if(i>c) 
                c = (float) i;
            }
        float nh = 0;
        
        int n = 10000000;
        
        //inizio algoritmo vero e proprio
        for (int i=0; i<n;i++){
            float x = (float) (a+Math.random()*(b-a));
            float y = (float) (a+Math.random()*c);
            
            float z = a + x*(b-a);
            
            if(z>=c*y)
                nh++;
            }
        float p = (float) nh/n;
        int d = b-a;
        float integral = (float) (d*c*p);
        return integral;
        }
    
    public float hitOrMissExp(){
        //ricerca massimo della funzione
        float c = (float) a*a;
        for (int i=a+1;i<=b;i++){
            if(i*i>c) 
                c = (float) i*i;
            }
        float nh = 0;
        
        int n = 10000000;
        
        //inizio algoritmo vero e proprio
        for (int i=0; i<n;i++){
            float x = (float) (a+Math.random()*(b-a));
            float y = (float) (a+Math.random()*c);
            
            float z = a + x*(b-a);
            
            if(z*z>=c*y)
                nh++;
            }
        float p = (float) nh/n;
        int d = b-a;
        float integral = (float) (d*c*p);
        return integral;
        }
    
    public float hitOrMissLog(){
        //ricerca massimo della funzione
        float c = (float) Math.log(a);
        for (int i=a+1;i<=b;i++){
            if(Math.log(i)>c) 
                c = (float) Math.log(i);
            }
        float nh = 0;
        
        int n = 10000000;
        
        //inizio algoritmo vero e proprio
        for (int i=0; i<n;i++){
            float x = (float) (a+Math.random()*(b-a));
            float y = (float) (a+Math.random()*c);
            
            float z = a + x*(b-a);
            
            if(Math.log(z)>=c*y)
                nh++;
            }
        float p = (float) nh/n;
        int d = b-a;
        float integral = (float) (d*c*p);
        return integral;
        }
    
    public float hitOrMissExpLog(){
        //ricerca massimo della funzione
        float c = (float) ((float) Math.log(a)*Math.log(a));
        for (int i=a+1;i<=b;i++){
            if(Math.log(i)*Math.log(i)>c) 
                c = (float) ((float) Math.log(i)*Math.log(i));
            }
        float nh = 0;
        
        int n = 10000000;
        
        //inizio algoritmo vero e proprio
        for (int i=0; i<n;i++){
            float x = (float) (a+Math.random()*(b-a));
            float y = (float) (a+Math.random()*c);
            
            float z = a + x*(b-a);
            
            if(Math.log(z)*Math.log(z)>=c*y)
                nh++;
            }
        float p = (float) nh/n;
        int d = b-a;
        float integral = (float) (d*c*p);
        return integral;
        }
    }
