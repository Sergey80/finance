package model.trading.securities.debtsecurtes

import model.trading._
import model.trading.securities.debtsecurtes.core.{Debitor, Creditor}

trait Debenture { // syn: Debt

  def debitor()   : Debitor
  def creditor()  : Creditor
  def interest()  : Money
  def byTime()    : Date

}
