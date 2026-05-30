//Generic class Storage with data of type T, method to set and get data...

class Storage<T> {
    T data;

    void setStorage(T data) {
        this.data = data;
    }

    void getStorage() {
        System.out.println(data);
    }

}

public class GenericStorage {
    public static void main(String[] args) {
        Storage<Integer> S1 = new Storage<>();
        S1.setStorage(40);
        S1.getStorage();

        Storage<String> S2 = new Storage<>();
        S2.setStorage("Paresh Patil");
        S2.getStorage();
    }

}
