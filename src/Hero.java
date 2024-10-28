public class Hero {
    private int elixirCost;
    private int healthPoints;
    private int attackDamage;
    private String description;
    private Color heroColor;
    private String heroName;

    public Hero(int elixirCost, int healthPoints, int attackDamage, String description, Color heroColor, String heroName) {
        this.elixirCost = elixirCost;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.description = description;
        this.heroColor = heroColor;
        this.heroName = heroName;
    }
}
