class Room
{   
   private int floor;
   private String room;
   private HiddenPerson myPerson;
   
//--------------------------------------

   Room(int floor, int row, int column)
   {      
      this.floor = floor;
      this.room = "" + row + column;
      
   }// End constructor
   
//-----------------------------------------   

   @Override
   public String toString()
   {         
      String roomInfo = "Floor: " + (floor + 1) + " Room: " + room;
      
      return roomInfo;
   }// End method
   
//--------------------------------------

   public void setHiddenPerson(HiddenPerson hiddenPerson)
   {
      myPerson = hiddenPerson;
   
   }// End method
   
//--------------------------------------

   public HiddenPerson getHiddenPerson()
   {
     return myPerson;
   
   }// End method


}// End class
