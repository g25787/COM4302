public class Day2{
    public static void main(String[] args) {
        byte bt1 = 11;  // 8 bit
        System.out.println("bt1 = " + bt1);
        short sh = 1000 ;  // 16 bit
        ////System.out.println("sh = " + sh);
        ////byte bt2 = (byte)(1+2+3+4);
        System.out.println("sh = " + sh);
        byte bt2 = 1+2+3+4+10;
        System.out.println("bt2 = " + bt2);
        bt2 = (byte)(bt1 + 100);
        System.out.println("bt2 = " + bt2);
        int in1 = 10000;  // 32 bit
        System.out.println("in1 = " + in1);
        long ln = 1000000000L;  // 64 bit
        System.out.println("ln = " + ln);
        float fl1 = (float)0.5;  //  32 bit
        System.out.println("fl1 = " + fl1);
        float fl2 = 15.543f;  //  32 bit
        System.out.println("fl2 = " + fl2);
        int in2 = (int)fl2;
        System.out.println("in2 = " + in2);
        double db = 10.9999999;  // 64 bit
        System.out.println("db = " + db);
        char ch1 = '\u0041';  // 32 bit
        System.out.println("ch1 = " + ch1);
        char ch2 = 69;  // 32 bit
        System.out.println("ch2 = " + ch2);
        boolean bo = true;  // 1 bit
        System.out.println("bo = " + bo);
        int a = 10, b = 7;
        System.out.println("a + b = "+(a+b) );
        System.out.println("a / b = "+(a/b) );
        System.out.println("a / b = "+(a/7.0) );
        System.out.println("a % b = "+(a%b) );
        System.out.println("3+5*2-7/6%4 = "+(3+5*2-7/6%4) );
        System.out.println("3+5*2-7/(6%4) = "+(3+5*2-7/(6%4) ) );

        System.out.println("a == b = "+(a==b) );
        System.out.println("a > b = "+(a>b) );
        System.out.println("a <= b = "+(a<=b) );

        System.out.println("true & true = "+(true & true) );  // and
        System.out.println("(a > 10) & (a <= 20) =" + ((a > 10) & (a <= 20) );
    }
}