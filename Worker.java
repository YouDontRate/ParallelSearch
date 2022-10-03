class Worker extends Thread
{
   
   private Building myBuilding;
   private int floor;
   public HiddenPerson personFound;   
   
//-----------------------------------   
   
   Worker(int floor, Building building)
   {
      this.floor = floor;
      myBuilding = building;
   
   }// End constructor
   
//----------------------------------------

   @Override
   public void run()
   {       
      int row;
      int column;     
      
      personFound = myBuilding.searchFloor(floor - 1);
      
      if (personFound != null)        
         System.out.println(personFound);    
            
      else 
         System.out.println("Nobody Found on Floor: " + floor);     
   
   }// End method
   
}// End class
