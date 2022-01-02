class Player {
    var baseHp = 200
    var baseMp = 100
    var baseAtk = 20

    fun basicAttack(ennemi: Enemy) {
        ennemi.hpCurrent -= baseAtk
        println("L'ennemi a perdu $baseAtk HP!")
    }

}