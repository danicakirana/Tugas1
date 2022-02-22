package Tugas1;


public class Konversi {
    
    double Celcius;

    public Konversi(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double Fahrenheit(){
        return (Celcius*1.8+32);
    }
    double Reamur(){
        return (Celcius*0.8);
    }
    double Kelvin(){
        return (Celcius+273.15);
    }
    

}
