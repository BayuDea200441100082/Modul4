package praktikum4;

public class pengurangan extends program{
    protected double a,b,c;
    
    @Override
    protected void setA(double a){
      this.a=a;  
    }
    @Override
    protected void setB(double b){
        this.b=b;
    }
    @Override
    protected void setC(){
        this.c= a - b;
    }
    @Override
    protected double getA(){
        return a; 
    }
     @Override
    protected double getB(){
        return b;
    }
     @Override
    protected double getC(){
        return c;
    }
    protected void tampil(){
        
    }
}

