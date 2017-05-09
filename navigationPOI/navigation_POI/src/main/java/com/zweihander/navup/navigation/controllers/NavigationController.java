package com.zweihander.navup.navigation.controllers;

import java.util.LinkedList;
import java.util.List;

import com.zweihander.navup.navigation.domain.POI;
import com.zweihander.navup.navigation.domain.RoutePreferences;
import com.zweihander.navup.navigation.service.NavigationService;
import com.zweihander.navup.navigation.service.RoutePreferencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class NavigationController
{
    @Autowired
    NavigationService navigationService;
    
    @Autowired
    RoutePreferencesService rfs;

    @RequestMapping(value ="/addPOI", method = RequestMethod.POST)
    public ResponseEntity addLocation(POI poi) {
            navigationService.addPOI(poi);
            return ResponseEntity.ok("POI added to database");
    }

    @RequestMapping(value = "/modifyPOI", method = RequestMethod.PUT)
    public ResponseEntity modifyLocation(POI poi){
        navigationService.modifyPOI( poi);
        return ResponseEntity.ok("POI modified");
    }

    @RequestMapping(value = "/removePOI", method = RequestMethod.DELETE)
    public ResponseEntity removeLocation(POI poi){
        navigationService.deletePOI(poi);
        return ResponseEntity.ok("POI deleted");
    }

    @RequestMapping(value = "/getPOI", method = RequestMethod.GET)
    public ResponseEntity getPOI(POI poi){
        navigationService.getPOI(poi.getUsername(), poi.getLongitude(), poi.getLatitude());
        return ResponseEntity.ok("retrieved POI");
    }
    
    @RequestMapping(value ="/setRoutePreferences", method = RequestMethod.POST)
    public ResponseEntity setRoutePreference(RoutePreferences rf) {
            rfs.setRoutePreferences(rf.getUsername(), rf.getavoidTraffic(), rf.getAvoidStairs(), rf.gettmodeOfTravel());
            return ResponseEntity.ok("Route preference added to database");
    }
    
    @RequestMapping(value ="/getRoutePreferences", method = RequestMethod.GET)
    public ResponseEntity getRoutePreference(RoutePreferences rf) {
            rfs.getRoutePreferences(rf.getUsername());
            return ResponseEntity.ok("Route preference retrived from database");
    }

}
