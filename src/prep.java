
// Creating object of nested class (Non Static)
 class abc {
    public int n;
    public static int v;

    abc(int n,int v) {
        this.v=v;    // Use of this keyword here in the parameter, we have not taken different local variables we just used instance variables using this keyword
        this.n=n;
    }

    class nes {         //Non static nested class (or inner class)

        int vol(int x) {
            return (x+1);
        }
    }
}

class prep {

    public static void main(String args[]) {



        abc obj = new abc(5,7);
        // nes obj1=new nes();  This will not run as nes is an nested member class
        abc.nes obj1=obj.new nes(); //this is the perfect way to create object of nested class.
        int y=obj1.vol(5);

        System.out.print(y);

    }
}