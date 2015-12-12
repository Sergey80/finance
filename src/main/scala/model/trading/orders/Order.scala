package model.trading.orders

/*
 * An _Investor_'s _instructions_ to a _broker_ or _brokerage firm_
 * to purchase or sell a _Security_.
 *
 * _Orders_ fall into different available types, which allow _investors_
 * to _place_ _restrictions_ on their _orders_
 * affecting the price and time at which the order can be _executed_.
 *
 * */
trait Order {
  // def instructions() : Seq[Instruction]

  def state(): OrderState // "Liquidity" helps ensure that your order will be in that state

} // order could be "placed" online or over the phone


trait OrderState
case object Filled extends OrderState
case object FilledWithMinSlippage extends OrderState
case object FilledWithoutSubstantiallyAffectingPrice extends OrderState

// A trade order instructs (orders) a broker to enter or exit a position.

//








