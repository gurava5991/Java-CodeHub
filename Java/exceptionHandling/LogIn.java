package exceptionHandling;
class MyLogInException extends RuntimeException{
    public MyLogInException(String str){
        super(str);
    }
}
public class LogIn {
    public static void main(String[] args) {
        String userName = args[0];
        String password = args[1];
        if(userName.equals("Gurava") && password.equals("123456")){
            System.out.println("Valid User");
        }
        else{
            try{
                throw new MyLogInException("Invalid userName | password");
            }
            catch (MyLogInException e){
                System.out.println(e.toString());
            }
        }
    }
}
