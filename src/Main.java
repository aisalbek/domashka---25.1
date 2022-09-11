import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Car,Car2>hashMap=new HashMap<>();
        hashMap.put(new Car(1,123),new Car2(2018,"Hundai solaris",1000000,"whait"));
        hashMap.put(new Car(2,345),new Car2(2021,"Tesla",5000000,"blu"));
        hashMap.put(new Car(3,678),new Car2(2020,"Tayota camri",3000000,"black"));
        for (HashMap.Entry elements :hashMap.entrySet()) {
            System.out.println(elements.getKey()+""+elements.getValue());
        }
    }
}