package model.trading.orderticket.orders

import model.trading.marketplace.StockExchange
import model.trading.orderticket.orders.FilledOrderState.FilledOrderState
import model.trading.{Time, Price}
import model.trading.securities.Security
import model.trading.transactions.Trade

/*
 * An _Investor_'s _instructions_ to a _broker_ or _brokerage firm_
 * to purchase or sell a _Security_.
 *
 * _Orders_ fall into different available types, which allow _investors_
 * to _place_ _restrictions_ on their _orders_
 * affecting the price and time at which the order can be _executed_.
 *
 * in real life: order could be "placed" online or over the phone
 *
 * Order vs Trade:
 * An _Order_ is the instruction to buy or sell a _currency_ at a specified rate.
 * The _Order_ remains valid until executed or cancelled.
 */


trait Order {

  def side        : OrderSide.Value
  def symbol      : String
  def quantity    : Long
  def price       : Price
  def timeInForce : TimeInForce.Value

  /**
   * To conduct a _trade_ such that it satisfies a client's _order_.
   * A broker _fills_ an _order_ when he/she makes/produce the requested trade.
   * The price at which an order is filled is called a _fill price_.
   *
   *  Fill - The _action_ of completing or satisfying an _order_ for a _security_ or _commodity_.
   *  It is the basic act in _transacting_ stocks, _bonds_ or any other type of _security_.
   *
   *  For example, if a _trader_ places a _buy order_ for a stock at $50 and a seller agrees to the price,
   *  the sale has been made and the order has been filled.
   *
   *  Order filled when (when seller agreed on that price) and whe the sale has been made.
   *
   *  The $50 price is the _execution price_, which also makes it the _fill price_ -
   *  it is the price that allows the transaction to be completed.
   */

//  def fill(price: Price): Order

  /**
   * The execution of an order happens when it is completely filled,
   * not when it is placed by the investor.
  */
//  def execute(market:StockExchange)   : Trade = {
//
//    //this.isFilled
//
//    val aTrade = Trade(this)
//
//    market.trade( aTrade )
//  }
}

// var aState: FilledOrderState = _
// var state = Valid | NotValid

// --

object OrderType extends Enumeration {
  type OrderType = Value
  val Limit = Value
  val Market = Value
  val Stop = Value
  val Standard = Value
  val FillOrKill = Value
}

object OrderSide extends Enumeration {
  type OrderSide = Value
  val Buy, Sell = Value
}

// --
object TimeInForce extends Enumeration { // syn: OrderRule

  type TimeInForce      = Value

  val Day               = Value   // Day - remains open until the end of the trading day. Day Entry Orders cancel automatically at 5 pm ET (New York).

  val GoodTillCancel    = Value   // GTC - order remains open until it is filled or until you cancel it

  val ImmediateOrCancel = Value   // IOC - fills as much of your order as possible at the best available price

  val FillOrKill        = Value   // FOK -  when you want your entire order filled at the best available price
                                  // If the entire order cannot be filled at the best available price, the entire order cancels (no partial orders).

  // Market order has to go wit DayOrder
}


object Orders {

  def marketOrder(side:OrderSide.Value, symbol: String, quantity:Int): MarketOrder = {

    MarketOrder(
      side       =   side,
      symbol       = symbol,
      quantity     = quantity
    )

  }

}


// A trade order instructs (orders) a broker to enter or exit a position.

//


/**
With the growing importance of digital technology and the internet,
  many investors are opting to buy and sell stocks for themselves rather than pay advisors
  large commissions for research and advice.
  */

/*
The order statuses:
  Started — order checked and accepted by Broker
  Placed — Broker took an the order
  Partially filled
  Filled
  Cancelled
  Rejected
  Expired
*/





