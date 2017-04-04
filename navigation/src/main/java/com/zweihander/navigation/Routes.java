package com.zweihander.navigation;

import java.util.LinkedList;


public class Routes {
    
    public LinkedList<Route> routes;
    
    Routes() {
        routes = new LinkedList<>();
    }
    
    public void addRoute(Route inR) {
        routes.push(inR);
    }
    
    public void modifyRoute(Route inR) {
        routes.forEach(route -> {
            if(route.name.matches(inR.name)) {
                route = inR;
                return;
            }
        });        
    }
    
    public void removeRoute(Route inR) {
        routes.remove(inR);
    }
}
