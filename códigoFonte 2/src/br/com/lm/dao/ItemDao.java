package br.com.lm.dao;

import br.com.lm.modelo.Item;
import java.util.List;

public interface ItemDao {
        
    public List<Item> getItens();
        
	public void alimentarItem ();

        public Item criarItem();

//	public void alterarItem();

//	public void excluirItem();

    public Item buscarItem(String nome);

}
