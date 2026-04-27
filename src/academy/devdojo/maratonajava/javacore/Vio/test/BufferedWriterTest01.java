package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) { //try with resources, não precisa fechar o arquivo
            bw.write("O DevDojo é lindo, é o melhor curso do Brasillllllll.\nContinuando a cantoria na próxima linha..\n");
            bw.newLine();
            bw.flush(); //limpa o buffer
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
