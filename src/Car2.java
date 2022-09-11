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
//
//    public int getGodvypuska() {
//        return godvypuska;
//    }
//
//    public void setGodvypuska(int godvypuska) {
//        this.godvypuska = godvypuska;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getSena() {
//        return sena;
//    }
//
//    public void setSena(int sena) {
//        this.sena = sena;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    @Override
    public String toString() {
        return "Car2{" +
                "godvypuska=" + godvypuska +
                ", model='" + model + '\'' +
                ", sena=" + sena +
                ", color='" + color + '\'' +
                '}';
    }
}
