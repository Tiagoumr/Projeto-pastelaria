package br.com.lm.dao;
import br.com.lm.modelo.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImplement implements ItemDao {
    
    private List<Item> itensList = new ArrayList<>();
    
    @Override
    public Item alimentarItem(){
         
        Item p = new Item();
        p.setNome("Carne");      
        p.setQtdMin(10);
        itensList.add(p);
      

        p = new Item();
        p.setNome("Queijo");
        p.setQtdMin(20);
        itensList.add(p);
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

    @Override
    public Item criarItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param itensList
     */
    public void setItensFinal(List<Item> itensList) {
        this.itensList = itensList;
    }

    @Override
    public List<Item> getItens() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 


}
