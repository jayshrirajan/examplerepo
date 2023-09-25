package example.com;
import java.util.Scanner;

class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class complexno{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ComplexNumber complexNumber1 = new ComplexNumber(a, b);
        ComplexNumber complexNumber2 = new ComplexNumber(c, 0);

        ComplexNumber sum1 = complexNumber1.add(complexNumber2);
        ComplexNumber sum2 = sum1.add(complexNumber1);

        System.out.println(complexNumber1);
        System.out.println(sum1);
        System.out.println(sum2);
       
       
    }
}