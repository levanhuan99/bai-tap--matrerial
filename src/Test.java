
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Meat meat1 = new Meat("meat1", "thịt lợn", 10, 2020, 4, 5, 1, 5);
        Meat meat2 = new Meat("meat2", "thịt bò", 20, 2020, 4, 2, 2, 4);
        Meat meat3 = new Meat("meat3", "thịt châu", 30, 2020, 4, 3, 3, 3);
        Meat meat4 = new Meat("meat4", "thịt vịt", 40, 2020, 4, 20, 4, 2);
        Meat meat5 = new Meat("meat5", "thịt gà", 50, 2020, 4, 25, 5, 1);

        Flour flour1 = new Flour("flour1", "bột1", 10, 2019, 11, 15, 1);
        Flour flour2 = new Flour("flour2", "bột2", 20, 2020, 1, 15, 2);
        Flour flour3 = new Flour("flour3", "bột3", 30, 2018, 1, 15, 3);
        Flour flour4 = new Flour("flour4", "bột4", 40, 2020, 2, 15, 4);
        Flour flour5 = new Flour("flour5", "bột5", 50, 2020, 4, 15, 5);


        Material[] materials = new Material[10];
        materials[0] = meat1;
        materials[1] = meat2;
        materials[2] = meat3;
        materials[3] = meat4;
        materials[4] = meat5;
        materials[5] = flour1;
        materials[6] = flour2;
        materials[7] = flour3;
        materials[8] = flour4;
        materials[9] = flour5;

        //số tiền k có chiết khấu
        float totalMoneyBeforDiscount = 0;
        float totalMoneyOfMeatBeforeDiscount = 0;
        float totalMoneyOfFlourBeforeDiscount = 0;

        for (int i = 0; i < materials.length; i++) {
            totalMoneyBeforDiscount += materials[i].caculateMoney();

            if (materials[i] instanceof Meat) {
                Meat meat = (Meat) materials[i];
                totalMoneyOfMeatBeforeDiscount += meat.caculateMoney();
            } else if (materials[i] instanceof Flour) {
                Flour flour = (Flour) materials[i];
                totalMoneyOfFlourBeforeDiscount += flour.caculateMoney();
            }
        }
        System.out.println("tổng số tiền trước khi triết khấu của thịt và bột là là: " + totalMoneyBeforDiscount);
        System.out.println("--------------------");


        System.out.println("tổng số tiền trước khi tiết khấu của thịt  là: " + totalMoneyOfMeatBeforeDiscount);
        System.out.println("-------------------");

        System.out.println("tổng số tiền trước khi tiết khấu của bột là: " + totalMoneyOfFlourBeforeDiscount);
        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("-------------------");

        float totalMoneyOfMeatAfterDiscount = 0;
        float totalMoneyOfFlourAfterDiscount = 0;

        LocalDate today = LocalDate.now();


        for (int i = 0; i < materials.length; i++) {
            if (materials[i] instanceof Meat) {

                Meat meat = (Meat) materials[i];

                if (meat.caculateExpiryDate().isAfter(today)) {//nếu mà muốn cách 5 ngày thì dùng phương thức plusDay()

                    meat.discount(30);

                    totalMoneyOfMeatAfterDiscount += meat.caculateMoney();
                    System.out.println("loại thịt giảm giá 30% là:" + meat.getName() + " ngày hết hạn là: " + meat.caculateExpiryDate() + " giá sau giảm giá là:" + meat.caculateMoney());
                }

                if (meat.caculateExpiryDate().isEqual(today)) {

                    meat.discount(50);

                    totalMoneyOfMeatAfterDiscount += meat.caculateMoney();
                    System.out.println("loại thịt hôm hôm nay giảm giá 50% là:" + meat.getName() + " ngày hết hạn là hôm nay :" + meat.caculateExpiryDate() + " giá sau giảm giá là:" + meat.caculateMoney());

                }
                if (meat.caculateExpiryDate().isBefore(today)) {
                    System.out.println("loại thịt đã hết hạn là " + meat.getName() + " ngày hết hạn là: " + meat.caculateExpiryDate());

                }

            }

            if (materials[i] instanceof Flour) {
                Flour flour = (Flour) materials[i];
                if (flour.caculateExpiryDate().isAfter(today)) {       //nếu mà muốn cách 5 ngày thì dùng phương thức plusDay()

                    flour.discount(30);
                    totalMoneyOfFlourAfterDiscount += flour.caculateMoney();
                    System.out.println("loại bột giảm giá 30% là:" + flour.getName() + " ngày hết hạn là: " + flour.caculateExpiryDate() + " giá sau giảm giá là:" + flour.caculateMoney());
                }

                if (flour.caculateExpiryDate().isEqual(today)) {
                    flour.discount(50);
                    totalMoneyOfFlourAfterDiscount += flour.caculateMoney();
                    System.out.println("loại bột hôm hôm nay giảm giá 50% là:" + flour.getName() + " ngày hết hạn là hôm nay :" + flour.caculateExpiryDate() + " giá sau giảm giá là:" + flour.caculateMoney());

                }
                if (flour.caculateExpiryDate().isBefore(today)) {
                    System.out.println("loại bột đã hết hạn là " + flour.getName() + " ngày hết hạn là: " + flour.caculateExpiryDate());

                }

            }
        }

        System.out.println("giá sau giảm giá của thịt là: " + totalMoneyOfMeatAfterDiscount);
        System.out.println("giá sau giảm giá của bột là: " + totalMoneyOfFlourAfterDiscount);
    }
//        Flour flour=new Flour("flour1", "bột1", 10, 2019, 11, 15, 1);
//        if (flour.caculateExpiryDate().isAfter(today)){
//            System.out.println("đây");
//        }
//        System.out.println(flour.caculateExpiryDate());
//    }


}
