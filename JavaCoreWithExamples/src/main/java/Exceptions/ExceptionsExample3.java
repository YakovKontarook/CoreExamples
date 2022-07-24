package Exceptions;

public class ExceptionsExample3 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
