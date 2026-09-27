public class test {
    public static void main(String[] args) {
        int plataClient =1261;
        int b500 = 0, b200=0, b100=0, b50=0, b20=0, b10=0, b5=0, b1=0;
        int rb500 = 0, rb200= 0, rb100= 0, rb50= 0, rb20= 0, rb10= 0, rb5= 0, rb1= 0;

        b500 = plataClient / 500 ;
        rb500 = plataClient % 500;


        b200 = rb500 / 200;
        rb200 = rb500 % 200;

        b100 = rb200 / 100;
        rb100 = rb200 % 100;

        b50 = rb100 / 50;
        rb50 = rb100 % 50;

        b20 = rb50 / 20;
        rb20 = rb50 % 20;

        b10 = rb20 / 10;
        rb10 = rb20 % 10;

        b5 = rb10 / 5;
        rb5 = rb10 % 5;

        b1 = rb5 / 1;
        rb1 = rb5 % 1;

        System.out.println("Rest : \n"+
                "Bancnote de 500: "+ b500 + "\n" +
                "Bancnote de 200: " + b200 +"\n" +
                "Bancnote de 100: " + b100 +"\n" +
                "Bancnote de 50: " + b50 +"\n" +
                "Bancnote de 20: " + b20 +"\n" +
                "Bancnote de 10: " + b10 +"\n" +
                "Bancnote de 5: " + b5 +"\n" +
                "Bancnote de 1: " + b1 );

        System.out.println("Rest : \n"+
                "Bancnote de 500: "+ rb500 + "\n" +
                "Bancnote de 200: " + rb200 +"\n" +
                "Bancnote de 100: " + rb100 +"\n" +
                "Bancnote de 50: " + rb50 +"\n" +
                "Bancnote de 20: " + rb20 +"\n" +
                "Bancnote de 10: " + rb10 +"\n" +
                "Bancnote de 5: " + rb5 +"\n" +
                "Bancnote de 1: " + rb1 );
    }



}
