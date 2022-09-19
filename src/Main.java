import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       Paciente paciente1 = new Paciente();
       Paciente paciente2 = new Paciente("Rogério", "12345", "Rua Alvorada", "1234567", 1955, "Advogado");
       int idade;

       paciente2.cadastraDados();
       idade = paciente2.calculaIdade(2022);
       paciente2.imprimeDados();
       JOptionPane.showMessageDialog(null, "Idade: "+ idade);
    }
}
