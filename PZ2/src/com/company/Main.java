package com.company;

public class Main {

    public static void main(String[] args) {
// write your code here
        int i = 35;
        String stri = Integer.toString(i);
        System.out.println(stri);

        double d = 32.4e10;
        String strd = Double.toString(i);
        System.out.println(strd);

        long l = 3422222;
        String strl = Long.toString(i);
        System.out.println(strl);

        float f = 3.46f;
        String strf = Float.toString(i);
        System.out.println(strf);

        char ch = 'S';
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        String strch = "" + ch;
        System.out.println(strch);

        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);

        char CH = '9';

        int i1 = Character.getNumericValue(CH);
        System.out.println(i1);

        int i2 = Character.digit(CH,10);
        System.out.println(i2);

        int iToLong = 2015;
        long lon = (long) (iToLong);
        System.out.println(lon);

        int iToFloat = 2015;
        float flo = (float) (iToFloat);
        System.out.println(flo);

        long lonToInt = 214748364;
        int int2 = (int) lonToInt;
        System.out.println(int2);

        double dToInt = 3.14;
        int int3 = (int) dToInt;
        System.out.println(int3);
    }
}
