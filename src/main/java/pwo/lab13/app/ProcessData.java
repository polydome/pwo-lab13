package pwo.lab13.app;

public class ProcessData {
    public enum Action {UNDEFINE, SUM, MAX}

    public Double process(Action action, double[] numbers) {
        if (numbers.length < 1) return null;
        switch (action) {
            case SUM:
                return sum(numbers);
            case MAX:
                return max(numbers);
            default:
                return null;
        }
    }

    /*

   Sumuje liczby przekazane jako tablica i zwraca wynik.

   Jeżeli tablica jest pusta, to zwraca null.
    */
    private Double sum(double[] numbers) {
        double sum = 0;
        for (double num : numbers)
            sum += num;
        return sum;
    }

    /*

   Przeszukuje przekazaną tablicę liczb i zwraca

   maksymalną. Jeżeli tablica jest pusta, to zwraca null.
    */
    private Double max(double[] numbers) {
        double largest = numbers[0];
        for (double number : numbers) largest = Math.max(number, largest);
        return largest;
    }
}