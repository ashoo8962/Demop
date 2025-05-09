package interfaceassign.com.traning.quest5;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone{
    @Override
    public void showApps() {
        System.out.println("Showapp snaps,fb,insta");
    }

    @Override
    public void cameraTypes() {
        System.out.println("selfir rear camera");
    }
}
