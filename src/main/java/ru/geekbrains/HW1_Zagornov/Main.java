package ru.geekbrains.HW1_Zagornov;

public class Main {
    public static void main(String[] args) {
        //№2
        byte byteVal = -128;
        short shortVal = -22222;
        int intVal = -222222222;
        long longVal = -2222222222222222222L;
        float floatVal = -222222222222.2222f;
        double doubleVal = 147.147;
        char charVal = '\uffff';
        boolean booleanVal = true;


        System.out.println("Задание №2:");
        System.out.println("Byte = " + byteVal + " Short = " + shortVal + " Int = " + intVal + " Long = " + longVal + " Float = " + floatVal +
                " Double = " + doubleVal + " Char =" + charVal + " Boolean = " + booleanVal);
        System.out.println("Задание №3: ");
        System.out.println("Значение выражения = " + calculate(1f, 2f, 3f, 4f));
        System.out.println("Задание №4:");
        System.out.println("Число должно находиться в диапазоне от 10 до 20. При приведенных значениях 12 и 10 возвращается результат: "
                + task10To20(12, 10));
        System.out.println("Задание № 5: ");
        posOrNegNum(0);
        System.out.println("Задание №6:");
        System.out.println("Число -5 в данном случае (false - положительное; true - отрицательное): " + posOrNegNum2(0));
        System.out.println("Задание №7:");
        sayHelloName("Андрей");
    }

    //3
    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4
    public static boolean task10To20(int x1, int x2) {
        int sum = x1 + x2;
        return sum > 9 && sum < 21;
    }

    //5
    public static int posOrNegNum(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
        return x;
    }

    //6
    public static boolean posOrNegNum2(int num2) {
        if (-5 <= 0) {
            return true;
        } else {
            return false;
        }
        //7
    }
        public static String sayHelloName(String name){
        name = " Андрей";
            System.out.println("Привет," + name + "!");
            return name;
        }
    }





