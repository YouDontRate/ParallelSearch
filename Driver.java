import java.util.Random;

class Driver
{

   public static void main(String[] args)
   {
   
      boolean floorCountValid;
      Controller myController = new Controller();
      
      floorCountValid = myController.checkFloorCount(args);
      
      if (floorCountValid)
         myController.startSearchParty();       
   
   }// End main

}// End class
