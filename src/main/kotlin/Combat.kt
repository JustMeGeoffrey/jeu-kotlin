import java.util.*

class Combat() {

    var player = Player()
    fun choixEnnemi() {
        var reader = Scanner(System.`in`)
        println("Choisissez votre Ennemi:")
        println("1. Skeleton")
        println("2. Goblin")
        var choixEnnemi = reader.nextInt()
        if (choixEnnemi == 1) {
            var enemy = Skeleton()
            deroulementCombat(player, enemy)
        } else {
            var enemy = Goblin()
            deroulementCombat(player, enemy)
        }
    }

    fun deroulementCombat(player: Player , enemy: Enemy) {
        var playerTurn = true
        while (player.getCurrentHp() > 0 && enemy.getCurrentHp() > 0) {
            while (player.getPlayerTurn()) {
                var actionJoueur = player.choixAction()
                player.realistionAction(actionJoueur, enemy)
            }
            if (!player.getBlockAttack()) {
                enemy.basicAttack(player)
            }
            player.setBlockAttack(false)
            player.setPlayerTurn(true)
        }
        if (player.getCurrentHp() <= 0) {
            println("Vous êtes mort...")
        } else {
            println("L'ennemi a été vaincu!")
        }
    }

}
