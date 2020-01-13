// Following Code depicts the working of Super keyword
class temp1 {

    int s1,s2;
    int res=7;

    temp1(temp1 ob)  //object initialization
    {
        s1=ob.s1;
        s2=ob.s2;
    }


    temp1(int i,int j)   //constructor overloading
    {
        s1=i;
        s2=j;

    }

    temp1(int s1)         // constructor overloading
    {
        this.s1=s1;
    }

    int compute(int s1,int s2)
    {
        return((this.s1=s1)*(this.s2=s2));    // or simply return (s1*s2);
    }
}
class samo extends temp1{

    int res=5;
    samo(int q,int e)
    {
        //Super() must be first statement in constructor body
        super(q);// means value of q will be taken from temp(int s1)
        int v=e;
    }
    void abc() {
        System.out.println(super.res);
    }
}


class S2{

public static void main(String args[])
{
    temp1 obj=new temp1(5);
    samo obj1=new samo(1,3);
    obj1.abc();
    System.out.print(obj.compute(7,5));

}


}






