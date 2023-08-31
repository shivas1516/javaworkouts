class javaw{
    public static void main(String x[]){

        //output hello world
        System.out.print("hello vro\n");

        /*type casting
        byte d = 56;
        int a = d;
        float b = a;
        */

       //type casting
        int a = 56;
        byte b = (byte)a;
        float c = (float)b;

        System.out.println(b);
        System.out.println(c);
        System.out.println("-----------------");
        
        //type casting
        int d = 506; // it does the % 506%256 =-6
        byte e = (byte)d;
        float f = (float)e;


        System.out.println(e);
        System.out.println(f);

        // type promotion
        byte v = 45;
        byte u = 67;
        //byte re = v*u;   // 45 * 67 = 3015 out of rane of byte value, so 
        int re = v*u;  // type promotion

        System.out.println(re);

        System.out.print("---------------");
    
    }
}