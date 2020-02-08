public class attendee {
   private String name;
   private String degree;
   private double GPA;
   private String email;

   public attendee (String nameIn, String degreeIn, String emailIn, double GPAIn) {
      name = nameIn;
      degree = degreeIn;
      GPA = GPAIn;
      email = emailIn;
   }

   public void setName(String nameIn) {
      name = nameIn;
   }

   public void setDegree(String degreeIn){
      degree = degreeIn;
   }

   public void setGPA(double GPAIn) {
      GPA = GPAIn;
   }

   public void setEmail(String emailIn) {
      email = emailIn;
   }
   
   public String getName(){
   return name;
   }
   
   public String getDegree(){
   return degree;
   }
   
   public String getEmail(){
   return email;
   }
   
   public double GPA() {
   return GPA;
   }
}