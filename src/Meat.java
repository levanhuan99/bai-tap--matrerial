import java.time.LocalDate;

public class Meat extends Material implements Discount  {

    private int unit;
    private float weight;


public Meat(String id, String name, float cost,
            int yearOfManufacture, int monthOfManufacture,int dateOfManufacture, int unit,float weight
            ) {
    super(id, name, cost,yearOfManufacture,monthOfManufacture,dateOfManufacture );
    this.unit=unit;
    this.weight=weight;

}
    @Override
    public float caculateMoney() {
        return this.getCost()*this.unit*this.weight;
    }

    @Override
    public LocalDate caculateExpiryDate() {
        LocalDate newDate = LocalDate.of(getYearOfManufacture(),getMonthOfManufacture(), getDayOfManufacture());
        return newDate.plusDays(15);
    }

    @Override
    public void discount(int discountNumber) {
        float moneyOfDiscount =this.getCost()*discountNumber/100;
        float newCost=this.getCost()- moneyOfDiscount;
        this.setCost(newCost);
    }
}
