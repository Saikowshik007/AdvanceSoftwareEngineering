public class AC extends Device{

    String name,Manufacturer,specs;
    
    AC(String name, String Manufacturer,String specs){
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
