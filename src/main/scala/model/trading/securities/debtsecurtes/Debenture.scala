package model.trading.securities.debtsecurtes

import model.trading._
import model.trading.client.{Creditor, Debitor}

trait Debenture { // syn: Debt

  def debitor()   : Debitor
  def creditor()  : Creditor
  def interest()  : Money
  def byTime()    : Date

}
