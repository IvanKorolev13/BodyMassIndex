public class BmiService {
    public int calculate(int h, int m) {
        int index = m * 10000/ (h * h); //ИМТ = масс в кг/ квадрат роста в метрах,
                                        // идеально использовать не целоечисленый тип, чтобы был результат с десятичными и сотыми
        return index;
    }
}
