public class Funcionario {
    private int matricula;
    private String nome;
    private String cargo;
    
    
    public Funcionario(int matricula, String nome, String cargo) {
    this.matricula = matricula;
    this.nome = nome;
    this.cargo = cargo;
    }
    
    
    public int getMatricula() {
    return matricula;
    }
    
    public void setmatricula(int matricula) {
    this.matricula = matricula;
    }
    
    public String getNome() {
    return nome;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }
    
    public String getCargo() {
    return cargo;
    }
    
    public void setCargo(String cargo) {
    this.cargo = cargo;
    }
    
    public void Trabalhar(){
    System.out.println("está trabalhando");
    }
    }
    
    