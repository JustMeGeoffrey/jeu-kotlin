class Goblin() : Enemy() {

    override var baseAtk = 20
    override var baseMp = 60
    override var baseHp = 200
    override var baseDef = 20

    init {
        currentHp = baseHp
        currentMp = baseMp
        currentAtk = baseAtk
        currentDef = baseDef
    }

    override fun basicAttack(player: Player) {
        var defPlayer: Double = ((100.0/(player.getCurrentDef().toDouble()+100.0)))
        println(defPlayer)
        var degats = (getCurrentAtk()*defPlayer).toInt()
        player.setCurrentHp(-degats)
        println("Vous perdez $degats HP!")
    }

}