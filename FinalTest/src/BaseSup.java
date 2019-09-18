class Base{
    Base(int i){
        System.out.println("base constructor");
    }
    Base(){}
}
public class BaseSup extends Base{
    public static void main(String argv[]){
        BaseSup s= new BaseSup();

        //One
    }
    BaseSup(){
        //Two
        super(10);
    }
    public void derived(){
        //Three
    }
}