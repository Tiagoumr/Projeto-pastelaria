package br.com.lm.dao;

import br.com.lm.modelo.Produto;
import java.util.List;

public interface PedidoDao {
         
    public  List<Produto> pesquisarPorNome(String nome);
       
}
