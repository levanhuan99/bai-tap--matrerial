import java.time.LocalDateTime;

public class Meat extends Material implements Discount  {

    private int unit;
    private float weight;


public Meat(String id, String name, float cost,
            int yearOfManufacture, int monthOfManufacture,int dateOfManufacture,int hourOfManufacture,int minusOfManufacture,
            int unit,float weight
            ) {
    super(id, name, cost,yearOfManufacture,monthOfManufacture,dateOfManufacture,hourOfManufacture, minusOfManufacture);
    this.unit=unit;
    this.weight=weight;

}
    @Override
    public float caculateMoney() {
        return this.getCost()*this.unit*this.weight;
    }

    @Override
    public LocalDateTime caculateExpiryDate() {
        LocalDateTime newDate = LocalDateTime.of(getYearOfManufacture(),getMonthOfManufacture(),getDateOfManufacture(),getHourOfManufacture(),getMinusOfManufacture());
        return newDate.plusDays(15);
    }


    @Override
    public void howToDiscount(int discountNumber) {
        float moneyOfDiscount =this.getCost()*discountNumber/100;
        float newCost=this.getCost()- moneyOfDiscount;
        this.setCost(newCost);
    }
}
