
import java.util.HashMap;
import java.util.Map;

public class Conversor {

    private static final Map<Character, Integer> VALORES_ROMANOS = new HashMap<>();
    static {
        VALORES_ROMANOS.put('I', 1);
        VALORES_ROMANOS.put('V', 5);
        VALORES_ROMANOS.put('X', 10);
        VALORES_ROMANOS.put('L', 50);
        VALORES_ROMANOS.put('C', 100);
        VALORES_ROMANOS.put('D', 500);
        VALORES_ROMANOS.put('M', 1000);
    }

    // Método para converter números em algarismos arábicos para romanos
    public String converterArabicoParaRomano(int arabico) {
        String romano = "";
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < valores.length; i++) {
            while (arabico >= valores[i]) {
                romano += simbolos[i];
                arabico -= valores[i];
            }
        }

        return romano;
    }

    // Método para converter números em algarismos romanos para arábicos
    public int converterRomanoParaArabico(String romano) {
        int arabico = 0;
        romano = romano.toUpperCase();

        for (int i = 0; i < romano.length(); i++) {
            int valorAtual = VALORES_ROMANOS.get(romano.charAt(i));

            if (i + 1 < romano.length()) {
                int proximoValor = VALORES_ROMANOS.get(romano.charAt(i + 1));
                if (valorAtual < proximoValor) {
                    arabico += proximoValor - valorAtual;
                    i++; // Avançar o índice extra para o próximo par
                } else {
                    arabico += valorAtual;
                }
            } else {
                arabico += valorAtual;
            }
        }

        return arabico;
    }
}
