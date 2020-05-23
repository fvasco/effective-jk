package jug.java.item16;

public class BestBumperOintmentCompany {

    private String name;

    private String website;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLink() {
        return "<a href='" + website + "'>" + name + "</a>";
    }
}
