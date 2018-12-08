package br.com.lm.dao;
import br.com.lm.modelo.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImplement implements ItemDao {
    
    private final List<Item> itens = new ArrayList<>();
    
    @Override
    public void alimentarItem(){         
        Item p = new Item();
        p.setNome("Carne");      
        p.setQtdMin(10);
        itens.add(p);
      
        p = new Item();
        p.setNome("Queijo");
        p.setQtdMin(20);
        itens.add(p);        
    }
	
    @Override
    public Item buscarItem(String nome) {
        for (Item i : itens) {
            if (i.getNome().equals(nome)) {
                return i;           
        } else{
            System.out.println("item não encontrado");
            }
        }
        return null;    
    }
        
    @Override
    public List<Item> getItens() {
        return itens;
    }

    @Override
    public Item criarItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
