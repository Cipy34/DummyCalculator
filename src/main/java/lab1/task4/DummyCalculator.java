package lab1.task4;

import java.util.Scanner;

public class DummyCalculator {
    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }

    public static int multi(int a, int b){
        return a*b;
    }

    public static float multi(float a, float b){
        return a*b;
    }

    public static float div(float a, float b){
        return a/b;
    }

    public static boolean nd(boolean a, boolean b){
        return a & b;
    }

    public static boolean or(boolean a, boolean b){
        return a || b;
    }

    public static void calculate(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");

        String a = scanner.next();
        if(a.equals("quit"))
            return;
        String op = scanner.next();
        String b = scanner.next();


        while(true){
            System.out.print("Output: ");
            if(a.contains(".") || b.contains(".")){
                if(op.equals("+"))
                    System.out.println(add(Float.parseFloat(a), Float.parseFloat(b)));
                if(op.equals("*"))
                    System.out.println(multi(Float.parseFloat(a), Float.parseFloat(b)));
                if(op.equals("/"))
                    System.out.println(div(Float.parseFloat(a), Float.parseFloat(b)));
            }
            else{
                if(op.equals("+"))
                    System.out.println(add(Integer.parseInt(a), Integer.parseInt(b)));
                if(op.equals("*"))
                    System.out.println(multi(Integer.parseInt(a), Integer.parseInt(b)));
                if(op.equals("/"))
                    System.out.println(div(Float.parseFloat(a), Float.parseFloat(b)));
            }

            if(a.equals("true") || a.equals("false")){
                if(op.equals("&&"))
                    System.out.println(nd(Boolean.parseBoolean(a), Boolean.parseBoolean(b)));
                if(op.equals("||"))
                    System.out.println(or(Boolean.parseBoolean(a), Boolean.parseBoolean(b)));
            }

            System.out.print("Input: ");
            a = scanner.next();
            if(a.equals("quit"))
                break;
            op = scanner.next();
            b = scanner.next();
        }


    }
}
