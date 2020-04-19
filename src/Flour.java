import java.time.LocalDateTime;

public class Flour extends Material implements Discount  {

    public Flour( int yearOfManufacture, int monthOfManufacture,int dateOfManufacture,int hourOfManufacture,int minusOfManufacture) {
        super(yearOfManufacture,monthOfManufacture,dateOfManufacture,hourOfManufacture, minusOfManufacture);
    }

    public Flour(String id, String name, float quanlity, float cost) {
        super(id, name, quanlity, cost);
    }

    @Override
    public float caculateMoney() {
        return this.getQuanlity() * this.getCost();
    }

    @Override
    public LocalDateTime caculateExpiryDate() {
        LocalDateTime newDate = LocalDateTime.of(getYearOfManufacture(),getMonthOfManufacture(),getDateOfManufacture(),getHourOfManufacture(),getMinusOfManufacture());
        return newDate.plusDays(365);
    }


    @Override
    public void howToDiscount() {

    }
}
