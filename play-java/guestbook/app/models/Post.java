package models;

import siena.*;
import static siena.Json.*;

@Table("Posts")
public class Post extends Model {
    @Id(Generator.AUTO_INCREMENT)
    public Long id;

    @Column("message")
    public String message;

    public Post(String message)
    {
        this.message = message;
    }

    public static Query<Post> all()
    {
        return Model.all(Post.class);
    }

}
