package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading Data from File");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from File");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission Data from File");
    }
}
