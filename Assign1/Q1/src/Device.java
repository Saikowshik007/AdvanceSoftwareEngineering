abstract class Device {
    String name,Manufacturer,specs;
    
    Device(String name, String Manufacturer,String specs){
        this.name=name;
        this.Manufacturer=Manufacturer;
        this.specs=specs;
    }
    abstract String getName();

    abstract String getManufacturer();

    abstract String getSpecs();
    @Override
    public String toString(){
        return ""+getName()+""+getManufacturer()+""+getSpecs();
    }
    
}
