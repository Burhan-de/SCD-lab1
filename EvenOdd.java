class EvenOdd {

    boolean isEven(int n) {
        return n % 2 == 0;
    }

    void display(int n) {
        if (isEven(n)) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        checkNumber(n);
    }

    void checkNumber(int n) {
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.display(7);
        obj.display(-4);
        obj.display(0);
    }
}
