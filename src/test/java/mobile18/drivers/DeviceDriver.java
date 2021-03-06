package mobile18.drivers;

public class DeviceDriver {
    public static String getDeviceDriver(String deviceHost) {

        switch (deviceHost) {
            case "browserstack":
                return BrowserstackMobileDriver.class.getName();
            case "emulation":
                return EmulatorMobileDriver.class.getName();
            case "real":
                return RealMobileDriver.class.getName();
            default:
                throw new RuntimeException("Select device: browserstack / emulation / real");
        }
    }
}
