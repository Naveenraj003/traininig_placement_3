interface Operation {
    int calculate(int a, int b);
}

class LambdaDemo {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;

        System.out.println("Addition: " + add.calculate(10, 20));
        System.out.println("Multiplication: " + mul.calculate(10, 20));
    }
}
