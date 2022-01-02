fun main(args: Array<String>) {

    var enemy = Enemy()
    var player = Player()
    println("L'ennemi possède actuellement ${enemy.hpCurrent}")
    player.basicAttack(enemy)
    println("L'ennemi a désormais ${enemy.hpCurrent}")

}