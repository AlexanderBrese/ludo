package de.htwg.se.ludo.controller

import de.htwg.se.ludo.model.{PlayerBuilder, Team}
import de.htwg.se.ludo.util.Command

class AddPlayerCommand(name: String, team: Team, controller: Controller) extends Command {
  override def doStep: Unit = controller.players = {
    val builder = PlayerBuilder()
    val player = builder.setPlayerName(name).setPlayerTeam(team).build()
    controller.players.appended(player)
  }

  override def undoStep: Unit = controller.players = controller.players.dropRight(1)

  override def redoStep: Unit = doStep
}
