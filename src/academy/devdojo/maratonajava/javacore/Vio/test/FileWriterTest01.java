package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);) { //try with resources, não precisa fechar o arquivo
            fw.write("O DevDojo é lindo, é o melhor curso do Brasillllllll.\nContinuando a cantoria na próxima linha..\n");
            fw.flush(); //limpa o buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
