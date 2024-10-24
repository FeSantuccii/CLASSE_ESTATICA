package classe;

// Classe que implementa a interface Conversor
public class ConversorUnidades implements Conversor {

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371;
    }

    @Override
    public double gramasParaLibras(double gramas) {
        return gramas * 0.00220462;
    }
}