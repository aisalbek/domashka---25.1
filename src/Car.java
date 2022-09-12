public class Car {
    int id;
    int nomermashiny;
    public Car(int id, int nomermashiny) {
        this.id = id;
        this.nomermashiny = nomermashiny;
    }
    @Override
    public String toString() {
        return "Car->" +
                "id " + id +
                "nomermashiny " + nomermashiny ;
    }
}
