package com.br.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import com.br.models.Cliente;
import com.br.repository.ClienteRepository;

@Path("/clientes")
public class ClienteResource {
	@Autowired
	private ClienteRepository repository;
	
	
	@GET
	@Produces("application/json")
	public List<Cliente> mostrar(){
		return repository.obterTodos();
	}
	
	@GET
	@Produces("application/json")
	@Path("/{id}")
	public Cliente mostrar(@PathParam("id") int id){
		return repository.obterPorId(id);
	}
		
	@POST
	@Consumes("application/json")
	public Response criar(Cliente cliente)
	{
		
		repository.adicionar(cliente);
		URI url = UriBuilder.fromPath("clientes/{id}")
						    .build(cliente.getId());
		
		return Response.created(url)
					   .entity(cliente)
					   .build();
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	public void apagar(@PathParam("id") int id )
	{
		repository.remover(id);
	}
	
	
	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	public void apagar(Cliente cliente )
	{
		repository.atualizar(cliente);
	}	
}
