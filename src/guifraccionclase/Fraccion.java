package guifraccionclase;

public class Fraccion {
    private int num;
    private int den;
    
    public Fraccion(int num, int den){
        this.num = num;
        this.den = den;
    }
    public int getNum() {
        return num;
    }
    public int getDen() {
        return den;
    }
    public Fraccion sumar(Fraccion f){
        int n, d;
        n = num * f.getDen() + f.getNum()*den;
        d = den * f.getDen();
        return new Fraccion(n,d);
    }
    public Fraccion restar(Fraccion f){
        int n, d;
        n = num * f.getDen() - f.getNum()*den;
        d = den * f.getDen();
        return new Fraccion(n,d);
    }
    public Fraccion multiplicar(Fraccion f){
        int n, d;
        n = num * f.getNum();
        d = den * f.getDen();
        return new Fraccion(n,d);
    }
    public Fraccion dividir(Fraccion f){
        int n, d;
        if(den == 0 || f.getNum()== 0)
            throw new ArithmeticException("La fraccion resultante no puede tener denominador 0.");
        n = num * f.getDen();
        d = den * f.getNum();
        return new Fraccion(n,d);
    }
    @Override
    public String toString(){
        return num+" / "+den;
    }
}
