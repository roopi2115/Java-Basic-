/* here the program to get the student details using methods */
class Studentdetails {
    public String name (){
        return "Roopika" ;
    }
    public String address(){
        return "West street,Elampillai";

    }
}
class example{

   public static void main(String[] args) {
        Studentdetails details= new Studentdetails();
        System.out.println("Name"+ details.name());
        System.out.println("Address"+ details.address());
    }
  
}