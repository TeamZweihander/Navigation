/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zweihander.navup.navigation.repository;
import com.zweihander.navup.navigation.domain.RoutePreferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindelo
 */

@Repository
public interface RoutePreferencesRepository extends JpaRepository<RoutePreferences, Long> {
    
    public RoutePreferences getRoutePreferences(String username);
    public void setRoutePreferences(String username, boolean avoidTraffic, boolean avoidStairs, String modeOfTravel);
}
