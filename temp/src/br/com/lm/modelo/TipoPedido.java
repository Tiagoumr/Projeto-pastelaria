package br.com.lm.modelo;

public enum TipoPedido {
    DELIVERY("Delivery"),
    ENCOMENDA("Encomenda"),
    BALCAO("Balcao");
    
    private final String descricao;
    
    private TipoPedido(String descricao) {
        this.descricao = descricao;
    }
       
    public String getDescricao() {
        return descricao;
    }
}
  