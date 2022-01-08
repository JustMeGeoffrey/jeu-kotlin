import java.util.*

class Player {
    private var baseHp = 200
    private var baseMp = 100
    private var baseAtk = 50
    private var baseDef = 20
    private var currentHp: Int
    private var currentMp: Int
    private var currentAtk: Int
    private var currentDef: Int
    private var blockAttack: Boolean
    private var playerTurn = true

    init {
        currentHp = baseHp
        currentMp = baseMp
        currentAtk = baseAtk
        currentDef = baseDef
        blockAttack = false
    }

    fun choixAction(): Int {
        var action: Int
        var reader = Scanner(System.`in`)

        println("Vous possédez ${getCurrentHp()} HP et ${getCurrentMp()} MP.")
        println("1. Attaquer")
        println("2. Bloquer")
        println("3. Soigner")
        print("Choisissez votre action: ")
        action = reader.nextInt()
        return action
    }

    fun realistionAction(action: Int, enemy: Enemy) {
            if (action == 1) {
                basicAttack(enemy)
                setPlayerTurn(false)
            } else if (action == 2) {
                setBlockAttack(true)
                setPlayerTurn(false)
            } else if (action == 3) {
                if (getCurrentMp() >= 25) {
                    heal()
                    setPlayerTurn(false)
                }
            }
        }

    fun basicAttack(enemy: Enemy) {
        var defEnemy: Double = ((100.0/(enemy.getCurrentDef().toDouble()+100.0)))
        println(defEnemy)
        var degats = (getCurrentAtk()*defEnemy).toInt()
        enemy.setCurrentHp(-degats)
        println("L'ennemi a perdu $degats HP!")
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
    fun setBlockAttack(value: Boolean) {
        blockAttack = value
    }
    fun getBlockAttack(): Boolean {
        return blockAttack
    }
    fun setPlayerTurn(value: Boolean) {
        playerTurn = value
    }
    fun getPlayerTurn(): Boolean {
        return playerTurn
    }

}