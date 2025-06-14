public class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public Calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public String dividir() {
        if (numeroDois == 0) {
            return "Impossível realizar uma divisão por zero.";
        } else {
            return String.valueOf(numeroUm / numeroDois);
        }
    }

    public double potencia() {
        if (numeroDois == 0) return 1;
        return Math.pow(numeroUm, numeroDois);
    }

    public String raizQuadrada() {
        if (numeroUm < 0) {
            return "Não existe raiz de número negativo.";
        } else {
            return String.valueOf(Math.sqrt(numeroUm));
        }
    }
}
