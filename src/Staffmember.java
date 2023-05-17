
import java.time.LocalDate; 

public class Staffmember extends person {
    protected int salery ;
    protected int mounthlyTarget ;
   
    
public Staffmember (){
super ();
}
   public Staffmember(int Id,String Name,int age,int telephone,String address,int salery) {
       
        super(Id, Name, age, telephone, address);
        this.salery=salery;
    }  
   
 public void bouns(){
      LocalDate currentDate = LocalDate.now() ; 
      LocalDate afterthirtyDay=currentDate.plusDays(30);
      
      if(currentDate.isAfter(afterthirtyDay) && mounthlyTarget>=100000){
          salery+=500;
      }
 }
}
