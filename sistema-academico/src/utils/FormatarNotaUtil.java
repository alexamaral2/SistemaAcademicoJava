package utils;

import java.util.Map;

public abstract class FormatarNotaUtil {

    public static String formatarNotas(Map<Integer, Double> notas) {
        String texto = "";
        int i = 0;
        int total = notas.size();

        for (Integer bimestre : notas.keySet()) {
            texto += "Bimestre " + bimestre + ": " + notas.get(bimestre);
            if (i < total - 1) {
                texto += " | ";
            }
            i++;
        }

        return texto;
    }

}
