class java{
    void div(int a){
        if(a==0){
            throw new Excep();
        }else{
            System.out.println(a);
        }
    }
    public static void main(String args[]){
        java j= new java();
        j.div(0);
    }
}
class Excep extends ArithmeticException{
    Excep(){
        super("divided by zero");
    }
}
class Sairose{
    Sairose(){
        System.out.println("Sairose");
    }
}