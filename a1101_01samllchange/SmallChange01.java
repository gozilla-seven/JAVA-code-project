package a1101_01samllchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChange01 {
    public static void main(String[] args) {

        Date date;
        date = new Date();
        double money = 0;
        double sum = 0;
        String delails = "0";
        String key = "";
        boolean loop = true;

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        do {

            System.out.println("==========零钱通菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退     出");

            System.out.println("请选择(1-4)");
            key = scanner.next();

            switch (key){
                case "1" :
                    System.out.println("==========零钱通明细==========");
                    System.out.println(delails);
                    break;
                case "2" :
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    sum = +money;
                    delails += "\n收益入账\t+" + money +"\t"+sdf.format(date) + "\t" + sum;
                    break;
                case "3" :
                    System.out.println("支出对象：");
                    String name = scanner.next();
                    System.out.println("支出金额");
                    double outMoney = scanner.nextDouble();
                    sum -= outMoney;
                    delails += "\n"+ name + "\t-" + outMoney + "\t" +sdf.format(date) + "\t" + sum ;
                    break;
                case "4" :
                    String chioce = "";
                    while (true){
                        System.out.println("你真的要退出吗？n/y");
                        chioce = scanner.next();
                        if ("y".equals(chioce) || "n".equals(chioce))
                            break;
                    }
                    if ("y".equals(chioce)){
                        loop = false;
                        break;
                    }else break;
                default:
                    System.out.println("你输入的信息有错误,重新输入");
            }

        }while (loop);
    }

}
