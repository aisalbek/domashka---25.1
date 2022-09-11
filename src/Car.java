public class Car {
    int id;
    int nomermashiny;

    public Car(int id, int nomermashiny) {
        this.id = id;
        this.nomermashiny = nomermashiny;
    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getNomermashiny() {
//        return nomermashiny;
//    }
//
//    public void setNomermashiny(int nomermashiny) {
//        this.nomermashiny = nomermashiny;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomermashiny=" + nomermashiny +
                '}';
    }
}
