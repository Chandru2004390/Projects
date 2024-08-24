import java.util.Random;
import java.util.Scanner;


public class Zmo {
    static int t=0;
    static boolean a = true;
    static boolean yes = false
    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) throws InterruptedException {

        while (Zmo.a) {
            System.out.println("Welcome to Zomato!");
            System.out.println("\t\t\t\t1.RR briyani(r)\n\t\t\t\t2.SS Briyani(ss)\n\t\t\t\t3.Star Briyani(s)\n\t\t\t\t4.Thoppi Vaapa Briyani(tv)\n\t\t\t\t5.A2B-Pure Veg(a2b)");
            String hotel = sc.next();

            if (hotel.equalsIgnoreCase("r") || hotel.equalsIgnoreCase("ss") || hotel.equalsIgnoreCase("s") || hotel.equalsIgnoreCase("tv")) {
                System.out.println("\t\t\t\t1.dosa(d)\n\t\t\t\t2.idly(i)");
                System.out.println("\t\t\t\t1.Chicken Briyani(cb)\n\t\t\t\t2.Mutton Briyani(mb)");
                System.out.println("\t\t\t\t3.Chicken soup(cs)\n\t\t\t\t4.Mutton soup(ms)");
                System.out.println("\t\t\t\t5.Naatu kozhi briyani(nkb)\n\t\t\t\t6.Dum Briyani(db)");
            } else if (hotel.equalsIgnoreCase("a2b")) {
                System.out.println("\t\t\t\t1.dosa(d)\n\t\t\t\t2.idly(i)\n\t\t\t\t3.podi dosa(pd)\n\t\t\t\t4.podi idly(pi)\n\t\t\t\t5.panner butter masala(pbm)\n\t\t\t\t6.veg briyani(vb)");
            } else {
                System.out.println("Enter valid hotel name");
                return;
            }
            again1();
        }
    }
    public static void again1() throws InterruptedException {
        Total1 n= new Total1(60,20,100,160,100,80,150,130,70,30,100,75) ;

    }


}
class Total1 extends Zmo {
    Random r = new Random();
    static Scanner s = new Scanner(System.in);
    int total;
    int dosa;
    int idly;
    int chicken_briyani;
    int mutton_briyani;
    int mutton_soup;
    int chicken_soup;
    int naatu_kozhi_briyani;
    int dum_briyani;
    int podi_dosa;
    int podi_idly;
    int panner_butter_masala;
    int veg_briyani;

    Total1(int dosa, int idly, int chicken_briyani, int mutton_briyani, int mutton_soup, int chicken_soup, int naatu_kozhi_briyani, int dum_briyani, int podi_dosa, int podi_idly, int panner_butter_masala, int veg_briyani) throws InterruptedException {
        this.dosa = dosa;
        this.idly = idly;
        this.chicken_briyani = chicken_briyani;
        this.mutton_briyani = mutton_briyani;
        this.mutton_soup = mutton_soup;
        this.chicken_soup = chicken_soup;
        this.naatu_kozhi_briyani = naatu_kozhi_briyani;
        this.dum_briyani = dum_briyani;
        this.podi_dosa = podi_dosa;
        this.podi_idly = podi_idly;
        this.panner_butter_masala = panner_butter_masala;
        this.veg_briyani = veg_briyani;

        String order = s.next();
        if (order.equalsIgnoreCase("d")) {
            System.out.println("\t\t\t\thow many dosa you want");
            int quantity = s.nextInt();
            total = dosa * quantity;
            System.out.println("Your "+quantity+" and  your bill :" +sum(total));

        } else if (order.equalsIgnoreCase("i")) {
            System.out.println("\t\t\t\thow many idly you want");
            int quantity = s.nextInt();
            total = idly * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("Mb")) {
            System.out.println("\t\t\t\thow many mutton briyani you want");
            int quantity = s.nextInt();
            total = mutton_briyani * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("cb")) {
            System.out.println("\t\t\t\thow many chicken briyani you want");
            int quantity = s.nextInt();
            total = chicken_briyani * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("cs")) {
            System.out.println("\t\t\t\thow many chicken soup you want");
            int quantity = s.nextInt();
            total = chicken_soup * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("Ms")) {
            System.out.println("\t\t\t\thow many mutton soup you want");
            int quantity = s.nextInt();
            total = mutton_soup * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase(" nkb")) {
            System.out.println("\t\t\t\thow many naatu kohzi briyani you want");
            int quantity = s.nextInt();
            total = naatu_kozhi_briyani * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("Db")) {
            System.out.println("\t\t\t\thow many dum briyani you want");
            int quantity = s.nextInt();
            total = dum_briyani * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("pd")) {
            System.out.println("\t\t\t\thow many podi dosa you want");
            int quantity = s.nextInt();
            total = podi_dosa * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("pi")) {
            System.out.println("\t\t\t\thow many podi dosa you want");
            int quantity = s.nextInt();
            total = podi_dosa * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("pbm")) {
            System.out.println("\t\t\t\thow many panner butter masala you want");
            int quantity = s.nextInt();
            total = panner_butter_masala * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else if (order.equalsIgnoreCase("vb")) {
            System.out.println("\t\t\t\thow many veg briyani you want");
            int quantity = s.nextInt();
            total = veg_briyani * quantity;
            System.out.println("Your quantity is "+quantity+" and  your bill :" +sum(total));
        } else {
            System.out.println("Enter valid order name");
            return;
        }

        again();
        while (Total1.yes) {
            System.out.println("Please enter your phone number to login");
            Long ph_num = sc.nextLong();
            int n = 0;
            while (ph_num > 1) {
                ph_num = ph_num / 10;
                n++;
            }
            if (n > 11) {
                System.out.println("Enter valid phone number");
                return;
            }
            Random r = new Random();
            System.out.println("Enter the otp");
            int otp = r.nextInt(1000, 9999);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println("\t\t\t\t" + otp);
            int otp_1 = sc.nextInt();
            if(otp_1!=otp){
                System.out.println("Enter the correct otp");
            }
            System.out.println("\t\t\t\tLogin Succesfull\n\t\t\t\tYout total bill is :" + total);
            System.out.println("\t\t\t\tSelect the payment method\n\t\t\t\t1.Gpay\n\t\t\t\t2.Paytm\n\t\t\t\t3.Phonepe");
            String payment = sc.next();
            System.out.println("Your total bill is "+ t);
            System.out.println("\t\t\t\tThanks for your ordering!\n\t\t\t\tYour order has been received");
            Total1.yes = false;

        }

    }
    public static void again() {
        System.out.println("If you want to order again or not");
        String again_order = s.next();
        if (again_order.equalsIgnoreCase("yes")) {
            Total1.a = true;
            Total1.yes = false;
        } else if (again_order.equalsIgnoreCase("no")) {
            Total1.a = false;
            Total1.yes = true;
        } else {
            System.out.println("Enter valid option");
            Total1.a = false;

        }

    }
    public static int sum(int total) {
        return t += total;
    }
}
