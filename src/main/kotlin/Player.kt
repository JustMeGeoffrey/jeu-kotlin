class Player {
    private var baseHp = 200
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

    fun basicAttack(enemy: Enemy) {
        enemy.setCurrentHp(-currentAtk)
        println("L'ennemi a perdu $currentAtk HP!")
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