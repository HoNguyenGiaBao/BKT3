package ute.application.bkt3.DAO;

public class AuthorDAO {
    private int authorImage;
    private String authorName;
    private String authorDes;

    public AuthorDAO(int authorImage, String authorName, String authorDes) {
        this.authorImage = authorImage;
        this.authorName = authorName;
        this.authorDes = authorDes;
    }

    public int getAuthorImage() {
        return authorImage;
    }

    public void setAuthorImage(int authorImage) {
        this.authorImage = authorImage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDes() {
        return authorDes;
    }

    public void setAuthorDes(String authorDes) {
        this.authorDes = authorDes;
    }
}
