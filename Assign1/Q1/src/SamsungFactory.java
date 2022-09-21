public class SamsungFactory implements Factory{

@Override
    public Device createDevice(DeviceType dType) {
Device device;
        switch(dType){

            case AC:
            device= new AC("Air Conditioner","Samsung","123");
            break;
            case Dishwasher:
            device=new Dishwasher("Dish washer","Samsung","123");
            break;
            case Refrigerator:
            device= new Refrigerator("Refrigerator","Samsung","123");
            break;
            default:
                device=null;
                break;
        }
        return device;
        
    }
    
    
    
}
