class pr9_2 {

    void fun1() {
        System.out.println("THIS IS NON STATIC METHOD");
    }
    static void fun2() {
        System.out.println("THIS IS STATIC METHOD");
    }
    public static void main(String a[]){
        pr9_2 obj = new pr9_2();
        obj.fun1();
        pr9_2.fun2();
    }
}