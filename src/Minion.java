public class Minion {

    public enum Color{
        RED, BLACK, WHITE
    }

    private int elixirCost;
    private int healthPoints;
    private int attackDamage;
    private String description;
    private Color minionColor;
    private String minionName;


    private boolean didAttack;
    private boolean isFrozen = false;

    public Minion(int elixirCost, int healthPoints, int attackDamage, String description, Color minionColor, String minionName){
        this.elixirCost = elixirCost;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.description = description;
        this.minionColor = minionColor;
        this.minionName = minionName;
    }

    public int getElixirCost(){
        return elixirCost;
    }
}
