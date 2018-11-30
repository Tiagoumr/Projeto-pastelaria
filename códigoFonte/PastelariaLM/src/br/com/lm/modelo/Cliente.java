package Classes.br.com.lm.modelo;

public class Cliente {
	private long nome;
	private int codigo;
	private int cpf;
	private long endereco;
	private long cidade;
	private long estado;
	private long telefoneCelular;

    public long getNome() {
        return nome;
    }

    public void setNome(long nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public long getEndereco() {
        return endereco;
    }

    public void setEndereco(long endereco) {
        this.endereco = endereco;
    }

    public long getCidade() {
        return cidade;
    }

    public void setCidade(long cidade) {
        this.cidade = cidade;
    }

    public long getEstado() {
        return estado;
    }

    public void setEstado(long estado) {
        this.estado = estado;
    }

    public long getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(long telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }       
}
