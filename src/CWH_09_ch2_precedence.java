public class CWH_09_ch2_precedence {
    public static void main(String[] args) {

        /*
        float a = 6*5-4/2;
        System.out.println(a);
        The highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
        = 30 - 4/2
        = 30 - 2
        = 28
        in this expression ( * is equal to / and - is less than * and / . this is evaluate on the direction of left to right.
        */

        /*
        int b = 68/5 - 34*2;
        System.out.println(b);
        The highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
        = 14(approximately) - 34*2
        = 14 - 68
        = -55
        */

//        Quick quiz - 1

//        double x = 5;
//        double y =7;
//        double k = (x-y)/5;
//        System.out.println(k);
//        in this expression ( / is greater than - and - is present first so the - is evaluate on right to left direction )
//        = (5-7)/5
//        = -2 / 5
//        = -0.4

        /*
        quick Quiz 2

        int a = 5;
        int b = 1;
        int c = 4;

//        int d = b*b - 4*a*c/2*a; // if you can use this type the answer is 6 and this answer is false. ( b*b is write for b square )
        int d = b*b - (4*a*c)/(2*a);  // if you can use ( ) the values are separated and the under ( ) equation is calculate first.
                                      // because of ( ) is highest precedence and it is calculate left to right.
        System.out.println(d);

         */

        /*
        Quick Quiz 3

        int v=4;
        int u=5;
        int k = (v*v) - (u*u);
        System.out.println(k);
         */

        // Quick quiz 4 ( a*b-d )

//        int a=89;
//        int b=34;
//        int d=12;
//
//        int c= a * (b-d);
//        System.out.println(c);


//        Self Quiz: ( 3a Cube - 8c squire / 2a * 5avc )
        double a= 5;
        double b= 9;
        double c= 2;

        double k = (3*(b*b*b)-8*(c*c))/((2*a)*(5*(a*b*c)));
        System.out.println(k);

        // (3*729-8*2/(2*5*(5*90));
        // (2187-32)/(10*450);
        // 2155/4500;
        // 0.47889  ( it was a answer of the following equation )


    }
}
