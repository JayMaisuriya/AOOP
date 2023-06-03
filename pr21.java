final class A{
   int i;
}

class B extends A{
    int j;
    void show(){
        System.out.println("SUM = " + (i+j));
    }
}

class pr21{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}