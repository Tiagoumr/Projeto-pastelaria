package br.com.lm.modelo;

public class Item {

	private int codigoItem;
        private String nome;
        
	private double qtdMin;
	private double saldo;
        private double porcao;
    
         
    
   public double verificarSaldoItens(String nome) {      
        Item p = BuscarItem(nome); //Controlador
        return p.getSaldo();
    }
    
    private Item BuscarItem(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(double qtdMin) {
        this.qtdMin = qtdMin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Item{" + "codigoItem=" + codigoItem + ", nome=" + nome + ", qtdMin=" + qtdMin + ", saldo=" + saldo + ", porcao=" + porcao + '}';
    }
        
}
