public class esfera {
    private double radio;
        
    public esfera(double r){
        if (r <= 0){
            radio = 0;
        }else{
            radio = r;
        }
    }

    public double getradio(){
        return radio;
    }
    public double getdiametro(){
        return (2 * radio);
    }
    public double getcircunferencia(){
        return (Math.PI * getdiametro());
    }
    public double getarea(){
        return (4 * Math.PI * Math.pow(radio, 2));
    }
    public double getvolumen(){
        return (4 * Math.PI * Math.pow(radio, 3))/3;
    }
}
