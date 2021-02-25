import org.jetbrains.annotations.NotNull;

public class Carro implements Comparable<Carro> {
    public String tipo;
    public String modelo;
    public String marca;
    public String cor;
    public Integer ano;

    public Carro(String tipo, String modelo, String marca, String cor, Integer ano) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }
    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    @Override
    public int compareTo(@NotNull Carro o) {
        return this.getAno()-getAno();
    }
}
