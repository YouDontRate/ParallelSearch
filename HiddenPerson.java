class HiddenPerson
{   
   private Room room;
   
//--------------------------------------

   HiddenPerson(Room room)
   {        
      this.room = room;
      
   }// End constructor
   
//-----------------------------------------   

   @Override
   public String toString()
   {         
      String roomInfo = "Person Found on " + room;
      
      return roomInfo;
   }// End method

}// End class
