public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("DEC6S18", "SUV", "Honda", "HR-V", 100.00);
        Moto moto = new Moto("HPF-9763", "touring", "BMW", "BMW K 1600 Bagger", 70.00);
        Cliente cliente = new Cliente("Guilherme ", "Ouro");
        Cliente cliente2 = new Cliente("Allan ", "Bronze");
        Funcionario funcionario = new Funcionario(29, "Marcos", "Lavador ");

        double precoCarro = carro.getPrecoLavagem();
        double precoMoto = moto.getPrecoLavagem();
        double total = precoCarro + precoMoto;

        System.out.println("O cliente " + cliente.getNome() + cliente.pagar() + "pela lavagem do " + "seu carro " + carro.getnome()  + " do tipo " + carro.getTipo() + " da marca " + carro.getMarca() + ".");
        System.out.println("O cliente " + cliente2.getNome() + cliente2.pagar() + "pela lavagem da " + "sua moto " + moto.getNome()  + " do tipo " + moto.getTipo() + " da marca " + moto.getMarca() + ".");

        System.out.println("Total arrecadado: R$ " + total);
    }
}
