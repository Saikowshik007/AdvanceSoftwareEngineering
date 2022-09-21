
public class GEFactory implements Factory{
    public Device createDevice(DeviceType dType) {
        switch(dType){

            case AC:
            return new AC("name","GEFactory","Specs");

            case Dishwasher:
            return new Dishwasher("name","GEFactory","Specs");
            case Refrigerator:
            return new Refrigerator("name","GEFactory","Specs");
            default:
                return null;
        }
        
    }
    
}
