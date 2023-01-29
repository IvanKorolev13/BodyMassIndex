public class BodyMassIndex {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 180; //рост в см
        int weight = 100; //вес в кг
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}
