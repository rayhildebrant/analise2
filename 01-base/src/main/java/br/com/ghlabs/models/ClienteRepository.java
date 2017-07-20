package br.com.ghlabs.models;
import java.util.List;
import br.com.ghlabs.models.Cliente;


public interface ClienteRepository {
	public List<Cliente> obterTodos();	
	public void adicionar(Cliente cliente);
	public Cliente obterPorId(int id);
	public void remover(int id);
	public void atualizar(Cliente cliente);
}
