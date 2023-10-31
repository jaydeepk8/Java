import java.io.*;
import java.util.*;
import java.time.*;
import java.text.*;
public class CanteenBill
{
    public static void main(String[] args)
    {
        Scanner io = new Scanner(System.in);
        File file1 = new File("Bill.txt");
        int ch;
        int quantity;
        LocalDate date;
        SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
        Date d = new Date();
        Random r = new Random();
        int billno;
        billno = r.nextInt(90000)+10000;

        int tc=0;
        System.out.println("----MENU----");
        System.out.println("1. Samosa");
        System.out.println("2. Wada pav");
        System.out.println("3. Samosachat");
        System.out.println("4. Dosa");
        System.out.println("5. Pav Bhaji");
        System.out.println("Enter your choice :");
        ch = io.nextInt();

        switch (ch)
        {
            case 1:
                int cost1 = 30;
                System.out.println("Enter the quantity :");
                quantity = io.nextInt();
                for(int i=1;i<=quantity;i++)
                {
                    tc = cost1*i;
                }
                System.out.println("Your Order : Samosa");
                System.out.println("Total cost :"+tc);
                try {
                    FileWriter fw = new FileWriter("Bill.txt");
                    fw.write("\t\tSHREERAJ MIT");
                    fw.write("\n\t\t   CANTEEN");
                    fw.write("\n\t\tPaud Road Pune");
                    fw.write("\n"+LocalDate.now()+ "   "+sd.format(d)+ "\t\tGauri");
                    fw.write("\nMC#0001\t\t\t\t #"+billno);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nITEM  NAME  WT/QTY  PRICE  AMT  ₹   ");
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nSamosa \t"+quantity+" \t"+cost1+" \t"+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\n                                                                 ₹ "+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nT QTY :"+quantity+"pcs");
                    fw.write("\nNO OF ITEMS : 1");
                    fw.write("\n\t Thank you, Visit Again");
                    fw.close();
                }catch (IOException e){
                    System.out.println("Failed");
                }
                break;

            case 2:
                int cost2 = 20;
                System.out.println("Enter the quantity :");
                quantity = io.nextInt();
                for(int i=1;i<=quantity;i++)
                {
                    tc = cost2*i;
                }
                System.out.println("Your Order : Wada pav");
                System.out.println("Total cost :"+tc);

                try {
                    FileWriter fw = new FileWriter("Bill.txt");
                    fw.write("\t\tSHREERAJ MIT");
                    fw.write("\n\t\t   CANTEEN");
                    fw.write("\n\t\tPaud Road Pune");
                    fw.write("\n"+LocalDate.now()+ "   "+sd.format(d)+ "\t\tGauri");
                    fw.write("\nMC#0001\t\t\t\t #"+billno);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nITEM  NAME  WT/QTY  PRICE  AMT  ₹   ");
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nWada Pav \t"+quantity+" \t"+cost2+" \t"+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\n                                                                 ₹ "+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nT QTY :"+quantity+"pcs");
                    fw.write("\nNO OF ITEMS : 1");
                    fw.write("\n\t Thank you, Visit Again");
                    fw.close();
                }catch (IOException e){
                    System.out.println("Failed");
                }
                break;

            case 3:
                int cost3 = 40;
                System.out.println("Enter the quantity :");
                quantity = io.nextInt();
                for(int i=1;i<=quantity;i++)
                {
                    tc = cost3*i;
                }
                System.out.println("Your Order : Samosachat");
                System.out.println("Total cost :"+tc);
                try {
                    FileWriter fw = new FileWriter("Bill.txt");
                    fw.write("\t\tSHREERAJ MIT");
                    fw.write("\n\t\t   CANTEEN");
                    fw.write("\n\t\tPaud Road Pune");
                    fw.write("\n"+LocalDate.now()+ "   "+sd.format(d)+ "\t\tGauri");
                    fw.write("\nMC#0001\t\t\t\t #"+billno);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nITEM  NAME  WT/QTY  PRICE  AMT  ₹   ");
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nSamosa chat \t"+quantity+" \t"+cost3+" \t"+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\n                                                                 ₹ "+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nT QTY :"+quantity+"pcs");
                    fw.write("\nNO OF ITEMS : 1");
                    fw.write("\n\t Thank you, Visit Again");
                    fw.close();
                }catch (IOException e){
                    System.out.println("Failed");
                }
                break;

            case 4:
                int cost4 = 60;
                System.out.println("Enter the quantity :");
                quantity = io.nextInt();
                for(int i=1;i<=quantity;i++)
                {
                    tc = cost4*i;
                }
                System.out.println("Your Order : Dosa");
                System.out.println("Total cost :"+tc);
                try {
                    FileWriter fw = new FileWriter("Bill.txt");
                    fw.write("\t\tSHREERAJ MIT");
                    fw.write("\n\t\t   CANTEEN");
                    fw.write("\n\t\tPaud Road Pune");
                    fw.write("\n"+LocalDate.now()+ "   "+sd.format(d)+ "\t\tGauri");
                    fw.write("\nMC#0001\t\t\t\t #"+billno);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nITEM  NAME  WT/QTY  PRICE  AMT  ₹   ");
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nDosa \t"+quantity+" \t"+cost4+" \t"+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\n                                                                 ₹ "+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nT QTY :"+quantity+"pcs");
                    fw.write("\nNO OF ITEMS : 1");
                    fw.write("\n\t Thank you, Visit Again");
                    fw.close();
                }catch (IOException e){
                    System.out.println("Failed");
                }
                break;

            case 5:
                int cost5 = 55;
                System.out.println("Enter the quantity :");
                quantity = io.nextInt();
                for(int i=1;i<=quantity;i++)
                {
                    tc = cost5*i;
                }
                System.out.println("Your Order : Pavbhaji");
                System.out.println("Total cost :"+tc);
                try {
                    FileWriter fw = new FileWriter("Bill.txt");
                    fw.write("\t\tSHREERAJ MIT");
                    fw.write("\n\t\t   CANTEEN");
                    fw.write("\n\t\tPaud Road Pune");
                    fw.write("\n"+LocalDate.now()+ "   "+sd.format(d)+ "\t\tGauri");
                    fw.write("\nMC#0001\t\t\t\t #"+billno);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nITEM  NAME  WT/QTY  PRICE  AMT  ₹   ");
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nPav Bhaji \t"+quantity+" \t"+cost5+" \t"+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\n                                                                 ₹ "+tc);
                    fw.write("\n---------------------------------------------------");
                    fw.write("\nT QTY :"+quantity+"pcs");
                    fw.write("\nNO OF ITEMS : 1");
                    fw.write("\n\t Thank you, Visit Again");
                    fw.close();
                }catch (IOException e){
                    System.out.println("Failed");
                }
                break;

            default:
                System.out.println("Please enter between 1-5 ");
        }

    }
}
