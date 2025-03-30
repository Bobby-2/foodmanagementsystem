package bean;

public class Food {

    int Foodid, qty;
    String Foodname, description, foodtype, fooddate, expirydate,location;

    public Food() {
    }

    public Food(int Foodid, String Foodname,  String foodtype, String description, int qty, String fooddate, String expirydate,String location) {
        this.Foodid = Foodid;
        this.qty = qty;
        this.Foodname = Foodname;
        this.description = description;
        this.foodtype = foodtype;
        this.fooddate = fooddate;
        this.expirydate =expirydate ;
        this.location =location ;
    }

   

    public int getFoodid() {
        return Foodid;
    }

    public void setFoodid(int Foodid) {
        this.Foodid = Foodid;
    }

    public String getfooddate() {
        return fooddate;
    }

    public void setfooddate(String fooddate) {
        this.fooddate = fooddate;
    }

    public String getexpirydate() {
        return expirydate;
    }

    public void setexpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getFoodname() {
        return Foodname;
    }

    public void setFoodname(String Foodname) {
        this.Foodname = Foodname;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public String getfoodtype() {
        return foodtype;
    }

    public void setfoodtype(String foodtype) {
        this.foodtype = foodtype;
    }
     public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }

}
