package by.belstu.it.Tarakanov.basejava;
import java.awt.*;
import java.io.UnsupportedEncodingException;

import static java.lang.Math.*;

/** LP_Lab02
    * @author TarakanovNS
    * @version 1.0.0
 */

public class JavaTest {
    static int sint; // static
    final int const1 = 6;
    public final int const2 = 6;
    public static final int const3 = 6;

    public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * @return
         * @throws
         * @param
         */

        /**
         * @value
         * @see
         */
        char ch1 = 'a'; // переменные
        int i1 = 22;
        short sh1 = 10;
        byte b1 = 1;
        long l1 = 999999;
        boolean bool1 = true;
        String str1 = "STROKE";
        double d1 = 99.3;

        var result1 = str1 + i1; // string + int
        System.out.println("(string)'" + str1 + "'" + " + (int)" + i1 + " = (string)" + result1);

        var result2 = str1 + ch1; // string + char
        System.out.println("(string)'" + str1 + "'" + " + (char)" + ch1 + " = (string)" + result2);

        var result3 = str1 + d1; // string + double
        System.out.println("(string)'" + str1 + "'" + " + (double)" + d1 + " = (string)" + result3);

        byte result4 = (byte)(b1 + i1); // byte = byte + int
        System.out.println("(byte)" + b1 + " + (int)" + i1 + " = (byte)" + result4);

        int result5 = (int)(d1 + l1); // int = double + long
        System.out.println("(double)" + d1 + " + (long)" + l1 + " = (int)" + result5);

        long result6 = (long)i1 + 2147483647; // long = int + 2147483647
        System.out.println("(int)" + i1 + " + " + "2147483647" + " = (long)" + result6);

        System.out.println("Значение static без инициализации: " + sint);

        boolean result7 = bool1 && true;
        System.out.println("true && true = " + result7);
        result7 = result7 && false;
        System.out.println("true && false = " + result7);
        result7 = true && true;
        System.out.println("true && true = " + result7);
        result7 = false && false;
        System.out.println("false && false = " + result7);

        result7 = result7 ^ true;
        System.out.println("false ^ true = " + result7);
        result7 = result7 ^ false;
        System.out.println("true ^ false = " + result7);
        result7 = result7 ^ true;
        System.out.println("true ^ true = " + result7);
        result7 = result7 ^ false;
        System.out.println("false ^ false = " + result7);

        // var result8 = true + false;
        System.out.println("boolean + boolean = " + "NO");

        var result9 = 9_223_372_036_854_775_807L;
        System.out.println("9_223_372_036_854_775_807 is a max long");

        var result10 = 0x7fff_ffff_fffL;
        System.out.println("0x7fff_ffff_fff is a max long");

        char ch2 = 'a';
        System.out.println("First char: " + ch2);
        char ch3 = '\u0061';
        System.out.println("Second char: " + ch3);
        char ch4 = 97;
        System.out.println("Third char: " + ch4);

        var result11 = ch2 + ch3 + ch4;
        System.out.println("Sum of all char: (int)" + result11);

        var result12 = 3.45 % 2.4;
        System.out.println("3.45 % 2.4: (double)" + result12);

        var result13 = 1.0 / 0.0;
        System.out.println("1.0 / 0.0: (double)" + result13);

        var result14 = 0.0 / 0.0;
        System.out.println("1.0 / 0.0: (double)" + result14);

        var result15 = Math.log(-345);
        System.out.println("log(-345): (double)" + result15);

        var result16 = Float.intBitsToFloat(0x7F800000);
        System.out.println("Float.intBitsToFloat(0x7F800000): (float)" + result16);

        var result17 = Float.intBitsToFloat(0xFF800000);
        System.out.println("Float.intBitsToFloat(0xFF800000): (float)" + result17);

        /*
            Системы счисления:
                Двоичная: 0bчисло || 0Bчисло
                Восьмеричная: 0число
                Десятичная: число
                Шестнадцатиричная: 0xчисло || 0Xчисло
        */

        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
        System.out.println("Math.round(Math.Pi): " + Math.round(Math.PI));
        System.out.println("Math.round(Math.E): " + Math.round(Math.E));
        System.out.println("Math.min(p, e): " + Math.min(Math.PI, Math.E));
        System.out.println("random from [0, 1): " + Math.random());

        Boolean bl1 = true;
        Character cha1 = 'a';
        Integer int2 = 22;
        Byte bt1 = 2;
        Short shr1 = 223;
        Long ln1 = 300L;
        Double db1 = 88.11;

        var res1 = ln1 << bt1;
        System.out.println(ln1 + " << " + bt1 + " = (long)" + res1);

        var res2 = ln1 * db1;
        System.out.println(ln1 + " * " + db1 + " = (double)" + res2);

        var res3 = shr1 >>> ln1;
        System.out.println(shr1 + " >>> " + ln1 + " = (int)" + res3);

