package org.example;

public class HelloWorld {
    public static void main(String[] args) {

        // print all content
        //System.out.println(123+30-5);
        //System.out.println("123+30-5");
        //System.out.print("123+30-5=");
        //System.out.println(123+30-5);

        // Use+to connect text
        //System.out.println("123+30-5="+(123+30-5));

        // Use\to hop out from the rule
        //System.out.println("\\n");

        // int
        //System.out.println(123+234);
        //int xyz = 10;
        //System.out.println("xyz=" + xyz);
        //int abc = 33;
        //System.out.println(abc + xyz);
        //System.out.println(xyz - abc);
        //System.out.println(abc - xyz);
        //System.out.println(abc * xyz);
        //int abcxyz = abc * xyz;
        //System.out.println(abcxyz);
        //System.out.println(abcxyz - xyz);
        //System.out.println(abcxyz - xyz * 7);

        // sting
        //String e04 = "FUCK";
        //System.out.println(e04);
        //String Peter ="Peter";
        //String HPeter = "Handsome Peter";
        //System.out.println(Peter);
        //System.out.println(e04+Peter);
        //System.out.println("He is a "+e04+"ing "+HPeter);
        //System.out.println(Peter+abcxyz);
        //int birthday = 820422;
        //System.out.println(Peter+birthday);

        //if
        int age = 101;
        System.out.println("Peter"+" is "+ age +" old");
        if (age < 0) {
            System.out.println("This Age is not true");
        }else if (age > 100) {
            System.out.println("This guy is too old");
        }else if (age >= 90 ){
            System.out.println("This guy is kinda old");
        }else if (age >= 18){
            System.out.println("This guy can buy alcohol");
        }else if (age <18){
            System.out.println("This guy is too young");
        }else if (age >0) {
            System.out.println("Age is true");
        }

        //IF exercise with % and DOUBLE
        Double number = 178.8;
        System.out.println("When the number is "+number);
        if (number % 2 == 0) {
            System.out.println("This is a even number");
        }else if (number % 2 != 0) {
            System.out.println("This is a odd number");
        }

    }
}