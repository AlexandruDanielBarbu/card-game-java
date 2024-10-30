public class BaseCard {

    private int elixirCost;
    private int healthPoints;
    private int attackDamage;
    private String description;
    private Color unitColor;
    private String unitName;

    private boolean didAttack;
    private boolean isFrozen = false;

    public BaseCard(int elixirCost, int healthPoints, int attackDamage, String description, Color unitColor, String unitName){
        this.elixirCost = elixirCost;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.description = description;
        this.unitColor = unitColor;
        this.unitName = unitName;
    }

    public int getElixirCost(){
        return elixirCost;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public int getAttackDamage(){
        return attackDamage;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public void setDidAttack(boolean didAttack){
        this.didAttack = didAttack;
    }

    public void setIsFrozenStatus(boolean isFrozen) {
        this.isFrozen = isFrozen;
    }

    public void setAttackDamage(int attackDamage){
        this.attackDamage = attackDamage;
    }
}
