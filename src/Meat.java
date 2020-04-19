import java.time.LocalDateTime;

public class Meat extends Material implements Discount  {

    private float unit;
    private float weight;

    public Meat( int yearOfManufacture, int monthOfManufacture,int dateOfManufacture,int hourOfManufacture,int minusOfManufacture) {
        super(yearOfManufacture,monthOfManufacture,dateOfManufacture,hourOfManufacture, minusOfManufacture);
    }
    public Meat(String id, String name, float quanlity, float cost){
        super(id, name, quanlity, cost);

    }
    @Override
    public float caculateMoney() {
        return this.getQuanlity()*this.getCost()*this.unit*this.weight;
    }

    @Override
    public LocalDateTime caculateExpiryDate() {
        LocalDateTime newDate = LocalDateTime.of(getYearOfManufacture(),getMonthOfManufacture(),getDateOfManufacture(),getHourOfManufacture(),getMinusOfManufacture());
        return newDate.plusDays(15);
    }


    @Override
    public void howToDiscount() {

    }
}
