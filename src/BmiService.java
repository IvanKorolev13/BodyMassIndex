public class BmiService {
    public int calculate(int height, int mass) {
        int index = mass * 10000/ (height * height); //ИМТ = масс в кг/ квадрат роста в метрах,
                                        // идеально использовать не целоечисленый тип, чтобы был результат с десятичными и сотыми
        return index;
    }
}
