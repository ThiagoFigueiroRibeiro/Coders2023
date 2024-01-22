package main.java.br.ada.aula8;

public class SwitchCase {
    public static void main(String[] args) {
        int testscore = 50;
        char grade = 0;

        switch (testscore) {
            case 70,71,72,73,74,75,76,77 ->  grade ='C';
            case 80 -> {
                if(testscore >= 80) grade = 'A';
            }
            default -> grade= 'G';
        }
        System.out.println("Grade = " + grade);
    }
}