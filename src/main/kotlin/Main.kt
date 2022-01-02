import java.util.Scanner

fun main() {

    var enemy = Enemy()
    var player = Player()
    var reader = Scanner(System.`in`)
    var playerAction: Int
    var playerTurn = true

    /*
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
    */
    while (player.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
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
                    playerTurn = false
                } else if (playerAction == 2) {
                    player.setBlockAttack(true)
                    playerTurn = false
                } else {
                    if (player.getCurrentMp() >= 25) {
                        player.heal()
                        playerTurn = false
                    } else {
                        println("Vous n'avez pas assez de MP!")
                    }
                }
            } else {
                println("Entrez une action valide.")
            }
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
    if (enemy.getCurrentHp() == 0) {
        println("Vous avez vaincu l'ennemi!")
    } else {
        println("Vous avez perdu...")
    }
}