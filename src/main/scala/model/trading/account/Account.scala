package model.trading.account

case class Account(name: String, number:String)

object AccountType extends Enumeration {
  type AccountType = Value
  val Cash, Margin = Value
}
