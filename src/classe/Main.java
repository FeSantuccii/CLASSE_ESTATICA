package classe;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de ConversorUnidades que implementa Conversor
        Conversor conversor = new ConversorUnidades();
        
        //TESTE CELSIUS PARA FAHRENHEIT
        double celsius = 25.0;
        double fahrenheit = conversor.celsiusParaFahrenheit(celsius);
        System.out.printf("%.2f°C em Fahrenheit é: %.2f°F%n", celsius, fahrenheit);

        //TESTE KM PARA MILHAS
        double quilometros = 10.0;
        double milhas = conversor.quilometrosParaMilhas(quilometros);
        System.out.printf("%.2f km em Milhas é: %.2f milhas%n", quilometros, milhas);

        //TESTE GRAMAS PARA LIBRAS
        double gramas = 500.0;
        double libras = conversor.gramasParaLibras(gramas);
        System.out.printf("%.2f g em Libras é: %.2f lbs%n", gramas, libras);
    }
}