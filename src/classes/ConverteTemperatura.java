package classes;

public class ConverteTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelcius = 23.0;
        double temperaturaEmF = (temperaturaEmCelcius * 1.8) + 32;
        int temperaturaInteriraEmF = (int) temperaturaEmF;
        System.out.println("temperaturaEmCelcius: " + temperaturaEmCelcius);
        System.out.println("temperaturaEmF: " + temperaturaEmF);
        System.out.println("temperaturaInteriraEmF: " + temperaturaInteriraEmF);

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelcius, temperaturaEmF);
        System.out.println(mensagem);
    }
}
