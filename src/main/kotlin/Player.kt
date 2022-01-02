class Player {
    private var baseHp = 40
    private var baseMp = 100
    private var baseAtk = 20
    private var currentHp: Int
    private var currentMp: Int
    private var currentAtk: Int
    private var blockAttack: Boolean


    init {
        currentHp = baseHp
        currentMp = baseMp
        currentAtk = baseAtk
        blockAttack = false
    }

    fun basicAttack(enemy: Enemy) {
        enemy.setCurrentHp(-currentAtk)
        println("L'ennemi a perdu $currentAtk HP!")
    }
    fun heal() {
        setCurrentHp(30)
        setCurrentMp(-25)
        println("Vous récupérez 30 HP")
        if (currentHp > baseHp) {
            currentHp = baseHp
            println("Vos HP sont au MAX!")
        }
        if (currentMp < 0) {
            currentMp = 0
        }
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
    fun setBlockAttack(value: Boolean) {
        blockAttack = value
    }
    fun getBlockAttack(): Boolean{
        return blockAttack
    }

}