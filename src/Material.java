import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Material {
    private String id;
    private String name;

    private float cost;

    private int dayOfManufacture =0;
    private int monthOfManufacture=0;
    private int yearOfManufacture=0;


    protected Material(){

    }

    protected Material(String id, String name, float cost, int yearOfManufacture, int monthOfManufacture, int dayOfManufacture){
    this.id=id;
    this.name=name;
    this.cost=cost;
    this.yearOfManufacture=yearOfManufacture;
    this.monthOfManufacture=monthOfManufacture;
    this.dayOfManufacture = dayOfManufacture;

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

    public int getDayOfManufacture() {
        return dayOfManufacture;
    }

    public void setDayOfManufacture(int dayOfManufacture) {
        this.dayOfManufacture = dayOfManufacture;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    public abstract  float caculateMoney();
    public abstract LocalDate caculateExpiryDate();

}
