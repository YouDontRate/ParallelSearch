import java.util.Random;

class Building
{
   private final int SIDE_LENGTH = 10;
   private Room[][][] building;   
   private int floorCount;  
   
//-----------------------------------------

   Building(int floors)
   {
      floorCount = floors;     
      
      createBuilding();
      hidePerson();
   
   }// End constructor
   
//------------------------------------------

   private void createBuilding()
   {
      Room newRoom;
      int floor;
      int row;
      int column;      
   
      building = new Room [floorCount][SIDE_LENGTH][SIDE_LENGTH]; 
      
      for (floor = 0; floor < floorCount; floor++)
         for (row = 0; row < SIDE_LENGTH; row++)
            for (column = 0; column < SIDE_LENGTH; column++)
            {
               newRoom = new Room(floor, row, column);
               building[floor][row][column] = newRoom;
            }// End loop
   
   }// End method
   
//--------------------------------------

   private void hidePerson()
   {
      Random random = new Random();
      HiddenPerson hiddenPerson;
      Room room;
      int floor;
      int row;
      int column;
      
      floor = random.nextInt(floorCount);
      row = random.nextInt(SIDE_LENGTH);
      column = random.nextInt(SIDE_LENGTH);
      
      room = building[floor][row][column];
      hiddenPerson = new HiddenPerson(room);    
      room.setHiddenPerson(hiddenPerson);      
      
      System.out.println("Hiding Location " + room);      
   
   }// End method 
   
//-------------------------------------------------

   public synchronized HiddenPerson searchFloor(int floor)
   {
      HiddenPerson personFound = null;
      Room room;
      int row = 0;
      int column = 0;
   
      for (row = 0; row < SIDE_LENGTH; row++)
         for (column = 0; column < SIDE_LENGTH; column++)
         {            
            room = building[floor][row][column];
            personFound = room.getHiddenPerson();
            
            if (personFound != null)              
               return personFound;            
            
         }// End inner for loop        
                  
      return personFound;   
      
   }// End method

}// End class
