package pl.martajastrzabek.cookbook.entity;

public enum CategoryName {
    MEATS("dania mięsne"),
    SOUPS("zupy"),
    DESSERTS("desery"),
    SALADS("sałatki"),
    MEAT_FREE("dania bezmięsne"),
    PASTAS("makarony");

    private String name;

    CategoryName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
