package decorator.factory.calculator;

// ������� ����������� ��������, ��� ������ Calculator. ����� Calculator �� ������ ���������.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        CalculatorView view = new CalculatorView(calculableFactory);
        view.run();
    }
}
