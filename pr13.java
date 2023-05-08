public class pr13 {

    public static void main(String a[]) {
        System.out.println("\n-------charAT()--------");
        String str1 = "welcome";
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(5));

        System.out.println("\n-------contains()--------");
        String str2 = "java programming";
        System.out.println(str2.contains("java"));

        System.out.println("\n-------format()--------");
        String language = "java";
        int number = 97;
        String result;
        result = String.format("LANGUAGE : %s", language);
        System.out.println(result);
        result = String.format("HEXADECIMAL NUMBER : %x", number);
        System.out.println(result);

        System.out.println("\n-------lenght()--------");
        String greet = "hello world";
        System.out.println("STRING = " + greet);
        System.out.println("LENGTH = " + greet.length());

        System.out.println("\n-------split()--------");
        String text = "java is a fun programming language";
        String[] result1 = text.split(" ");
        System.out.println(text);
        for (String splted : result1) {
            System.out.println(splted + "," + "\n");
        }

    }

}
