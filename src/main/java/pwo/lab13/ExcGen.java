package pwo.lab13;

public class ExcGen {
    public static final String MESSAGE_1 = "i=0", MESSAGE_2 = "i=1", MESSAGE_3 = "i=2";

    public int gen(int i) {
        switch (i) {
            case 0:
                throw new IllegalStateException(MESSAGE_1);
            case 1:
                throw new IllegalArgumentException(MESSAGE_2);
            case 3:
                throw new NullPointerException(MESSAGE_3);
        }
        return 100;
    }
}