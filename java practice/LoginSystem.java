interface LoginSystem {
   boolean login(String id,String pass);
}
class University_portal implements LoginSystem {
    public boolean login(String id,String pass){
        if(id.equals("Student123")&& pass.equals("pass02")){
            System.out.println("Login successful");
            return true;
        }else{
            System.out.println("Invalid credentials");
            return false;

        }
    }
public static void main(String[] args){
    University_portal p1=new University_portal();
    p1.login("Student123","pass02");
    p1.login("Student123","wrongpass");
}
}