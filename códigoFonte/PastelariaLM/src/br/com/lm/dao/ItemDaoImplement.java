package br.com.lm.dao;
import br.com.lm.modelo.Item;
import java.util.List;

public class ItemDaoImplement implements ItemDao {
    
    @Override
    public void alimentarItem(){
        List<Item> itens;
    
        Item p = new Item();
        p.setNome("Carne");      
        p.setQtdMin(10);
        itens.add(p);
      

        p = new Item();
        p.setNome("Queijo");
        p.setQtdMin(20);
        itens.add(p);
	
        public Item criarItem() {
            return null;
	}

    @Override
    public Item buscarItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

	/**
	 * @see Classes.br.com.lm.dao.ItemDao#buscarItem()
	 * 
	 *  
	 */
	public Item buscarItem() {
		return null;
	}


	/**
	 * @see Classes.br.com.lm.dao.ItemDao#alterarItem()
	 */
	public void alterarItem() {

	}


	/**
	 * @see Classes.br.com.lm.dao.ItemDao#excluirItem()
	 * 
	 *  
	 */
	public void excluirItem() {

	}

}
