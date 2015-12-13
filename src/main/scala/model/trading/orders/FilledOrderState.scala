package model.trading.orders

trait FilledOrderState // syn: executedOrderState

case object Filled extends FilledOrderState
case object FilledWithMinSlippage extends FilledOrderState
case object FilledWithoutSubstantiallyAffectingPrice extends FilledOrderState
