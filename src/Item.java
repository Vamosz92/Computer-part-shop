public class Item {
    
    private String name;
    private String type;
    private int price;
    private int yearOfProduction;
    
    public Item(String _name, String _type, int _price, int _yearOfProduction){
        this.name = _name;
        this.type = _type;
        this.price = _price;
        this.yearOfProduction = _yearOfProduction;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    
    @Override
    public String toString(){
        return this.getName() + " Típus: " + this.getType() + ", Ár: " + this.getPrice() + ", Gyártási év: " + this.getYearOfProduction();
    }
    
    public String toList(){
        return "Típus: " + this.getType() + ", Ár: " + this.getPrice() + ", Gyártási év: " + this.getYearOfProduction();
    }
    
    public String stringToBasket(){
        return this.getName() + ";" + this.getType() + ";" + this.getPrice() + ";" + this.getYearOfProduction();
    }
}
