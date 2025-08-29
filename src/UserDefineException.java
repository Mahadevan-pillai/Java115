public class UserDefineException {
    public void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid Age");
        }else{
            System.out.println("Valid Age");
        }
    }
}
