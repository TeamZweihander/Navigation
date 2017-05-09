/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zweihander.navup.navigation.domain;
/**
 *
 * @author Lindelo
 */
import javax.persistence.*;

public class RoutePreferences {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    protected long id;

    @Column(name="username", unique = true, length = 50, nullable=false)
    public String username;

    @Column(name="modeOfTravel", length = 30, nullable=false)
    public String modeOfTravel;

    @Column(name="avoidStairs", nullable=false)
    public boolean avoidStairs;
    
    @Column(name="avoidTraffic", nullable=false)
    public boolean avoidTraffic;
    
    /**
     * Returns the username.
     * @return username
    */
    public String getUsername(){
        return this.username;
    }
    /**
     * Sets the username for the current user
    @param user_
    */
    public void setUsername(String user_){
        this.username = user_;
    }
    /**
     * Sets the mode of travel for the current user. E.g. "WALKING", "DRIVING", "BICYCLING".
    @param _modeOfTravel
    */
    public void setmodeOfTravel(String _modeOfTravel){
        this.modeOfTravel = _modeOfTravel;
    }
    /**
     * Returns the mode of travel.
     * @return modeOfTravel
    */
    public String gettmodeOfTravel(){
        return this.modeOfTravel;
    }
    /**
     * Returns a boolean for current user, whether they want to avoid
     * stairs or not.
     * @return avoidStairs
    */
    public boolean getAvoidStairs(){
        return this.avoidStairs;
    }
    /**
     * Function to determine whether a user wants to avoid stairs.
    @param _avoidStairs
    */
    public void setAvoidStairs(boolean _avoidStairs){
        this.avoidStairs = _avoidStairs;
    }
    /**
     * Returns a boolean for current user, whether they want to avoid
     * traffic or not.
     * @return avoidTraffic
    */
    public boolean getavoidTraffic(){
        return this.avoidTraffic;
    }
    /**
     * Function to determine whether a user wants to avoid traffic - this include
     * both pedestrian and vehicle traffic.
    @param _avoidTraffic
    */
    public void setAvoidTraffic(boolean _avoidTraffic){
        this.avoidTraffic = _avoidTraffic;
    }  
}
