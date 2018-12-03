package br.com.lm.dao;

import br.com.lm.modelo.Item;
import java.util.List;

public interface ItemDao {
        
        public List<Item> getItens();
        
	public Item alimentarItem ();

        public Item criarItem();

	public Item buscarItem();

	public void alterarItem();

	public void excluirItem();

}