        var res4 = ~bt1;
        System.out.println("~bt1: (int)" + res4);

        var res5 = shr1 & cha1;
        System.out.println(shr1 + " & '" + cha1 + "' = (int)" + res5);

        var res6 = db1 - cha1;
        System.out.println(db1 + " - '" + cha1 + "' = (double)" + res6);

        var res7 = cha1 + bt1;
        System.out.println("'" + cha1 + "' + " + bt1 + " = (int)" + res7);

        System.out.println("Long MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("Long MIN_VALUE: " + Long.MIN_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);

        int a = 444;
        Integer aBOX = a; // упаковка
        int aUNBOX = aBOX; // расспаковка

        byte b = 22;
        Byte bBOX = b; // упаковка
        byte bUNBOX = bBOX; // расспаковка

        System.out.println("patseInt(123): " + Integer.parseInt("123"));
        System.out.println("toHexString(256): " + Integer.toHexString(256));
        System.out.println("compare(1, 200)" + Integer.compare(1, 200));
        System.out.println("toString(999999): " + Integer.toString(9999999));
        System.out.println("bitCount(2499): " + Integer.bitCount(2499));
        System.out.println("isNaN(2499): " + Double.isNaN(2499));

        String s34 = "2345";
        Integer numb1 = Integer.valueOf(s34);
        System.out.println("valueOf: " + numb1);
        Integer numb2 = Integer.parseInt(s34);
        System.out.println("parseInt: " + numb2);

        byte [] bytes = s34.getBytes();
        System.out.println("stroke bytes: " + bytes);
        String str56 = new String(bytes,"cp1251");
        System.out.println("bytes to string: " + str56);

        Boolean bl12 = Boolean.parseBoolean(s34);
        System.out.println("Parse Boolean: " + bl12);
        Boolean bl13 = Boolean.valueOf(s34);
        System.out.println("valueOf: " + bl13);

        String comp1 = "Nikita";
        String comp2 = "Nikita";
        System.out.println("comp1 == comp2: " + (comp1 == comp2));
        System.out.println("comp1.equals(comp2): " + comp1.equals(comp2));
        System.out.println("comp1.compareTo(comp2): " + comp1.compareTo(comp2));

        comp2 = null;
        System.out.println("comp1 == null: " + (comp1 == comp2));
        System.out.println("comp1.equals(null): " + comp1.equals(comp2));
        try
        {
            System.out.println("comp1.compareTo(null): " + comp1.compareTo(comp2));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        String proiz = "Tarakanov Nikita Sergeevich";
        String [] spl = proiz.split(" ");
        System.out.println("split: " + spl[0]);
        Boolean cont = proiz.contains("Nikita");
        System.out.println("contains: " + cont);
        Integer hash = proiz.hashCode();
        System.out.println("hash: " + hash);
        Integer ind = proiz.indexOf(" ");
        System.out.println("indexOf: " + ind);
        Integer lenght = proiz.length();
        System.out.println("lenght: " + lenght);
        String newstr = proiz.replace("Nikita", "222");
        System.out.println("replace: " + newstr);


        char [][] ccc1 = {{'1', '2'},{'3', '4'}}; // предпочтительнее
        // char [] c2 []; nope
        char ccc3 [][] = {{'1', '2'},{'3', '4'}};
        System.out.println(ccc1[0][0]);
        System.out.println(ccc3[0][0]);

        char []nullarr = {};
        System.out.println(nullarr.length);
        try
        {
            System.out.println(nullarr[22]);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


        char [][]d11 = new char[3][];
        /*for(int i =0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                d11[i][j] = (char)(j * i);
            }
        }*/
        System.out.println("d11.lenght: " + d11.length);
        try
        {
            System.out.println("d11[0].lenght: " + d11[0].length);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        char [][] cc45 = {{'1', '5'}, {'3', '4'}};
        char [][] cc46 = {{'1', '2'}, {'3', '4'}};
        Boolean blo1 = cc45 == cc46; // адреса
        System.out.println("c1 == c2: " + blo1);
        cc45 = cc46;
        System.out.println(cc45[0][1]);
        char []cc55 = {'1', '2', '3', '4', '5'};
        for(char dd2 : cc55)
        {
            System.out.println(dd2);
        }
        for(int i = 0; i < 6; i++)
        {
            try
            {
                System.out.println(cc55[i]);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        WrapperString rstr = new WrapperString();
        rstr.replace('a', 'b');
        IMagazine magazine2 = new IMagazine() {
            @Override
            public void replace(char oldchar, char newchar)
            {
                System.out.println(oldchar + " replaces by " + newchar);
            }
            @Override
            public void delete(char newchar)
            {
                System.out.println(newchar + " is deleted!");
            }
        };
        magazine2.replace('1', '2');
        magazine2.delete('b');
    }
}
