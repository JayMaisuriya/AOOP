class base {
    void disp(){
        System.out.println("I'M BASE CLASS");
    }
}

class derived1 extends base{
    void disp1(){
        System.out.println("I'M DERIVED-1 CLASS\n");
    }
}

class derived2 extends base{
    void disp2(){
        System.out.println("I'M DERIVED-2 CLASS\n");
    }
}

class pr16 {
    public static void main (String a[]){
        derived1 d1 = new derived1();
        System.out.println("\n------DERIVED1------\n");
        d1.disp();
        d1.disp1();

        derived2 d2 = new derived2();
        System.out.println("------DERIVED2------\n");
        d2.disp();
        d2.disp2();
    }

}