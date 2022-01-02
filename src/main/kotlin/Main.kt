fun main() {

    var enemy = Enemy()
    var player = Player()

    while (player.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
        println("L'ennemi possède actuellement ${enemy.getCurrentHp()} HP. Vous possédez ${player.getCurrentHp()} HP.")
        player.basicAttack(enemy)
        if (enemy.getCurrentHp() <= 0) {
            println("L'ennemi est mort")
            break
        }
        enemy.basicAttack(player)
        if (player.getCurrentHp() <= 0) {
            println("Vous êtes mort")
            break
        }
    }

}