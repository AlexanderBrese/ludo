package de.htwg.se.ludo.util

trait Command {
  def doStep: Unit
  def undoStep: Unit
  def redoStep: Unit
}
