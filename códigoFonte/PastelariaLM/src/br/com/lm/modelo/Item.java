package Classes.br.com.lm.modelo;

import java.util.List;

public class Item {

//	private int codigoItem;

	private int codigoItem;
    private String nome;
	private double qtdMin;
	private double saldo;
    private double porcao;
    
    List<Item> itens; //POR QUÊ NÃO DECLARA O MOD DE ACESSO?   
    
   	public double verificarSaldoItens(String nome) {      
        Item p = BuscarItem(nome); //Controlador
        return p.getSaldo();
    }
    
    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public int getNome() {
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
        
}
