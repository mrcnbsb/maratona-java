package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\55619\\Documents\\DevDojo\\maratona-java\\arquivo\\file.txt");
        File file = new File("file.txt"); // até aqui só se criou o objeto da classe File
        File file2 = new File("file2.txt");
        try {
//            boolean isDeleted = file.delete();
//            System.out.println(isDeleted);
            boolean isCreated = file.createNewFile();
            file2.createNewFile();
            System.out.println("file2_path: "+file2.getPath());
            System.out.println("file2_path: "+file2.getAbsolutePath());
            System.out.println(System.getProperty("user.dir"));
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path "+file.getAbsolutePath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("is hidden "+file.isHidden());
            System.out.println("last modified "+new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted "+file.delete());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
