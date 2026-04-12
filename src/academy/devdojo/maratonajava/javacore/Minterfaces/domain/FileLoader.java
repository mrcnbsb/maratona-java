package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading Data from File");
    }
}
