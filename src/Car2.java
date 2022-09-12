public class Car2 {
    int godvypuska;
    String model;
    int sena;
    String color;

    public Car2(int godvypuska, String model, int sena, String color) {
        this.godvypuska = godvypuska;
        this.model = model;
        this.sena = sena;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car2->" +
                "godvypuska " + godvypuska +
                "model " + model +
                "sena " + sena +
                "color " + color ;
    }
}
