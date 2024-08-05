public class Carro extends Veiculo{
    private String marca;
    private String nome;
    private double precoLavagem;

    public Carro(String placa, String tipo, String marca, String nome, double precoLavagem) {
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


    
    public String getnome() {
    return nome;
    }

    public void setnome(String nome) {
    this.nome = nome;
    }

    public double getPrecoLavagem() {
    return precoLavagem;
    }

    public void setPrecoLavagem(double precoLavagem) {
    this.precoLavagem = precoLavagem;
    }
}
    