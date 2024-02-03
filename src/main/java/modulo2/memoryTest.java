package main.java.modulo2;
import java.util.ArrayList;
class Student {
    public Student(int id) {
        String name = "harambe";
    }
    public static void main(String args[])
    {
        ArrayList lista = new ArrayList<>();
        int id = 1;
        try{
            while (id < 1000000000) {
                Student s1 = new Student(id);
                lista.add(s1);
                id++;
            }
        }
        finally {System.out.println(id);}
    }
}