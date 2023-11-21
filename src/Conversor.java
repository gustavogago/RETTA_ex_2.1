public  class Conversor {

    //metodo para converter numeros em algarismos arabicos para romanos
    String converterArabicoParaRomano(int arabico) {

        //String em que o numero romano sera montado
        String romano = "";

        //Valores e simbolos que serão usados para fazer o calculo
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        //Estrutura para criar a String romano
        for (int i = 0; i < valores.length; i++) {
            while (arabico >= valores[i]) {
                romano += simbolos[i];
                arabico -= valores[i];

            }
        }

        return romano;
    }
    //metodo para converter numeros em algarismos romanos para arabicos
    int converterRomanoParaArabico(String romano) {

        // inteiro que ira auxiliar no calculo
        int aux;


        // inteiro em que o numero arabico sera montado
        int arabico = 0;

        // Caracter adcionado para evitar erros de indice
        romano += "Ç";

        // padronizando a String caso a entrada tenha letras minusculas
        romano = romano.toUpperCase();



        //Estrutura para montar o numero
        for (int i = 0; i <= romano.length()-1; i++) {
            aux = i + 1;
            if (romano.charAt(i) == 'M') {
                arabico += 1000;

            } else if (romano.charAt(i) == 'C' && romano.charAt(aux) == 'M') {
                arabico += 900;
                i++;
            } else if (romano.charAt(i) == 'D') {
                arabico += 500;
            } else if (romano.charAt(i) == 'C' && romano.charAt(aux) == 'D') {
                arabico += 400;
                i++;
            } else if (romano.charAt(i) == 'C') {
                arabico += 100;
            } else if (romano.charAt(i) == 'X' && romano.charAt(aux) == 'C') {
                arabico += 90;
                i++;
            } else if (romano.charAt(i) == 'L') {
                arabico += 50;
            } else if (romano.charAt(i) == 'X' && romano.charAt(aux) == 'L') {
                arabico += 40;
                i++;
            } else if (romano.charAt(i) == 'X') {
                arabico += 10;
            } else if (romano.charAt(i) == 'I' && romano.charAt(aux) == 'X') {
                arabico += 9;
                i++;
            } else if (romano.charAt(i) == 'V') {
                arabico += 5;
            } else if (romano.charAt(i) == 'I' && romano.charAt(aux) == 'V') {
                arabico += 4;
                i++;
            } else if (romano.charAt(i) == 'I') {
                arabico ++;
            }
        }


        return arabico;
    }

}



