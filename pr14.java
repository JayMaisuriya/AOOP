class base { // BASE CLASS
    void disp() {
        System.out.println("\nTHIS IS BASE CLASS");
    }
}

class derive extends base { // DERIVED CLASS

    void disp1() {
        System.out.println("THIS IS DERIVED CLASS\n");
    }
}

class pr14 {
    public static void main(String[] args) {
        derive d = new derive();
        d.disp();
        d.disp1(); 
    }
}