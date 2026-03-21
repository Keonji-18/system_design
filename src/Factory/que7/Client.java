package Factory.que7;

public class Client {
//    public static UIFactory getFactory(String theme){
//        switch(theme.toLowerCase()){
//            case "light" : return new LightTheme();
//            case "dark" : return new DarkTheme();
//            default: throw new IllegalArgumentException("Unknown Theme"+theme);
//        }
//
//    }

    public static void main(String[] args) {
//        UIFactory factory = getFactory("light");
        UIFactory factory = new LightTheme();
        Application lightTheme = new Application(factory);
        lightTheme.BuildTheme();

//        UIFactory factory2 = getFactory("dark");
        UIFactory factory2 = new DarkTheme();
        Application darkTheme = new Application(factory);
        darkTheme.BuildTheme();
    }
}
