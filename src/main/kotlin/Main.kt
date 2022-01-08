import java.util.Scanner

fun main() {

    var combat = Combat()
    combat.choixEnnemi()

}

    /* while (player.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
        if (playerTurn) {
            println("L'ennemi possède actuellement ${enemy.getCurrentHp()} HP.")
            println("Vous possédez ${player.getCurrentHp()} HP et ${player.getCurrentMp()} MP.")
            println("1. Attaquer")
            println("2. Bloquer")
            println("3. Soigner")
            print("Choisissez votre action: ")
            playerAction = reader.nextInt()
            if (playerAction in 1..3) {
                if (playerAction == 1) {
                    player.basicAttack(enemy)
                } else if (playerAction == 2) {
                    player.setBlockAttack(true)
                } else {
                    if (player.getCurrentMp() >= 25) {
                        player.heal()
                    } else {
                        println("Vous n'avez pas assez de MP!")
                    }
                }
            } else {
                println("Entrez une action valide.")
            }
            playerTurn = false
        } else {
            if (!player.getBlockAttack()) {
                enemy.basicAttack(player)
            } else {
                println("Vous bloquez l'attaque!")
                player.setBlockAttack(false)
            }
            playerTurn = true
        }
    }
     */
