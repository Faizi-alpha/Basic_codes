
class phone{
    public void show(){
        System.out.print("Phone class");
    }
}

class smartp extends phone{

    public void show(){
        System.out.print("Smart class");
    }
}



public class test2 {
    public static void main(String args[])
    {
        phone obj=new phone();
        obj.show();
    }
}
