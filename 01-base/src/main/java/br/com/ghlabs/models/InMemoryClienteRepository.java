package br.com.ghlabs.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryClienteRepository 
implements ClienteRepository{

	final static List<Cliente> clientes = new ArrayList<Cliente>();
	
	static{
		
		clientes.add(new Cliente());
		clientes.get(0).setId(1);
		clientes.get(0).setNome("Maria");
		clientes.get(0).setIdade(29);
	}
	
	@Override
	public List<Cliente> obterTodos() {
		return clientes;
	}

	@Override
	public void adicionar(Cliente cliente) {
		clientes.add(cliente);
		
	}

	@Override
	public Cliente obterPorId(int id) {
		
		Cliente cliente = clientes.stream()
							 	  .filter(c -> c.getId() == id )
							 	  .findFirst()
							 	  .orElse(null);
		
		return cliente;
	}

	@Override
	public void remover(int id) {
		Cliente cliente = clientes.stream()
			 	  .filter(c -> c.getId() == id )
			 	  .findFirst()
			 	  .orElse(null);
		
		if( cliente != null )
			clientes.remove(cliente);
		
	}

	@Override
	public void atualizar(Cliente cliente) {
		Cliente original = clientes.stream()
			 	  .filter(c -> c.getId() == cliente.getId() )
			 	  .findFirst()
			 	  .orElse(null);
		
		if( original != null )
		{
			original.setNome(cliente.getNome());
			original.setId(cliente.getIdade());
		}
	}

	
	
	
}
