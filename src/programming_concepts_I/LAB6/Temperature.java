package programming_concepts_I.LAB6;

public class Temperature {
    private double ftemp; // Holds Fahrenheit temperature

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFtemp() {
        return ftemp;
    }

    public void setFtemp(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getCelsius() {
        return fahrenheitTo("Celsius");
    }

    public double getKelvin() {
        return fahrenheitTo("Kelvin");
    }

    private double fahrenheitTo(String tempScale) {
        double conversion;
        conversion = switch (tempScale) {
            case "Celsius" -> (5/9.0) * (ftemp - 32);
            case "Kelvin" -> ((5/9.0) *(ftemp - 32)) + 273;
            default -> ftemp * 1.2 + 32;
        };
        return conversion;
    }
}
