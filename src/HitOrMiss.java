
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
    
    public float[][] hitOrMiss(int index){
        int nh = 0;
        float c = maximum(index);
        System.out.println("MASSIMO - - - > "+c);
        
        for(int k=0;k<iteration.length;k++){
            for(int j=0;j<iteration[k];j++){
                float x = (float) (a+(Math.random()*(b-a)));
                float y = (float) (Math.random()*c);
                
                float z = a + (x*(b-a));
            
                if(hasBeenHitted(index, z, c, y))
                    nh++;   //Il punto in cui riccade sotto la funzione
            }
            float p = (float) nh/iteration[k];
            int d = b-a;
            float integral = (float) (d*c*p);
            //return integral;
            risultati[k+6][0] = (float)Math.pow(((p*(1-p))/iteration[k]), 0.5f); //deviazione standard
            risultati[k][0] = integral; //theta
            System.out.println("nh = "+nh+" theta = "+risultati[k][0]);
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
    
    private float maximum(int n){
        if(n == 0)
            return (float)Math.pow(Math.log(b), 2);
        else if (n == 1)
            return (float) Math.log(b);
        else if (n == 2)
            return (float)Math.pow(b, 2);
        else return (float)b;
        
    }
    
    private boolean hasBeenHitted(int n, float z, float c, float y){
        if(n == 0)
            if((Math.pow(Math.log(z), 2))>=(c*y))
                    return true;
            else return false;
        
        else if (n == 1)
            if(Math.log(z)>=c*y)
                return true;
            else return false;
        
        else if (n == 2)
            if(Math.pow(z, 2)>=(c*y))
                return true;
            else return false;
        
        else if (n == 3)
            if(z>=(c*y))
                return true;
            else return false;
        
        else return false;
        }
    
    }
