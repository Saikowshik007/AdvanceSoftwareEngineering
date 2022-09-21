public class Client {
    public static void main(String[] args) {
        Device device=IHMS.getDevice(DeviceType.AC);
        Device device2=IHMS.getDevice(DeviceType.Dishwasher);
        System.out.println(device.name+" "+device.specs+" "+device.Manufacturer);
        System.out.println(device2.name+" "+device2.specs+" "+device2.Manufacturer);

        
    }
}
