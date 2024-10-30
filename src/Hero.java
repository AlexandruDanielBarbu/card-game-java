public class Hero extends BaseCard{

    static final int MAX_HP = 31;

    public Hero(int elixirCost, int healthPoints, int attackDamage, String description, Color unitColor, String unitName) {
        super(elixirCost, healthPoints % MAX_HP, attackDamage, description, unitColor, unitName);
    }


}
