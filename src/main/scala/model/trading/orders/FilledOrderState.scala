package model.trading.orders

object FilledOrderState extends Enumeration {

  type FilledOrderState = Value

  val Filled = Value
  val FilledWithMinSlippage = Value
  val FilledWithoutSubstantiallyAffectingPrice = Value
}