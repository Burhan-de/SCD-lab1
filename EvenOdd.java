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
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.display(7);
    }
}