public class Dishwasher extends Device{

    String name,Manufacturer,specs;
    
    Dishwasher(String name, String Manufacturer,String specs){
        super(name, Manufacturer, specs);    
    }

    String getName(){
        return name;
    }
    //public String setName(String name);
    String getManufacturer(){
        return Manufacturer;
    }
    String getSpecs(){
        return specs;
    }
    //public void setSpec();
    //public void setManufacturer();
    public String toString(){
        return ""+getName()+""+getManufacturer()+""+getSpecs();
    }

    
}
    
