package modelo;
public class Funcionario {
     private int id;
    private String nome;
    private String rua;
    private String CPF;
    private String tel;
    private String bairro;
    private String cidade;
    private String numero; //residencia

    public Funcionario() {}
    
    public Funcionario(int id, String nome, String rua, String CPF,
            String tel, String bairro, String cidade, String numero) {
                this.id = id;
		this.nome = nome;
                this.rua = rua;
                this.CPF = CPF;
                this.tel = tel;
                this.bairro = bairro;
                this.cidade = cidade;
                this.numero = numero;
		
	}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
