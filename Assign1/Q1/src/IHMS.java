class IHMS {
    public static Device getDevice(DeviceType deviceType){

        switch(getRandoManufacturer()){

            case Samsung:
            
                return new SamsungFactory().createDevice(deviceType);

            case GE:
                    return new GEFactory().createDevice(deviceType);
            default:
            return null;

        }
        
    }
    public static Manufacturer getRandoManufacturer() {
        return Manufacturer.values()[(int) (Math.random() * Manufacturer.values().length)];
      }

    
}