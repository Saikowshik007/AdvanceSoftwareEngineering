abstract class Device {
    String name,Manufacturer,specs;
    
    Device(String name, String Manufacturer,String specs){
        this.name=name;
        this.Manufacturer=Manufacturer;
        this.specs=specs;
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
    @Override
    public String toString(){
        return ""+getName()+""+getManufacturer()+""+getSpecs();
    }
    
}
