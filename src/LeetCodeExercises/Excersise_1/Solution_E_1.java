package LeetCodeExercises.Excersise_1;

public class Solution_E_1 {

    public String MySolution(String[] words, int[] weights) {
        //vector que guardara los resultados
        int[] resultado = new int[words.length];

        //recorrido para el vector de palabras
        for(int i = 0; i < words.length; i++){

            //saco la palabra en la posicion i
            String cadena = words[i];

            //recorro la palabra de la posicion i
            for(int j=0; j < cadena.length(); j++){

                //sumo y guardo los resultados en el vector de resultado
                resultado[i] = resultado[i] + weights[(cadena.charAt(j)-'a')];
            }
        }

        String cadenaFinal = "";
        //obtengo los modulos %26 de los resultados
        for(int i= 0; i< resultado.length;i++){
            char letraFinal = (char) ('z' - resultado[i]%26);
            cadenaFinal = cadenaFinal + letraFinal;
        }
        return cadenaFinal;
    }

    public String Solution(String[] words, int[] weights) {
        String cadenaFinal = "";
        for(int i = 0; i < words.length; i++){
            int peso = 0;
            for(int j = 0; j < words[i].length(); j++){
                peso += weights[(words[i].charAt(j) - 'a')];
            }
            cadenaFinal += (char)('z' - peso % 26);
        }

        return cadenaFinal;
    }
}
