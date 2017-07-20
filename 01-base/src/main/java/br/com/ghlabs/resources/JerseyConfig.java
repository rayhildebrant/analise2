package br.com.ghlabs.resources;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig(){
		register(ClienteResource.class);
	}
}
