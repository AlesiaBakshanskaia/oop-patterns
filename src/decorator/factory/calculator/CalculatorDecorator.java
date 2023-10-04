package decorator.factory.calculator;

import decorator.factory.calculator.log.Loggable;

public class CalculatorDecorator implements Calculable{
    Calculable calculator;
    Loggable logger;

    public CalculatorDecorator(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Запрос на вычисление суммы чисел %d и %d: ", calculator.getResult(), arg));
        Calculable result = calculator.sum(arg);
        logger.log(String.format("Результат = %d", result.getResult()));
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Запрос на вычисление произведения чисел %d и %d: ", calculator.getResult(), arg));
        Calculable result = calculator.multi(arg);
        logger.log(String.format("Результат = %d", result.getResult()));
        return result;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
