public class class1{
    int age;
    int usage;
    float height;
    String name;
    String password;

    void printUserDetails(){
        age =25;
        height =170;
        name= "James";
        name.length();
        password="12345678";

        if (password.contains("12345678")|| password.contains("abd")) {
            System.out.println("Password is to easy");
        }
    }
    public static void main(String []args){
        CLASS1 class1  =new CLASS1();
        CLASS1.printUserDetails();
    }
}
