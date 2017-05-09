/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zweihander.navup.navigation.service;
import com.zweihander.navup.navigation.domain.RoutePreferences;
import org.springframework.beans.factory.annotation.Autowired;
import com.zweihander.navup.navigation.repository.RoutePreferencesRepository;

/**
 *
 * @author Lindelo
 */
public class RoutePreferencesService implements RoutePreferencesInterface {
    
    
    @Autowired
    RoutePreferencesRepository routePreferencesRepository;
    
    @Override
    public RoutePreferences getRoutePreferences(String username){
      return routePreferencesRepository.getRoutePreferences(username);
    }
    
    @Override
    public void setRoutePreferences(String username, boolean avoidTraffic, boolean avoidStairs, String modeOfTravel){
      routePreferencesRepository.setRoutePreferences(username, avoidTraffic, avoidStairs, modeOfTravel);
    }
    
}
