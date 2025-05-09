package interfaceassign.com.traning.quest6;

public class Indian implements ICuisine{

    @Override
    public String[] showMenu(String type) {
        if(type.equals("starters"))
            return new String[]{"soup",};

        else if(type.equals("desserts"))
            return new String[]{"pastry","brownie"};
        else if(type.equals("main course"))
        {
            return new String[]{"roti ","sabji","pao"};

        }

else
    return new String[]{""};

    }
}
