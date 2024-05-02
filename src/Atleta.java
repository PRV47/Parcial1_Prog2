public class Atleta extends Persona implements Contrato {
    double altura;
    int edad;
    double peso;

    public Atleta(String nombre, int dni, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calculaIMC() {
        return peso / (Math.pow(altura, 2));
    }

    @Override
    public boolean hayPesoExtra() {
        double imc = calculaIMC();
        if (imc < 18.5) {
            return false; // Insuficiente
        } else if (imc <= 24.9) {
            return false; // Normal
        } else if (imc <= 29.9) {
            return true; // Sobrepeso
        } else {
            return true; // Obesidad
        }
    }

    public String obtenerSobrepeso() {
        return hayPesoExtra() ? "Si" : "No";
    }

    @Override
    public double tomarPulsaciones() {
        return 1;
    }
}
