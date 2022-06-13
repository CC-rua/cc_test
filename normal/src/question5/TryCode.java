package question5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCode {

    public static int fileTry() {
        System.out.println("A");
        try  {
            System.out.println("C");
            throw new IOException();
        } catch (FileNotFoundException e) {
            System.out.println("D");
        } catch (IOException e) {
            System.out.println("E");
            return -1;
        }finally {
            System.out.println("F");
            return -2;
        }
    }

    public static void main(String[] args) {
        int i = fileTry();
        System.out.println("i = " + i);
    }
}
