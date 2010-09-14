package controllers;

import play.mvc.*;

public class Hello extends Controller {
    
    public static void World()
    {
        String text = "Hello world!";
        render(text);
    }
}
