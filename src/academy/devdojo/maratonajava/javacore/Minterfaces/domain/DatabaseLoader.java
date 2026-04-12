package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader  implements DataLoader,  DataRemover {
    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Loading Data from Database");
    }

    @Override
    public void remove() {
        System.out.println("Removing Data from Database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission Data from Database");
    }

    public static void retrieveMaxDataSized(){
        System.out.println("Retrieving Max Data Sized  from Database");
    }
}
