package br.com.ghlabs;

import java.util.HashMap;
import java.util.Map;

public class ApplicationJAXRS 
	extends javax.ws.rs.core.Application{
	
	@Override
    public Map<String, Object> getProperties()
    {
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages",
                       "br.com.ghlabs.resources");
        return properties;
    }

}
