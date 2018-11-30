package br.com.lm.dao;

import Classes.br.com.lm.modelo.Item;

public interface ItemDao {

	public Item alimentarItem ();

    public Item criarItem();

	public Item buscarItem();

	public void alterarItem();

	public void excluirItem();

}
