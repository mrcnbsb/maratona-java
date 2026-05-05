package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta"); // = new File("pasta");
        if (Files.notExists(pastaPath)) {
            System.out.println("entrei no if1");
            Path pastaDirectory = Files.createDirectory(pastaPath); //createDirectory -> um diretório
        }

        Path pastaPath2 = Paths.get("pasta");
        if(Files.notExists(pastaPath2)){
            System.out.println("entrei no if2");
            Path pastaDirectory = Files.createDirectories(pastaPath2);
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta"); // se a pasta pai não existir ele cria
        Path subPastaDirectory = Files.createDirectories(subPastaPath); // createDirectories -> um ou mais de um diretório

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt"); // criar arquivo
        if (Files.notExists(filePath)){
            System.out.println("entrei no if3");
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath; // origem do arquivo "file.txt" que será copiado
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt"); // destino do arquivo cópia
        Files.copy(source, target,  StandardCopyOption.REPLACE_EXISTING); // copia a orgiem

        Path source2 = Paths.get("arquivo\\teste.txt");
//        System.out.println(source2.getParent());
        Path target2 = Paths.get("C:\\Users\\55619\\Documents\\DevDojo\\maratona-java\\home\\william\\dev".toString(), "arquivo.txt");
        Files.copy(source2, target2,  StandardCopyOption.REPLACE_EXISTING);
    }
}
