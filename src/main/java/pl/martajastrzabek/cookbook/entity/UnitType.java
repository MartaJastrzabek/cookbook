package pl.martajastrzabek.cookbook.entity;

public enum UnitType {
    GRAM("gram"),
    PIECE("szt."),
    CUP("szklanka"),
    SPOON("łyżka"),
    TEASPOON("łyżeczka"),
    MILILITERS("ml");

    private String name;

    UnitType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
