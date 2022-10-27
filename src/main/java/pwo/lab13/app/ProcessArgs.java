package pwo.lab13.app;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import pwo.lab13.app.ProcessData.Action;

public class ProcessArgs {
    /*

    Wyszukuje w tablicy stringów pozycję, która może być

    zinterpretowana jako wartość typu ProcessData.Action.

    Wielkość czcionki nie ma znaczenia. Obowiązuje

    pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca

    wartość UNDEFINE.
     */
    public static Action getAction(String[] args) {
        String[] lowerCaseArgs = Arrays.stream(args)
                .map(String::toLowerCase)
                .toArray(String[]::new);

        for (String arg : lowerCaseArgs) {
            switch (arg) {
                case "max":
                    return Action.MAX;
                case "sum":
                    return Action.SUM;
            }
        }
        return Action.UNDEFINE;
    }

    /*

   Wyszukuje w tablicy stringów pozycje, które mogą być

   zinterpretowane jako liczby. Tworzy z tych liczb

   tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
    */
    public static double[] getNumbers(String[] args) {
        return Arrays.stream(args)
                .map(ProcessArgs::toDoubleOrNull)
                .filter(ProcessArgs::isNotNull)
                .mapToDouble((boxed) -> boxed)
                .toArray();
    }

    private static Double toDoubleOrNull(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static boolean isNotNull(Double value) {
        return value != null;
    }
}