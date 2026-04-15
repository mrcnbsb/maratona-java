package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro ao executar o ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Erro ao executar o IndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao executar o IllegalArgumentException");
        }catch(ArithmeticException e){
            System.out.println("Erro ao executar o ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Erro ao executar o RuntimeException");
        }

        try{
            talvezLanceException();
        } catch (SQLException e) {
            System.out.println("Erro ao executar o SQLException");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao executar o FileNotFoundException");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
