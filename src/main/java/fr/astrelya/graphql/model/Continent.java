package fr.astrelya.graphql.model;

public enum Continent {
    Asia("Asia"),
    Europe("Europe"),
    NorthAmerica("North America"),
    Africa("Africa"),
    Oceania("Oceania"),
    Antarctica("Antarctica"),
    South_America("South America");

    private String value;
    Continent(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString(){
        return this.getValue();
    }
    public static Continent customValueOf(String value) {
        for (Continent continent : values()) {
            if (continent.value.equals(value)) {
                return continent;
            }
        }
        throw new IllegalArgumentException("Invalid Continent value: " + value);
    }
}
