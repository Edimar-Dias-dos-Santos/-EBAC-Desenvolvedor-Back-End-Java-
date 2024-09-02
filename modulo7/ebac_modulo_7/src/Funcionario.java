/**
 * Classe que representa um Funcionário com diversos atributos relacionados ao seu perfil.
 * Esta classe é um exemplo de como criar uma classe com múltiplos atributos em Java.
 *
 * @author Edimar
 */
public class Funcionario {


    private String nome;         // Nome completo do funcionário
    private String cpf;          // CPF do funcionário
    private int idade;           // Idade do funcionário
    private char sexo;           // Sexo do funcionário (M/F)

    // Atributos de contato
    private String email;        // E-mail do funcionário
    private String telefone;     // Telefone de contato do funcionário

    // Atributos profissionais
    private String cargo;        // Cargo atual do funcionário
    private double salario;      // Salário do funcionário
    private String departamento; // Departamento onde o funcionário trabalha

    // Atributos de endereço
    private String endereco;     // Endereço residencial do funcionário
    private String cidade;       // Cidade onde o funcionário reside
    private String estado;       // Estado onde o funcionário reside
    private String cep;          // CEP do endereço residencial do funcionário

    // Atributos de situação funcional
    private boolean ativo;       // Indica se o funcionário está ativo na empresa
    private String dataAdmissao; // Data de admissão do funcionário na empresa

    // Construtor da classe
    public Funcionario(String nome, String cpf, int idade, char sexo, String email, String telefone,
                       String cargo, double salario, String departamento, String endereco,
                       String cidade, String estado, String cep, boolean ativo, String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.ativo = ativo;
        this.dataAdmissao = dataAdmissao;
    }


    // Métodos getters e setters para acesso e modificação dos atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
