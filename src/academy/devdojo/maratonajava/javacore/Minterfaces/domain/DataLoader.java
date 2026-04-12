package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    public abstract void load(); // todos os métodos em interfaces são public e abstract

    default void checkPermission(){
        System.out.println("Checking permission");
    }

    public static void retrieveMaxDataSized(){
        System.out.println("Retrieving Max Data Sized");
    }
}
