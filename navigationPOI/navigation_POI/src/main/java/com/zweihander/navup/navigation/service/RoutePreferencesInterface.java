/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zweihander.navup.navigation.service;
import com.zweihander.navup.navigation.domain.RoutePreferences;

/**
 *
 * @author Lindelo
 */
public interface RoutePreferencesInterface {
    
    public RoutePreferences getRoutePreferences(String username);
    public void setRoutePreferences(String username, boolean avoidTraffic, boolean avoidStairs, String modeOfTravel);
}
