class Enemy {
    private var baseHp = 400
    private var baseMp = 100
    private var baseAtk = 20
    private var currentHp: Int
    private var currentMp: Int
    private var currentAtk: Int

    init {
        currentHp = baseHp
        currentMp = baseMp
        currentAtk = baseAtk
    }

    fun basicAttack(player: Player) {
        player.setCurrentHp(-baseAtk)
        println("L'ennemi a perdu $baseAtk HP!")
    }

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

}