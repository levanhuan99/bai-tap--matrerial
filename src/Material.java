import java.time.LocalDateTime;

public abstract class Material {
    private String id;
    private String name;

    private float cost;

    private int dateOfManufacture=0;
    private int monthOfManufacture=0;
    private int yearOfManufacture=0;
    private int hourOfManufacture=0;
    private int minusOfManufacture=0;


    protected Material(){

    }

    protected Material(String id, String name,  float cost, int yearOfManufacture, int monthOfManufacture,int dateOfManufacture,int hourOfManufacture,int minusOfManufacture){
    this.id=id;
    this.name=name;
    this.cost=cost;
    this.yearOfManufacture=yearOfManufacture;
    this.monthOfManufacture=monthOfManufacture;
    this.dateOfManufacture=dateOfManufacture;
    this.hourOfManufacture=hourOfManufacture;
    this.minusOfManufacture=minusOfManufacture;
    }


    public int getMonthOfManufacture() {
        return monthOfManufacture;
    }

    public void setMonthOfManufacture(int monthOfManufacture) {
        this.monthOfManufacture = monthOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getHourOfManufacture() {
        return hourOfManufacture;
    }

    public void setHourOfManufacture(int hourOfManufacture) {
        this.hourOfManufacture = hourOfManufacture;
    }

    public int getMinusOfManufacture() {
        return minusOfManufacture;
    }

    public void setMinusOfManufacture(int minusOfManufacture) {
        this.minusOfManufacture = minusOfManufacture;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public abstract  float caculateMoney();
    public abstract  LocalDateTime  caculateExpiryDate();

}
