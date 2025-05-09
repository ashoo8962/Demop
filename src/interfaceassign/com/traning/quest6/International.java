package interfaceassign.com.traning.quest6;

public class International implements ICuisine{

    @Override
    public String[] showMenu(String type) {
        if(type.equals("starters"))
            return new String[]{"soup","juice"};

        else if(type.equals("desserts"))
            return new String[]{"pastry","cake"};
        else if(type.equals("main course"))
        {
            return new String[]{"noodles","sushi","burger"};

        }
        return new String[]{""};

    }
}
