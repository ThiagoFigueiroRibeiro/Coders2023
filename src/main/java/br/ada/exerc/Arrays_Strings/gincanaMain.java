package main.java.br.ada.exerc.Arrays_Strings;

public class gincanaMain {
    public static String[] elementos(String[] input) {
        String[] resposta = {};
        for (int i = 0; i < input.length;i++){
            for (int j = 0; j < input.length;j++){
                    if(input[j].contains(input[i]) && input[i]!= input[j] ) {
                        //System.out.println(input[i]);
                        String[] newArray = new String[resposta.length + 1];
                        System.arraycopy(resposta, 0, newArray, 0, resposta.length);
                        newArray[resposta.length] = input[i];
                        resposta = newArray;
                        break;
                    }
            }
        }

        int n = resposta.length;
        String[] uniqueStrings = new String[n];
        boolean[] seenStrings = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            String currentString = resposta[i];
            boolean seen = false;

            for (int j = 0; j < count; j++) {
                if (uniqueStrings[j].equals(currentString)) {
                    seen = true;
                    break;
                }
            }

            if (!seen) {
                uniqueStrings[count++] = currentString;
            }
        }

        String[] resultArray = new String[count];
        System.arraycopy(uniqueStrings, 0, resultArray, 0, count);
        for (String k: resultArray){
            System.out.println(k);
        }
        return resultArray;

    }

    public static void main(String[] args){
        String[] entrada = {"lovour",
                "ovo",
                "lov",
                "paixão",
                "caixão",
                "xão"};
        System.out.println(elementos(entrada));
    }
}
