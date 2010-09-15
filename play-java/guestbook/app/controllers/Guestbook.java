package controllers;

import play.mvc.*;
import java.util.*;
import models.*;
import siena.*;
import java.util.*;

public class Guestbook extends Controller {
    
    public static void index()
    {
        List<Post> posts = Post.all().fetch();
        render(posts);
    }

    public static void sign(String message)
    {
        new Post(message).insert();
        index();
    }
}
