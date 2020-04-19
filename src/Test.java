public class Test {
    public static void main(String[] args) {
        Flour flour=new Flour(2018,4,2,4,44);
        System.out.println("thoi gian su dung la "+flour.caculateExpiryDate());

        System.out.println("------------------");

        Meat meat=new Meat(2020,4,10,1,2);
        System.out.println("thoi gian su dung la "+meat.caculateExpiryDate());
    }


}
