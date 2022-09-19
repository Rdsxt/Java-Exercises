import javax.swing.*;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;

    public Paciente(){

    }

    public Paciente(String n, String r, String e, String t, int aN, String p){
        nome = n;
        rg = r;
        endereco = e;
        telefone = t;
        anoNascimento = aN;
        profissao = p;
    }

    public void cadastraDados(){
        nome = JOptionPane.showInputDialog("Nome: ");
        rg = JOptionPane.showInputDialog("RG: ");
        endereco = JOptionPane.showInputDialog("Endereço ");
        telefone = JOptionPane.showInputDialog("Telefone: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento: "));
        profissao = JOptionPane.showInputDialog("Profissão: ");
    }

    public void imprimeDados(){
        String dados = "Nome: " +nome + "\n" +
        "RG: " +rg + "\n" +
        "Endereço: " +endereco + "\n" +
        "Telefone: " +telefone + "\n" +
        "Ano de Nascimento: " +anoNascimento + "\n" +
        "Profissão: " +profissao + "\n";

        JOptionPane.showMessageDialog(null, dados);
    }

    public int calculaIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }
}
