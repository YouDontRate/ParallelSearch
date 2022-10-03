class Controller
{
   private final int MAX_FLOORS = 1000;
   private int floors;   

//-------------------------------------------

   public void startSearchParty()
   {
      
      Worker[] myWorkers;
      Worker newWorker;
      Building myBuilding; 
      boolean personFound = false;
      
      myBuilding = new Building(floors);
      myWorkers = new Worker[floors];      
      
      for (int i = 0; i < floors; i++)
      {
         newWorker = new Worker(i + 1, myBuilding);
         myWorkers[i] = newWorker;
         
      }// End for loop
      
      for (int i = 0; i < floors; i++)         
         myWorkers[i].start(); 
         
      try
      {
         for (int i = 0; i < floors; i++)         
            myWorkers[i].join();    
                   
      }// End try
      
      catch (Exception e)
      {
      }// End catch      
      
      while (!personFound)
      {         
         for (int i = 0; i < floors; i++)
         {         
            if (myWorkers[i].personFound != null)
            {
               personFound = true;
               
               for (int j = i; j < floors; j++)
                  myWorkers[j].interrupt();                        
               
            }// End if
         
         }// End for loop        
         
      }// End while      
      
      System.out.println("All Remaining Threads Have Been Canceled");      
      
   }// End method
   
//--------------------------------------

   public boolean checkFloorCount(String[] input)
   {           
      boolean floorCountValid;
      
      if (input.length != 1)
      {      
         System.out.println("Usage: java Driver <Number of Floors>");
         floorCountValid = false;        
         
      }// End if 
         
      else 
      {     
         floorCountValid = getFloorCount(input[0]);
      }// End else
      
      return floorCountValid;
   }// End method
   
//--------------------------------------------

   private boolean getFloorCount(String input)
   {      
      boolean floorCountValid;
      int floorCount = 0;        
      
      try
      {
         floorCount = Integer.parseInt(input);
      }// End try
      
      catch (Exception e)
      {
         System.out.println("Input: " + input + " ***Invalid Floor Count***");
         floorCountValid = false;
         return floorCountValid;
      }  
      
      if (floorCount > MAX_FLOORS || floorCount < 1)
      {
         System.out.println("Entered Floor Count: " + floorCount + " ***Floor Count Must Be 1 - 1000***");
         floorCountValid = false;
         
      }// End if      
      
      else
      {
         floors = floorCount;
         floorCountValid = true;
         
      }// End else
      
      return floorCountValid;
   }// End method

//------------------------------------------------

}// End class
