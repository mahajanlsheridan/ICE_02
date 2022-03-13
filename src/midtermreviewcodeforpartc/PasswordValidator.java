
package midtermreviewcodeforpartc;

public class PasswordValidator extends UnoOnline {
    private String password;

    public PasswordValidator(){};
    
    public PasswordValidator(String password){};
    
    public String getPassword(){
        return password;
   } 
    
     public void setPassword(String name){
        this.password=password;
     }
    
     boolean validPassword=false;
   
        while(!validpassword)
        {
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:"); 
            
          
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }
}
    
   
