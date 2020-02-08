public class attendee {
   private String name;
   private String degree;
   private double GPA;
   private String email;
   private String gradDate;
   private String aspiration;

   public attendee (String nameIn, String degreeIn, String emailIn, double GPAIn, String gradDateIn, String aspirationIn) {
      name = setName(nameIn);
      degree = setDegree(degreeIn);
      GPA = setGPA(GPAIn);
      email = setEmail(emailIn);
      gradDate = setGradDate(gradDateIn);
      aspiration = setAspiration(aspirationIn);
   }
   public void setAspiration(String asperationIn){
      aspiration = aspirationIn;
   }
   public String getAspiration(){
      return aspiration;
   }
   public String getGradDate(){
      return gradDate;
   }
   public void setGradDate(String gradDateIn){
      gradDate = gradDateIn;
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