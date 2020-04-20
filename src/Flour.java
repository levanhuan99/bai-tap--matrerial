import java.time.LocalDate;


public class Flour extends Material implements Discount  {
    private  int quanlity;

    public Flour(){

    }

    public Flour(String id, String name, float cost,
                 int yearOfManufacture, int monthOfManufacture,int dayOfManufacture,int quanlity) {
        super(id, name, cost,yearOfManufacture,monthOfManufacture,dayOfManufacture);
        this.quanlity=quanlity;
    }

    @Override
    public float caculateMoney() {
        return  this.quanlity*this.getCost();
    }

    @Override
    public LocalDate caculateExpiryDate() {
        LocalDate newDate = LocalDate.of(getYearOfManufacture(),getMonthOfManufacture(), getDayOfManufacture());
        return newDate.plusDays(365);
    }


    @Override
    public void discount(int discountNumber) {
        float moneyOfDiscount =this.getCost()*discountNumber/100;
        float newCost=this.getCost()- moneyOfDiscount;
        this.setCost(newCost);
    }
}
