public class RipperCard {
    public void weakKnees(Minion enemy, int attackNerf){

        int newAttackDamage = enemy.getAttackDamage() - attackNerf;
        if (newAttackDamage <= 0)
        {
            newAttackDamage = 0;
        }
        enemy.setAttackDamage(newAttackDamage);
    }
}
