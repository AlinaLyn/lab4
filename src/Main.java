public class Main {
    public static void main(String[] args) {
        //Task1.1

       /*  for (int i=500;i<=650;i= i + 10) {
             System.out.println(i);}
         //Task1.2
             int j = 500;
             while (j <= 650) {
                 System.out.println(j + "");
                 j = j + 10;}
             //Task 1.3
                 int b = 500;
                 do {
                     System.out.println("" + b);
                     b = b + 10;
                 } while (b <= 650);
                 //Task2


                 for (int a = 2; a < 5000; a = 2 * a - 1) {
                     System.out.println(a);}
                 //Task3
                 int c=10;
                 int n=0;
                 while(n<=c) {
                     n++;
                     if (c % n == 0) {
                         System.out.println(n);
                     }
                 }
                 //Task 4.1


                     int n1, f;
                     f = 1;
                     n1 = 10;
                     for (int d = 1; d <= 10; d++) {
                         f = f * d;
                     }
                     System.out.println(n + "!=" + f);

                  //Task4.2
                     int a1=10;
                     int b1=1;
                     int c1=1;
                     while(b1<=a1){
                         b1=b1*c1;
                         c1++;
                     }
                  System.out.println(b1);  */
        //Task5
        int a2 = 0;
        for (int s = 0; s < 24; s++) {
            for (int m = 0; m < 60; m++) {
                int a3 = s / 10;
                int a4 = s % 10;
                int a5 = m / 10;
                int a6 = m % 10;
                if (a3 == a5 && a4 == a6 && a6 < 5) {
                    a2++;
                }
            }

        }
        System.out.println("Результат:" + a2);


    }
}














