import java.time.LocalDateTime;

public class Flour extends Material implements Discount  {
    private  int quanlity;

    public Flour(){

    }


    public Flour(String id, String name, float cost,
                 int yearOfManufacture, int monthOfManufacture,int dateOfManufacture,int hourOfManufacture,int minusOfManufacture,
                 int quanlity) {
        super(id, name, cost,yearOfManufacture,monthOfManufacture,dateOfManufacture,hourOfManufacture, minusOfManufacture);
        this.quanlity=quanlity;
    }

    @Override
    public float caculateMoney() {
        return  this.quanlity*this.getCost();
    }

    @Override
    public LocalDateTime caculateExpiryDate() {
        LocalDateTime newDate = LocalDateTime.of(getYearOfManufacture(),getMonthOfManufacture(),getDateOfManufacture(),getHourOfManufacture(),getMinusOfManufacture());
        return newDate.plusDays(365);
    }


    @Override
    public void howToDiscount(int discountNumber) {
        float moneyOfDiscount =this.getCost()*discountNumber/100;
        float newCost=this.getCost()- moneyOfDiscount;
        this.setCost(newCost);
    }
}
