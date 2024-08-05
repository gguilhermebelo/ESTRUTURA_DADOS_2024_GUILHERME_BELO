public class Moto extends Veiculo{
    private String marca;
    private String nome;
    private double precoLavagem;

    public Moto(String placa, String tipo, String marca, String nome, double precoLavagem) {
        super(placa, tipo);
        this.marca = marca;
        this.nome = nome;
        this.precoLavagem = precoLavagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoLavagem() {
        return precoLavagem;
    }

    public void setPrecoLavagem(double precoLavagem) {
        this.precoLavagem = precoLavagem;
    }
}
