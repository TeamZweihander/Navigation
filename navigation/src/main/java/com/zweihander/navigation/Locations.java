package com.zweihander.navigation;

public class Locations {
    
   protected Location location;

   public void addLocation(Location inLoc) {
      this.location = inLoc;
   }
   
   public void modifyLocation(Location inLoc) {
       this.location = inLoc;
   }
   
   public void removeLocation(Location inLoc) {
       this.location = null;
   }
}
