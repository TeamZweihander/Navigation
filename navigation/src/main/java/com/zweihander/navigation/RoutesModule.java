package com.zweihander.navigation;

import com.zweihander.navigation.Response_Request.*;

public class RoutesModule {
    
    private Routes routes;
    
    RoutesModule() {
        this.routes = new Routes();
    }
    
    public Response getRoute(getRouteRequest inR) {
        
        routes.routes.push(inR.route);
        
        
        return new Response();
    }
}
