package com.br;

import java.util.HashMap;
import java.util.Map;

public class WalletApplicationJAXRS extends javax.ws.rs.core.Application{
	
	@Override
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages",
                       "com.br.resources");
        return properties;
    }

}
