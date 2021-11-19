package src.main.resources.model;

public class Annonce {

    private String title ;
    private String description;
    private String adress ;
    private String email ;

    public Annonce(String title, String description, String adress, String email) {
        this.title = title;
        this.description = description;
        this.adress = adress;
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
