class pr9_1 {

    static int c=0;

    pr9_1() {
        c++;
        System.out.println(c);
    }

    public static void main(String a[]){
        pr9_1 s1 = new pr9_1();
        pr9_1 s2 = new pr9_1();
        pr9_1 s3 = new pr9_1();

    }
}