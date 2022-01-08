abstract class Enemy() {
    internal abstract var baseAtk: Int
    internal abstract var baseHp: Int
    internal abstract var baseDef: Int
    internal abstract var baseMp: Int
    internal var currentHp = 0
    internal var currentAtk = 0
    internal var currentMp = 0
    internal var currentDef = 0

    open fun basicAttack(player: Player) {}

    fun setCurrentHp(value: Int) {
        currentHp += value
    }
    fun getCurrentHp(): Int {
        return currentHp
    }
    fun setCurrentMp(value: Int) {
        currentMp += value
    }
    fun getCurrentMp(): Int {
        return currentMp
    }
    fun setCurrentDef(newDef: Int) {
        currentDef = newDef
    }
    fun getCurrentDef(): Int {
        return currentDef
    }
    fun setCurrentAtk(newAtk: Int) {
        currentAtk = newAtk
    }
    fun getCurrentAtk(): Int {
        return currentAtk
    }

}